package Constraint;

public class Board {
	public void create() {
		int[][] br=ApplicationContext.getInstance().getBoard();
		int fill=1;
		for(int i=0;i<br.length;i++) {
			if(i%2==0) {
				for(int j=0;j<br[0].length;j++) {
					br[i][j]=fill;
					fill+=1;
				}
			}
			else {
				for(int j=br[0].length-1;j>=0;j--) {
					br[i][j]=fill;
					fill+=1;
				}
			}
		}
		ApplicationContext.getInstance().setBoard(br);
	}
}
