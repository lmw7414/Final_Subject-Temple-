import java.util.Scanner;
public class Adventure_game {
 
  public static void main(String[] args){
   
    System.out.println("Rule : If your zen is bigger than 200 your zen, you win.. you start 0zen..");
    System.out.println("What is your name?");
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();  
   
    
    Player p1 = new Player(name);
    
    System.out.println("Boss :" + p1.name +
      " you were a good worker, I am sad you are leaving the company. "
      + "Good luck on becoming a monk");
    System.out.println("You have $"+p1.dollars+ " and "+p1.zen+"zen points");
    play_game(p1);
    
  }
  public static void play_game(Player p1){
    while (p1.zen <=200){
      Scanner in = new Scanner(System.in);
      System.out.println("What would you like to?");
      System.out.println("Meditate 0$, +1zen -> press 1");
      System.out.println("Help someone -10$, +5zen -> press 2" );
      System.out.println("Work at company +50$, -30zen -> press 3");
      System.out.println("Purchase Temple -> press 4");
      System.out.println("Buy pet.. Randomly the pets give you dollars little bit and little zen.. ");
      System.out.println("You can choose Platypus(오리너구리), Mole(두더지), Swallow(제비), Dog(개)   -> press 5");
      int number = in.nextInt();
      if(number ==1){                   //Meditate
        p1.zen += 1;
        p1.turn +=1;
      }
      if(number == 2){                  // Help someone
    	  if(p1.dollars<=10){
    		  System.out.println("You have not enough money.. Choose other option");
    		  break;
    	  }
        p1.dollars-=10;
        p1.zen+=5;
        p1.turn +=1;
      }
      if(number == 3){                   // Work at company
        p1.dollars+=50;
        p1.zen-=30;
        p1.turn +=1;
      }
      if (number == 4){                  // Buy temple
       p1.Purchase_temple(p1);  
      }
      if (number == 5){                  // Buy pet
    	  p1.Buy_pet(p1);
      }
      p1.Calculating(p1);                // Now you have
      System.out.println("You have $"+ p1.dollars+" and "+p1.zen+ " Zen points");
      System.out.println();

      
    }
    System.out.println("Congrats, You become a master monk in "+p1.turn + " turn");

    
    
  }
}