package ProductDirectory;

public class Category {
	private String categoryName;
	private Category [] subCategory;
	
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category[] getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(Category[] subCategory) {
		this.subCategory = subCategory;
	}

	
}
