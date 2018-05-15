import java.io.*;
import java.util.*;


public class Tester {

	public static void main(String[] args) throws Exception {
		Scanner reader = new Scanner(new File("truck.dat"));
		
		int cases = reader.nextInt();
		reader.nextLine();
		for (int c = 0; c < cases; c++) {
			String line = reader.nextLine();
			Scanner linereader = new Scanner(line);
			
			int capacity = linereader.nextInt();
			//System.out.println(capacity);
			int itemNumber = linereader.nextInt();
			
			Truck truck = new Truck(capacity, itemNumber);
			
			Item items[] = new Item[itemNumber];
			for (int i = 0; i < itemNumber; i++) {
				int weight = linereader.nextInt();
				int value = linereader.nextInt();
				
				Item item = new Item(weight, value);
				items[i] = item;
			}	
			truck.addItems(items);
			truck.run();
			System.out.println(truck.findMax());
		}
		
	}
	
}
