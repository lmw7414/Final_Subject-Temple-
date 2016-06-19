import java.util.Scanner;
public class Player {
	 int dollars =100;
	 int zen;
	 int turn;
	 String name;
	 Temple[] temples = new Temple[30]; 
	 Small_temple[] temples1 = new Small_temple[30]; 
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
				 for (int i =0; i<30; i++){
					 if(temples[i] ==null){
						 temples[i] = new Temple (temple_name);
						 i = i+1;
						 break;
					 }
				 
				 }
			 }
			 if(temple_num == 2){
				 p1.dollars-=30;
				 p1.turn+=1;
				 for (int i =0; i<30; i++){
					 if(temples1[i] ==null){
					 temples1[i] = new Small_temple(temple_name);
					 i = i+1;
					 break;
				 }
				 }
				
			 }
			 break;
		 }
	 }
	 public static void Calculating(Player p1){
	    	System.out.println("Collecting from all temples..");
	    	
	    	for(int i =0; i<30; i++){
	    		if(p1.temples[i] == null){
	    			break;
	    		}
	    		System.out.println("Collecting $15 and 5zen  from " + p1.temples[i].name);
	    		p1.dollars+=15;
	    		p1.zen +=5;
	    	}
	    	for(int i =0; i<30; i++){
	    		if(p1.temples1[i] == null){
	    			break;
	    		}
	    		System.out.println("Collecting and 3zen from " + p1.temples1[i].name);
	    		p1.zen +=3;
	    	}
	    	System.out.println("Done collecting from temples...");
	    }

}
