import java.util.Scanner;

/**
 * @author Hyunjae Lee
 */

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
