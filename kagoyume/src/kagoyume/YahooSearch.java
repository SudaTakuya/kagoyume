package kagoyume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import sdk.ResultSet;

//YahooAPIの商品検索機能を利用する処理を行うモデル
public class YahooSearch {

	//検索に使用するパラメータを設定
	private static final String appID = "dj0zaiZpPWIxMk1xUVZ6ZnIyNyZzPWNvbnN1bWVyc2VjcmV0Jng9ZGM-";
	private static final String category_id ="1";
	private static final String hits = "20";
	private static final String offset = "0";
	private static final String image_size = "300";
	private static final String sort = "-score";



	public YahooSearch(){
	}

	public static YahooSearch getInstanse(){
		return new YahooSearch();
	}

	//検索ワードをもとに検索を行うメソッド
	public ResultSet execute(String query) throws InterruptedException{

		//検索条件を格納するHashMap
		Map<String, String> params = new HashMap<String, String>();
		params.put("appid", appID);
		params.put("query", query);
		params.put("category_id", category_id);
		params.put("hits", hits);
		params.put("offset", offset);
		params.put("sort", sort);

		String endpoint = "http://shopping.yahooapis.jp/ShoppingWebService/V1/itemSearch";

		//アクセスするURLを取得
		String url = urlFormat(params,endpoint);

		//検索結果を取得
		ResultSet searchResult = getResultItemSearch(params,url);

		return searchResult;


	}

	//商品コードをもとに指定の商品情報を得るメソッド
	//itemSearchのResultSetがlookUpで使えない（pakage-infoのアノテーションが原因）
	//一時的にパッケージを分けて処理を振り分けている。要修正
	public sdklookup.ResultSet executeByCode(String code) throws InterruptedException{
		//検索条件を格納するHashMap
		Map<String, String> params = new HashMap<String, String>();
		params.put("appid", appID);
		params.put("itemcode",code);
		params.put("image_size", image_size);
		params.put("responsegroup","large");

		String endpoint = "http://shopping.yahooapis.jp/ShoppingWebService/V1/itemLookup";

		//アクセスするURLを取得
		String url = urlFormat(params,endpoint);

		//検索結果を取得
		sdklookup.ResultSet searchResult = getResultLookUp(params,url);

		return searchResult;
	}

	//複数の商品コードから購入履歴のリストを取得するメソッド
	public ArrayList<sdklookup.ResultSet> executeByHistoryCode(List<String> historyCode) throws InterruptedException{

		ArrayList<sdklookup.ResultSet> historyData = new ArrayList<>();

		//検索条件を格納するHashMap
		Map<String, String> params = new HashMap<String, String>();
		params.put("appid", appID);
		params.put("responsegroup","large");

		String endpoint = "http://shopping.yahooapis.jp/ShoppingWebService/V1/itemLookup";


		//検索結果を取得(購入履歴のリストを取得）
		for(String code : historyCode){
			params.put("itemcode",code);
			//アクセスするURLを取得
			String url = urlFormat(params,endpoint);
			sdklookup.ResultSet searchResult = getResultLookUp(params,url);
			historyData.add(searchResult);
		}

		return historyData;
	}


	//検索パラメータをもとにアクセスするURLを作成するメソッド
	private String urlFormat(Map<String,String> params,String endpoint){

		StringBuffer buffer = new StringBuffer();
		for (Iterator<Entry<String,String>> it = params.entrySet().iterator(); it.hasNext();) {
		  Map.Entry<String,String> entry = it.next();
		  String key = entry.getKey();
		  buffer.append(String.format("%s={%s}", key,key));
		  if (it.hasNext()) {
		    buffer.append("&");
		  }
		}
		String url = String.format("%s?%s", endpoint, buffer.toString());

		return url;

	}

	//検索を実行し、検索結果を取得するメソッド(商品検索API用)
	private ResultSet getResultItemSearch(Map<String,String> params, String url) throws InterruptedException{

		RestTemplate restTemplate = new RestTemplate();
		ResultSet response = null;
		int i=0;

		while (i<5) {
		  try {
		    response = restTemplate.getForObject(url, ResultSet.class, params);
		    break;
		  } catch (RestClientException e) {
			  e.printStackTrace();
		    response = new ResultSet();
		    i++;
		  }
		  try {
		    Thread.sleep(500);
		  } catch (InterruptedException e) {
			  throw new InterruptedException("検索に失敗しました");
		  }
		}

		return response;

	}

	//検索を実行し、検索結果を取得するメソッド(商品コード検索API用)
		private sdklookup.ResultSet getResultLookUp(Map<String,String> params, String url) throws InterruptedException{

			RestTemplate restTemplate = new RestTemplate();
			sdklookup.ResultSet response = null;
			int i=0;

			while (i<5) {
			  try {
			    response = restTemplate.getForObject(url, sdklookup.ResultSet.class, params);
			    break;
			  } catch (RestClientException e) {
				  e.printStackTrace();
			    response = new sdklookup.ResultSet();
			    i++;
			  }
			  try {
			    Thread.sleep(500);
			  } catch (InterruptedException e) {
				  throw new InterruptedException("検索に失敗しました");
			  }
			}

			return response;

		}




}
