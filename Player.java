import java.util.Scanner;
public class Player {
	 int dollars =100;
	 int zen;
	 int turn;
	 String name;
	 Temple[] temples = new Temple[0]; 
	 Small_temple[] temples1 = new Small_temple[0]; 
	 public Player(String name){
		 this.name = name;
	 } 
	 
	 public void Purchase_temple(Player p1){
		 Scanner in = new Scanner(System.in);
		 while (true){
			 System.out.println("What do you want to call your temple? ");
			 String temple_name = in.nextLine();
			 System.out.println("A big temple generates $15 and 5 zen each turn.");
			 System.out.println("A small temple generates 3 zen each turn.");
			 System.out.println("Do you want a Big<-$70, Press 1> or Small<-$30, Press 2>temple?");
			 int temple_num = in.nextInt();
			 
			 if(temple_num == 1){
				 p1.dollars-=70;
				 p1.turn+=1;
				 Temple[] big = new Temple[30];
				 for(int i=0; i<30; i++){
					 big[i] = p1.temples[i];
					 break;
				 }
				 
			 }
			 if(temple_num == 2){
				 p1.dollars-=30;
				 p1.turn+=1;
				 Small_temple[] small = new Small_temple[30];
				 for(int i=0; i<small.length; i++){
					 small[i] = p1.temples1[i];
					 break;
				 }
				 break;
			 }
		 }
	 }
	 public static void Calculating(Player p1){
	    	System.out.println("Collecting from all temples..");
	    	for(int i =0; i<p1.temples.length; i++){
	    		System.out.println("Collecting "+p1.temples[i].dollars+ " and "+p1.temples[i].zen
	    				+ " from " + p1.temples[i].name);
	    		p1.dollars+=15;
	    		p1.zen +=5;
	    	}
	    	for(int i =0; i<p1.temples.length; i++){
	    		System.out.println("Collecting "+p1.temples1[i].dollars+ " and "+p1.temples1[i].zen
	    				+ " from " + p1.temples1[i].name);
	    		p1.zen +=3;
	    	}
	    	System.out.println("Done collecting from temples...");
	    }

}
