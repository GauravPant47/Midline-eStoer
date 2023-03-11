package ProductDirectory;

public class Product {

	public String[] allProducts;
	private String productId;
	private String producName;
	private String cost;

	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String[] getAllProducts() {
		return allProducts;
	}

	public void setAllProducts(String[] allProducts) {
		this.allProducts = allProducts;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getproducName() {
		return producName;
	}

	public void setproducName(String producName) {
		this.producName = producName;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}
