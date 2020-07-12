package Constraint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ApplicationContext {
	public static ApplicationContext ac;
	private Map<Integer,Integer> snakeMap=new HashMap<Integer,Integer>();
	private Map<Integer,Integer> ladderMap=new HashMap<Integer,Integer>();
	private List<Player> playerlist=new ArrayList<>();
	public List<Player> getPlayerlist() {
		return playerlist;
	}

	public void setPlayerlist(List<Player> playerlist) {
		this.playerlist = playerlist;
	}

	private int[][] board=new int[10][10];
	
	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public Map<Integer, Integer> getLadderMap() {
		return ladderMap;
	}

	public void setLadderMap(Map<Integer, Integer> ladderMap) {
		this.ladderMap = ladderMap;
	}

	public Map<Integer, Integer> getSnakeMap() {
		return snakeMap;
	}

	public void setSnakeMap(Map<Integer, Integer> snakeMap) {
		this.snakeMap = snakeMap;
	}

	public static ApplicationContext getInstance() {
		if(ac==null) {
			ac=new ApplicationContext();
			LadderPosition lp=new LadderPosition(8);
			lp.create();
			SnakePosition sp=new SnakePosition(9);
			sp.create();
			Board bb=new Board();
			bb.create();
			return ac;
		}
		return ac;
		
	}

}
