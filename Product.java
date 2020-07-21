class Product{
	int productCode;
	String productName;
	double productPrice;
	char categoryCode;
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
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
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}
	private static int prodCounter=100;
	private int generateProductCode()
	{
		prodCounter=prodCounter+1;
		return prodCounter;
		
	}
	
	public Product(String productName, double productPrice, char categoryCode) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = categoryCode;
		this.productCode= generateProductCode();
	}
	public Product(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = 'E';
		this.productCode= generateProductCode();
		
	}
	
}