package ProductDirectory;

public class Catalogue {
	private Product[] listOfAllProducts;
	private Product[] SellerProduct;

	Category cat = new Category();
	Category cat2 = new Category();
	Category cat3 = new Category();

	public Product[] getlistOfAllProducts() {
		cat.setCategoryName("Clothes");
		cat2.setCategoryName("Electronic");
		cat3.setCategoryName("Furniture");

		Product product1 = new Product();
		product1.setProductId("1");
		product1.setproducName(" Lux Cottswool Men's R-Neck Thermal Top and Lower Set ");
		product1.setCost("250.Rs");
		product1.setCategory(cat);
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setproducName(" Regular Cotton Kurtas ");
		product2.setCost("658.Rs");
		product2.setCategory(cat);

		Product product3 = new Product();
		product3.setProductId("3");
		product3.setproducName(" Venus (India) Electronic Digital ");
		product3.setCost("3456.Rs");
		product3.setCategory(cat2);
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setproducName(" boAt Xtend/Xtend RTL Smartwatch ");
		product4.setCost("1456.Rs");
		product4.setCategory(cat2);

		Product product5 = new Product();
		product5.setProductId("5");
		product5.setproducName(" UHUD CRAFTS Beautiful Antique Wooden Fold ");
		product5.setCost("2850.Rs");
		product5.setCategory(cat3);
		Product product6 = new Product();
		product6.setProductId("6");
		product6.setproducName(" Danish Art Window Beautiful Antique Wooden Stool  ");
		product6.setCost("1150.Rs");
		product6.setCategory(cat3);

		listOfAllProducts = new Product[6];
		listOfAllProducts[0] = product1;
		listOfAllProducts[1] = product2;
		listOfAllProducts[2] = product3;
		listOfAllProducts[3] = product4;
		listOfAllProducts[4] = product5;
		listOfAllProducts[5] = product6;

		return listOfAllProducts;
	}

	public Product[] getSellerProduct() {
		cat.setCategoryName("Clothes");
		cat2.setCategoryName("Electronic");
		cat3.setCategoryName("Furniture");

		Product sellerProduct1 = new Product();
		sellerProduct1.setProductId("1");
		sellerProduct1.setproducName("Van Heusen Men Shirt");
		sellerProduct1.setCost(" 1500 Rs");
		sellerProduct1.setCategory(cat);

		Product sellerProduct2 = new Product();
		sellerProduct2.setProductId("2");
		sellerProduct2.setproducName(" AAROORA Engineered Wood TV Table ");
		sellerProduct2.setCost(" 56404 Rs");
		sellerProduct2.setCategory(cat2);

		Product sellerProduct3 = new Product();
		sellerProduct3.setProductId("3");
		sellerProduct3.setproducName(" Quratory Kneeling Chair for Living Room | Birch Wood ");
		sellerProduct3.setCost(" 5542 Rs");
		sellerProduct3.setCategory(cat3);

		SellerProduct = new Product[3];
		SellerProduct[0] = sellerProduct1;
		SellerProduct[1] = sellerProduct2;
		SellerProduct[2] = sellerProduct3;

		return SellerProduct;
	}

	public void setSellerProduct(Product[] SellerProduct) {
		this.SellerProduct = SellerProduct;
	}

	public void setlistOfAllProducts(Product[] listOfAllProducts) {
		this.listOfAllProducts = listOfAllProducts;
	}

}
