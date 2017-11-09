package model;

public class Product {
	String product_id = "";
	String product_name = "";
	String product_cost = "";
	String product_image = "";
	boolean isActive;
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_cost() {
		return product_cost;
	}
	public void setProduct_cost(String product_cost) {
		this.product_cost = product_cost;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
