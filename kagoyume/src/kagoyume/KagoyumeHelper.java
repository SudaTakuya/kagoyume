package kagoyume;

//各処理で共通に行う処理をまとめたクラス
public class KagoyumeHelper {

	private static final String indexURL = "/kagoyume/";
	private static final String loginURL = "/kagoyume/Login";
	private static final String mydataURL = "/kagoyume/MyData";
	private static final String cartURL = "/kagoyume/Cart";

	public KagoyumeHelper(){
	}

	public static KagoyumeHelper getInstanse(){
		return new KagoyumeHelper();
	}

	public String home(){
		return "<p class=\"lead\"><a href=\""+indexURL+"\">トップに戻る</a></p>";
	}

	public String login(String returnURL){
		return "<p class=\"lead\"><a href=\""+loginURL+"?isLogin=false&returnURL="+returnURL+"\">ログイン</a></p>";
	}

	public String logout(String returnURL){
		return "<p class=\"lead\"><a href=\""+loginURL+"?isLogin=true&returnURL="+returnURL+"\">ログアウト</a></p>";
	}

	public String mydata(){
        return "<p class=\"lead\"><a href=\""+mydataURL+"\">マイデータに戻る</a></p>";
    }

	public String cart(){
        return "<p class=\"lead\"><a href=\""+cartURL+"\">お買い物カート</a></p>";
    }

	//発送方法を表すint値を文字列表記に変換する
	public String intToType(int i){
		switch(i){
		case 0:
			return "普通";
		case 1:
			return "速達";
		case 2:
			return "当日";
		}

		return "指定なし";
	}

}
