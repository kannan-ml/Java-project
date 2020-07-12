package Constraint;

import java.util.HashMap;
import java.util.Map;

public class SnakePosition {
	public int numberofSnake;
	SnakePosition(int n){
		this.numberofSnake=n;
	}
	public void create() {
		Map<Integer,Integer> hmap=ApplicationContext.getInstance().getSnakeMap();
		hmap.put(62,5);
		hmap.put(33,6);
		hmap.put(49,9);
		hmap.put(88,16);
		hmap.put(41,20);
		hmap.put(56,53);
		hmap.put(98,64);
		hmap.put(93,73);
		hmap.put(95,75);
		ApplicationContext.getInstance().setSnakeMap(hmap);
		
	}

}
