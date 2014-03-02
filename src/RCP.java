import java.util.*;

/*RCP Project
 * ----------
 * Java Rock Scissor Paper Game
 * 
 * Hyunjae,Lee
 * 
 * Version 1.0
 * 
 * 3/1/14 (D/M/Y)
 * 
 * 
 * */

enum Winner {USER,COMPUTER,DRAW}
enum Hands {ROCK,SCISSOR,PAPER}

class Show{
	public String ShowHandType(int hand){
		String handtype=null;
		int h=hand;
		switch(h){
		case 1:
			handtype="Rock";
			break;
		case 2:
			handtype="Scissor";
			break;
		case 3:
			handtype="Paper";
			break;
		}
		return handtype;
	}
}

class DATA{
	private static int COMPUTERWIN;
	private static int USERWIN;
	private static int DRAW;
	public void Input(Winner win){
		Winner w=win;
		switch(w){
		case USER:
			++USERWIN;
			break;
		case COMPUTER:
			++COMPUTERWIN;
			break;
		case DRAW:
			++DRAW;
			break;
		}
	}
	public void Show(){
		System.out.println("Win: "+USERWIN);
		System.out.println("Lose: "+COMPUTERWIN);
		System.out.println("Draw: "+DRAW);
	}
}

class Calculator{
	public int Random(){
		int random=(int)(Math.random()*3)+1;
		return random;
	}
	public void Judge(int user){
		Show sh=new Show();
		DATA data=new DATA();
		Winner win=null;
		int u=user;
		int com=Random();
		int result=u-com;
		System.out.println("You: "+sh.ShowHandType(u)+" Computer: "+sh.ShowHandType(com));
		if(result==-1||result==2){
			win=Winner.USER;
			data.Input(Winner.USER);
			System.out.println("You Win!!");
		} else if(result==0){
			win=Winner.DRAW;
			data.Input(Winner.DRAW);
			System.out.println("Draw;;");
		} else{
			win=Winner.COMPUTER;
			data.Input(Winner.COMPUTER);
			System.out.println("You Lose..");
		}
		return;
	}
}

class Game{
	public Game(){
		Scanner sc=new Scanner(System.in);
		Loop1 : while(true){
			try{
				System.out.println("--Select--");
				System.out.println("1.Rock");
				System.out.println("2.Scissor");
				System.out.println("3.Paper");
				System.out.print(">");
				int select1=sc.nextInt();
				sc.nextLine();
				if(select1<0||select1>3){
					System.out.println("Wrong Select");
					System.out.println("Select Again");
					continue;
				} 
				Calculator calc=new Calculator();
				calc.Judge(select1);
				Loop2 : while(true){
					System.out.println("--Select--");
					System.out.println("1.Resume");
					System.out.println("2.Show Result");
					System.out.println("3.Go Back");
					System.out.print(">");
					int select2=sc.nextInt();
					sc.nextLine();
					if(select2<0||select2>3){
						System.out.println("Wrong Select");
						System.out.println("Select Again");
						continue;
					}
					switch(select2){
					case 1:
						continue Loop1;
					case 2:
						DATA d=new DATA();
						d.Show();
						break;
					case 3:
						return;
					}
				}
			} catch (Exception e){
				System.out.println("Exception occurred");
				break;
			}
		}
	}
}
public class RCP {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("*****Welcome to the RCP Game*****");
	while(true){
		try{
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
				
			} 
			switch(select1){
			case 1:
				Game g=new Game();
				break;
			case 2:
				DATA d=new DATA();
				d.Show();
				break;
			case 3:
				return;
			}
		} catch(Exception e){
			System.out.println("Exception occurred");
			break;
		}
	}
}
}
