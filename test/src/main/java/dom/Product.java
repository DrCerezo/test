package dom;

public class Product {
	private String name;
	private ProductType productType;
	private boolean imported;
	private double totalPrice;
	
	public Product(String name, ProductType productType, boolean imported, double totalPrice) {
		super();
		this.name = name;
		this.productType = productType;
		this.imported = imported;
		this.totalPrice = totalPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
