package kagoyume;

import java.io.Serializable;

//商品の詳細情報を格納するjavaBeans
public class ItemData implements Serializable{

	private String name;		//商品名
	private String code;		//商品コード
	private int price;			//価格
	private String img_small;	//商品画像（小）のURL
	//private String img_medium;	//商品画像（中）のURL
	private String img_large;	//商品画像（大）のURL
	private String description;//商品説明
	private double reviewRate;	//レビューの評価点
	private int reviewCount;	//レビューした人数
	private String reviewUrl;	//レビューのURL

	public ItemData(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode(){
		return code;
	}

	public void setCode(String code){
		this.code = code;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg_small() {
		return img_small;
	}

	public void setImg_small(String img_small) {
		this.img_small = img_small;
	}

	/*public String getImg_medium() {
		return img_medium;
	}

	public void setImg_medium(String img_medium) {
		this.img_medium = img_medium;
	}*/

	public String getImg_large() {
		return img_large;
	}

	public void setImg_large(String img_large) {
		this.img_large = img_large;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getReviewRate() {
		return reviewRate;
	}

	public void setReviewRate(double reviewRate) {
		this.reviewRate = reviewRate;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public String getReviewUrl() {
		return reviewUrl;
	}

	public void setReviewUrl(String reviewUrl) {
		this.reviewUrl = reviewUrl;
	}




}
