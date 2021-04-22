import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HellowWorld {

	public static void main(String[] args) throws IOException {
		
		//Input Reader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//String name = reader.readLine();
		String name = "Mandy";
		
		//String Builder
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		stringBuilder.append(" "+name+". ");
		stringBuilder.append("\n");
		stringBuilder.append("Welcome to Peronal Shopping. ");
		System.out.println(stringBuilder);
		
		ArrayList<Items> items = new ArrayList<>();
		
		Items item = new Items("Pineapples",3,"Fruit",5, "categoryA");
		Items item2 = new Items("Bananas Dozen",5,"Fruit",3, "categoryA");
		Items item3 = new Items("Let Us A",5,"Book",4, "categoryB",10f);
		Items item4 = new Items("Let Us B",7,"Book",4, "categoryB",10f);
		Items item5 = new Items("Avengers",10,"Movie",2, "categoryC",20f);
		Items item6 = new Items("Spiderman",15,"Movie",1, "categoryC",20f);
		
		items.add(item);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		
		//System.out.println(items.size());
		
		ArrayList<BillItem> items_bought = new ArrayList<>();
		
		System.out.println("We have below items in Inventory -\nSr\tItem\t\t\tDepartment\tCost\tAvailable");
		
		
		Integer index =0; 
		
		while(true)
		{
			index=0;
			for(Items item_object : items)
			{
				System.out.println(++index+"\t"+item_object.getItemName() +"\t\t"+ item_object.getItemGenre() +"\t\t"+ item_object.getItemValue()+"\t"+item_object.getItemAvailable());
			}
			
			System.out.println("\nWhat will you have - Type 0 for nothing");
			Integer itemNumber;
			while(true)
			{
				itemNumber = Integer.parseInt(reader.readLine());
				if(itemNumber >=0 && itemNumber <7)
					break;
				System.out.println("Please chose valid Item.");
			}
			if(itemNumber == 0)
				break;
			
			Items itemBought = items.get(itemNumber-1); 
			
			BillItem billItem = new BillItem(itemBought.getItemName(),itemBought.getItemValue(),itemBought.getItemTaxLevy());
			
			
			System.out.println("How many do you want -");
			Integer itemQuantity;
			while(true)
			{
				itemQuantity = Integer.parseInt(reader.readLine());
				if(itemBought.getItemAvailable() >= itemQuantity)
					break;
				System.out.println("Please chose valid quantity.");
			}
			
			itemBought.setItemAvailable(itemBought.getItemAvailable() - itemQuantity);
			billItem.setItemQuantity(billItem.getItemQuantity() + itemQuantity);

			items_bought.add(billItem);
		}
		
		index = 0;
		Integer totalCost=0;
		Float totalTax=0f; 
		for(BillItem billItem : items_bought)
		{
			billItem.Display();
			totalCost += billItem.CalculateCost();
			totalTax +=billItem.CalculateTax();
		}
		System.out.println("Total Cost is :"+totalCost);
		System.out.println("Total Tax is :"+totalTax);
		System.out.println("Total Bill is :"+ (totalCost+totalTax));
		
				
	}

}
