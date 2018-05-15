import java.util.*;


public class Truck {

	Item[] items;
	int[][] truck;
	
	public Truck(int capacity, int num) {
		// TODO Auto-generated constructor stub
		items = new Item[num];
		truck = new int[num][capacity + 1];
	}
	
	public void addItems(Item[] items) {
		this.items = items;
	}
	
	public void run() {
	
		Item item = items[0];
		
		for (int x = 0; x < truck.length; x++) {
			for (int y = 0; y < item.weight - 2; y++) {
				truck[x][y] = 0;
			}
		}
		
		
		for (int x = 0; x < truck.length; x++) {
			Item currentItem = items[x];
			
			for (int y = 0; y < truck[x].length; y++) {
				
				if (y - currentItem.weight < 0) {
					if (x - 1 < 0) {
						truck[x][y] = 0;
						continue;
					} else {
						truck[x][y] = truck[x - 1][y];
						continue;
					}
				}
				
				if (x - 1 < 0) {
					truck[x][y] = currentItem.cost + truck[x][y - currentItem.weight];
					continue;
				}
				truck[x][y] = Math.max(currentItem.cost + truck[x][y - currentItem.weight], truck[x-1][y]);
			}
		
		}
		/*
		for (int x = 0; x < truck.length; x++) {
			Item currentItem = items[x];
			
			for (int y = 0; y < truck[x].length; y++) {
				System.out.print(truck[x][y] + ", ");
				if (y - currentItem.weight < 0) {
					
				}
				

			}
			System.out.println();
		}
		*/
		
	}
	
	public int findMax() {
		return truck[truck.length - 1][truck[0].length - 1];
	}
	
	
}
