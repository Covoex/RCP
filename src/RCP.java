import java.util.*;

/*RCP Project
 * ----------
 * Java Rock Scissor Paper Game
 * 
 * Hyunjae,Lee
 * 
 * 
 * 
 * 
 * 
 * 
 * */

enum Winner {USER,COMPUTER,DRAW}
class Calculator{
	public int Random(){
		int random=(int)(Math.random()*3)+1;
		return random;
	}
	public Winner Judge(int user){
		Winner win=null;
		int u=user;
		int com=Random();
		int result=u-com;
		if(result==-1&&result==2){
			win=Winner.COMPUTER;
		} else if(result==0){
			win=Winner.DRAW;
		} else{
			win=Winner.COMPUTER;
		}
		return win;
	}
}
class Game{
	public Game(){
		Scanner sc=new Scanner(System.in);
		while(true){
			try{
				System.out.println("--Select--");
				System.out.println("1.Rock");
				System.out.println("2.Scissor");
				System.out.println("3.Paper");
				System.out.print(">");
				int select1=sc.nextInt();
				sc.nextLine();
				if(select1<3||select1>3){
					System.out.println("Wrong Choice");
					System.out.println("Select Again");
				}
				Calculator calc=new Calculator();
				Winner win=calc.Judge(select1);
				switch(win){
				case USER:
					System.out.println("You Win!!");
					break;
				case DRAW:
					System.out.println("Draw;;");
					break;
				case COMPUTER:
					System.out.println("You Lose..");
					break;
				}
			} catch (Exception e){
				System.out.println("Exception occurred");
			}
		}
	}
}
public class RCP {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("*****Welcome to the RCP Game*****");
	while(true){
		System.out.println("--Select--");
		System.out.println("1.Start Game");
		System.out.println("2.View Result");
		System.out.println("3.End Game");
		System.out.print(">");
		int select1=sc.nextInt();
		sc.nextLine();
		if(select1<0||select1>3){
			System.out.println("Wrong Select");
			System.out.println("Select Again");
			break;
		} 
		Game g=new Game();
	}
}
}
