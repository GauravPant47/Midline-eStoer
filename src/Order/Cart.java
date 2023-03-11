package Order;

import ProductDirectory.Product;

public class Cart {
	private String cardId;
	private Product[] listOfProduct;
	

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Product[] getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(Product[] listOfProduct) {
		this.listOfProduct = listOfProduct;

	}
}
