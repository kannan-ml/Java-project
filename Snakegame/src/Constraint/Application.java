package Constraint;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Application {
	public void startGame() throws StackOverflowError{
		List<Player> itr=ApplicationContext.getInstance().getPlayerlist();
		for(Player p:itr) {
			int diceroll=ThreadLocalRandom.current().nextInt(1, 6 + 1);
			if(p.finalposition+diceroll<=100) {
				if(p.finalposition+diceroll==100) {
					System.out.println(p.playername+" Won the match");
					return;
				}
				else {
					if(ApplicationContext.getInstance().getSnakeMap().containsKey(p.getFinalposition()+diceroll)) {
						int pos=ApplicationContext.getInstance().getSnakeMap().get(p.getFinalposition()+diceroll);
						System.out.println(p.getPlayername()+"\t"+"rolled a "+diceroll+" "+"and moved from "+p.finalposition+" to "+pos+" SNAKE BITE");
						p.setFinalposition(pos);
						
					}
					else if(ApplicationContext.getInstance().getLadderMap().containsKey(p.getFinalposition()+diceroll)) {
						int pos=ApplicationContext.getInstance().getLadderMap().get(p.getFinalposition()+diceroll);
						System.out.println(p.getPlayername()+"\t"+"rolled a "+diceroll+" "+"and moved from "+p.finalposition+" to "+pos+" LadderJump");
						p.setFinalposition(pos);
						
					}
					else {
					System.out.println(p.getPlayername()+"\t"+"rolled a "+diceroll+" "+"and moved from "+p.finalposition+" to "+(p.finalposition+diceroll));
					p.setFinalposition(p.finalposition+diceroll);
				}
				}
			}
		}
		startGame();
	}
	public void helper(int n) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("Enter the player name");
			String playername=sc.nextLine();
			Player player=new Player(playername);
			ApplicationContext.getInstance().getPlayerlist().add(player);
		}
	}
	public static void main(String[] args) throws IOException {
		Application app=new Application();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		app.helper(n);
		sc.close();
		app.startGame();
	}
}
