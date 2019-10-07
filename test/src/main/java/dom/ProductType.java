package dom;

public enum ProductType {
	FOOD("Food", true),
	BOOK("Book", true),
	MED("Medical", true),
	OTHER("Other", false);
	
	
	private String name;
	private boolean exempt;
	
	ProductType(String name, boolean exempt) {
		this.name = name;
		this.exempt = exempt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isExempt() {
		return exempt;
	}

	public void setExempt(boolean exempt) {
		this.exempt = exempt;
	}
	
}
