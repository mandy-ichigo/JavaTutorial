
public class Items {

	public Items(String itemName, Integer itemValue, String itemGenre,Integer itemAvailable, String itemTaxCategory,Float itemTaxLevy) {
		super();
		ItemName = itemName;
		ItemValue = itemValue;
		ItemGenre = itemGenre;
		ItemAvailable = itemAvailable;
		ItemTaxCategory = itemTaxCategory;
		ItemTaxLevy = itemTaxLevy;
	}
	public Items(String itemName, Integer itemValue, String itemGenre,Integer itemAvailable, String itemTaxCategory) {
		super();
		ItemName = itemName;
		ItemValue = itemValue;
		ItemGenre = itemGenre;
		ItemAvailable = itemAvailable;
		ItemTaxCategory = itemTaxCategory;
		ItemTaxLevy = 0f;
	}

	private String ItemName;
	private Integer ItemValue;
	private String ItemGenre;
	private Integer ItemAvailable;
	private String ItemTaxCategory;
	private Float ItemTaxLevy;
	
	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public Integer getItemValue() {
		return ItemValue;
	}

	public void setItemValue(Integer itemValue) {
		ItemValue = itemValue;
	}

	public String getItemGenre() {
		return ItemGenre;
	}

	public void setItemGenre(String itemGenre) {
		ItemGenre = itemGenre;
	}

	public Integer getItemAvailable() {
		return ItemAvailable;
	}

	public void setItemAvailable(Integer itemAvailable) {
		ItemAvailable = itemAvailable;
	}

	public String getTaxCategory() {
		return ItemTaxCategory;
	}

	public void setTaxCategory(String taxCategory) {
		ItemTaxCategory = taxCategory;
	}

	public Float getItemTaxLevy() {
		return ItemTaxLevy;
	}

	public void setItemTaxLevy(Float itemTaxLevy) {
		ItemTaxLevy = itemTaxLevy;
	}

}
