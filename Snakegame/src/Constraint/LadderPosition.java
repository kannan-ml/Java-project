package Constraint;

import java.util.Map;

public class LadderPosition {
	public int numberofladder;
	LadderPosition(int n){
		this.numberofladder=n;
	}
	public void create() {
		Map<Integer,Integer> lmap=ApplicationContext.getInstance().getLadderMap();
		lmap.put(2,37);
		lmap.put(27,46);
		lmap.put(10,32);
		lmap.put(51,68);
		lmap.put(61,79);
		lmap.put(65,84);
		lmap.put(71,91);
		lmap.put(81,99);
		ApplicationContext.getInstance().setLadderMap(lmap);		
	}
}
