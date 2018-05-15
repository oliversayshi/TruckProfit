import java.util.*;

public class Item implements Comparator<Item> {
	
	public int weight;
	public int cost;
	
	public Item(int w, int c) {
		// TODO Auto-generated constructor stub
		weight = w;
		cost = c;
	}

	
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.weight - o2.weight;
	}
	
}
