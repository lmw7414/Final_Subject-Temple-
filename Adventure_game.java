import java.util.Scanner;
public class Adventure_game {
  public static void main(String[] args){
    int dollars = 100;
    int zen = 0;
    int turn =0;
    System.out.println("What is your name?");
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    System.out.println("Boss :" + name +" you were a good worker, I am sad you are leaving the company. Good luck on becoming a monk");
    System.out.println("You have $"+dollars+ " and "+zen+"zen points");
    String player =player(dollars, zen, turn);
  }
  public static String player(int dollars, int zen, int turn){
    while (true){
      
      
      Scanner in = new Scanner(System.in);
      System.out.println("What would you like to?");
      System.out.println("Meditate 0$, +1zen -> press 1");
      System.out.println("Help someone -10$, +5zen -> press 2" );
      System.out.println("Work at company +50$, -30zen -> press 3");
      System.out.println("Purchase Temple -> press 4");
      int number = in.nextInt();
      if(number ==1){
        zen += 1;
        turn=turn +1;
      }
      if(number == 2){
        dollars-=10;
        zen+=5;
        turn=turn +1;
      }
      if(number == 3){
        dollars+=50;
        zen-=30;
        turn=turn +1;
      }
      System.out.println("You have $"+ dollars+" and "+zen+ " Zen points");
      if (zen >=100){
        System.out.println("Congrats, You become a master monk in "+turn + " turn");
        
        
        
      }
      
    }
  }
}