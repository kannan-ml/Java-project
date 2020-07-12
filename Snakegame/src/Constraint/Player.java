package Constraint;

public class Player {
	public String playername;
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	int initialposition;
	public int getInitialposition() {
		return initialposition;
	}
	public void setInitialposition(int initialposition) {
		this.initialposition = initialposition;
	}
	public int getFinalposition() {
		return finalposition;
	}
	public void setFinalposition(int finalposition) {
		this.finalposition = finalposition;
	}
	int finalposition;
	Player(String name){
		this.playername=name;
		this.initialposition=0;
	}
	

}
