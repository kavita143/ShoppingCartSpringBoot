package com.example.model;

public class Products {
	
	private int productId;
	private String prodName;
	private String prodDesc;
	private String brand;
	private String imageURL;
	private int price;
	private String discount;
	private String productSize;
	private int	numOfUnits;	
	private int categoryId;
	private int vendorId;
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", brand="
				+ brand + ", imageURL=" + imageURL + ", price=" + price + ", discount=" + discount + ", productSize="
				+ productSize + ", numOfUnits=" + numOfUnits + ", categoryId=" + categoryId + ", vendorId=" + vendorId
				+ "]";
	}
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public int getNumOfUnits() {
		return numOfUnits;
	}
	public void setNumOfUnits(int numOfUnits) {
		this.numOfUnits = numOfUnits;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
