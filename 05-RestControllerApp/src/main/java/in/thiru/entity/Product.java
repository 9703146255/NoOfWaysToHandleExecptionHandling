package in.thiru.entity;

public class Product {

	private String productId;
	private String productName;
	private Double productPrice;

	public Product(String productId, String productName, Double productPrice) {

		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}
