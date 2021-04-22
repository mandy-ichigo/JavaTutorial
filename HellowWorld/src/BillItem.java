
public class BillItem {
public BillItem(String itemName, Integer itemCost, Float itemTaxLevy) {
		super();
		ItemName = itemName;
		ItemCost = itemCost;
		ItemTaxLevy = itemTaxLevy;
		ItemTax = itemCost*itemTaxLevy/100;
		ItemQuantity = 0;
	}

	private String ItemName;
	private Integer ItemCost;
	private Float ItemTaxLevy;
	private Float ItemTax;
	private Integer ItemQuantity;

	public Integer getItemQuantity() {
		return ItemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		ItemQuantity = itemQuantity;
	}

	public void Display() {
		System.out.println(this.ItemName+" "+this.ItemCost*this.ItemQuantity+" "+this.ItemTax*this.ItemQuantity);
	}
	public Integer CalculateCost()
	{
		return this.ItemCost*this.ItemQuantity;
	}
	public Float CalculateTax()
	{
		return this.ItemTax*this.ItemQuantity;
	}
}
