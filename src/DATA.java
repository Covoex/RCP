/**
 * @author Hyunjae Lee
 */

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
