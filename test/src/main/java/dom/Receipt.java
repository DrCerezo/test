package dom;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Receipt {
	private static final String LINE_SEPARATOR = "\n";
	
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);
	}
	
	public String buildReceipt() {
		Locale.setDefault(Locale.US);
		StringBuilder resultBuilder = new StringBuilder();
		double totalTaxesPart = 0.0;
		double totalReceipt = 0.0;
		for(Product product : products) {
			resultBuilder.append(product.getAmount());
			if(product.isImported()) {
				resultBuilder.append(" "+Product.IMPORTED);
			}
			resultBuilder.append(" "+product.getName()+": ");
			double priceProduct = product.getTaxedPrice();
			resultBuilder.append(String.format("%.2f",priceProduct));			
			resultBuilder.append(LINE_SEPARATOR);
			totalReceipt += priceProduct;
			totalTaxesPart += product.getTaxedPart();
		}
		resultBuilder.append("Sales Taxes: ");
		resultBuilder.append(String.format("%.2f", Product.roundToFraction(totalTaxesPart,20)));
		resultBuilder.append(LINE_SEPARATOR);
		
		resultBuilder.append("Total: ");
		resultBuilder.append(String.format("%.2f", totalReceipt));
		resultBuilder.append(LINE_SEPARATOR);
		return resultBuilder.toString();
	}
}
