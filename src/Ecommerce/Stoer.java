package Ecommerce;

import java.util.Scanner;

import Order.Cart;
import ProductDirectory.Catalogue;
import ProductDirectory.Product;
import User.Custumoer;
import User.Seller;

public class Stoer {
	public static void main(String[] args) {
		System.out.println("<---Wellcome to the Midline eStoer--->");
		System.out.println("witch user are you? 1. Custumer 2.Seller 3.Admin");
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		String typeOfUser;
		if (choise == 1) {
			Custumoer customer = new Custumoer();
			System.out.println("What is your userId: ");
			sc.nextLine();
			customer.setUserId(sc.nextLine());
			System.out.println("What is your Password: ");
			customer.setPassword(sc.nextLine());
			if (customer.verifyUser() == true) {
				System.out.println("Your Id is Verify: ");
				while (true) {
					System.out.println("Do you want to: 1.View Products 2.View Card 3.Contact Us 4.Exit");
					choise = sc.nextInt();

					if (choise == 1) {
						System.out.println("Choose Category...");
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getlistOfAllProducts();
						System.out.println("1.Clothes 2.Electronic 3.Furniture ");
						sc.nextLine();
						int choseCategory = sc.nextInt();
						String selected = "";
						if (choseCategory == 1) {
							selected = "Clothes";
						} else if (choseCategory == 2) {
							selected = "Electronic";
						} else if (choseCategory == 3) {
							selected = "Furniture";
						}
						for (int i = 0; i < allProducts.length; i++) {
							if (allProducts[i].getCategory().getCategoryName() == selected) {
								System.out
										.println(allProducts[i].getProductId() + " " + allProducts[i].getproducName()
												+ " "
												+ allProducts[i].getCost());
							}
						}
						System.out.println("Do you want to add any product to the card? Y/N...");
						sc.nextLine();
						String addToCart = sc.nextLine();
						if (addToCart.equals("Y")) {
							System.out.println("Input the product id of the product which you want to add to cart...");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId)) {
									cartProducts[0] = allProducts[i];
								}
							}
							Cart cart = new Cart();
							cart.setCardId("1");
							cart.setListOfProduct(cartProducts);
							customer.setCart(cart);
							System.out.println("<----The Product is successfully added to the cart---->");

						}
					} else if (choise == 2) {
						Product[] cartProducts = customer.getCart().getListOfProduct();
						System.out.println(customer.getCart().getCardId());
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println(i);
							System.out
									.println(
											cartProducts[i].getProductId() + " " + cartProducts[i].getproducName() + " "
													+ cartProducts[i].getCost());
						}
						System.out.println("Do you want to checkout? Y/N...");
						sc.nextLine();
						String checkout = sc.nextLine();

						if (checkout.equals("Y")) {
							for (int i = 0; i < cartProducts.length; i++) {
								String pId = cartProducts[i].getProductId();
								String cuId = customer.getUserId();
								System.out.printf(
										"<----Your oder Id iS %s for user Id %s is Successfully pleced---->\n", pId,
										cuId);
							}
							System.out.println("<-----Creating Recipt----->");
							System.out.println("<-----Recipt Created----->");
							System.out.println("\n<---Thank you for visiting our eCommerce store!--->\n");
						}

					} else if (choise == 3) {
						System.out.println("To contact us, please email on store@Midline.com");

					} else if (choise == 4) {
						break;
					} else {
						System.out.println("Invalid choise , please try again! ");
					}
				}
			}

		} else if (choise == 2) {
			Seller seller = new Seller();
			System.out.println("What is your userId: ");
			sc.nextLine();
			seller.setUserId(sc.nextLine());
			System.out.println("What is your Password: ");
			seller.setPassword(sc.nextLine());
			if (seller.verifyUser() == true) {
				System.out.println("Your Id is Verify: ");
				while (true) {
					System.out.println("Do you want to: 1.View Your Products 2.Add a Product 3.Contact Us 4.Exit");
					choise = sc.nextInt();
					if (choise == 1) {
						Catalogue catalogueS = new Catalogue();
						Product[] sellerProduct = catalogueS.getSellerProduct();
						for (int i = 0; i < sellerProduct.length; i++) {
							System.out.println(sellerProduct[i].getProductId() + " " + sellerProduct[i].getproducName()
									+ " " + sellerProduct[i].getCost());
						}
					} else if (choise == 2) {

						System.out.println("Add new Product In your Catalogue...\n");
						System.out.println("Choose which products you have: ");
						String setproductId = sc.nextLine();
						Catalogue catalogueAdd = new Catalogue();
						Product[] SellerAdded = catalogueAdd.getSellerProduct();

						System.out.println("1.Clothes 2.Electronic 3.Furniture ");
						int updateProductType = sc.nextInt();
						String selected = "";
						if (updateProductType == 1) {
							selected = "Clothes";
						} else if (updateProductType == 2) {
							selected = "Electronic";
						} else if (updateProductType == 3) {
							selected = "Furniture";
						}
						for (int i = 0; i < SellerAdded.length; i++) {
							if (SellerAdded[i].getCategory().getCategoryName() == selected) {
								System.out.println(SellerAdded[i].getProductId() + " " + SellerAdded[i].getproducName()
										+ " " + SellerAdded[i].getCost());
							}
						}
						System.out.println("Do you want to Upload Your product: Y/N...");
						sc.nextLine();
						String addToCart = sc.nextLine();
						if (addToCart.equals("Y")) {
						}
						Product[] addProduct = new Product[3];
						for (int i = 0; i < addProduct.length; i++) {
							if (SellerAdded[i].getProductId().equals(setproductId)) {
								SellerAdded[0] = addProduct[i];
							}
							seller.setProductList(SellerAdded);
						}
						System.out.println("Product are Successfully added....");

					} else if (choise == 3) {
						System.out.println("Do you have a any Problem Please contact us Seller@Midline.com ");
					} else if (choise == 4) {
						break;

					} else {
						System.out.println("Invalid choise , please try again! ");
					}
				}
			}
		} else if (choise == 3) {
			typeOfUser = "Admin";
			System.out.println("Chack All Product Prsess.1");
			int completedAllproduct = sc.nextInt();
			if (completedAllproduct == 1) {
				Catalogue catalogueAdmin = new Catalogue();
				Product[] showC = catalogueAdmin.getlistOfAllProducts();
				for (int i = 0; i < showC.length; i++) {
					System.out
							.println(showC[i].getProductId() + " " + showC[i].getproducName() + " "
									+ showC[i].getCost());
				}
				Product[] showS = catalogueAdmin.getSellerProduct();
				for (int i = 0; i < showS.length; i++) {
					System.out
							.println(showS[i].getProductId() + " " + showS[i].getproducName() + " "
									+ showS[i].getCost());
				}

			} else {
				System.out.println("Invalid choise , please try again! ");
			}

		} else {
			System.out.println("Invalid choise , please try again! ");
		}

	}
}
