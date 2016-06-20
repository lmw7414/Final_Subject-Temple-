import java.util.Scanner;
public class Player {
	 int dollars =100;
	 int zen;
	 int turn;
	 String name;
	 Temple[] temples = new Temple[30];                 //list length
	 Small_temple[] temples1 = new Small_temple[30];    //list length
	 Pet[] platypus = new Pet[10];                      //list length
	 Pet[] mole = new Pet[10];                          //list length
	 Pet[] swallow = new Pet[10];                       //list length
	 Pet[] dog = new Pet[10];                           //list length
	 
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
				 if(p1.dollars<=70){
					 System.out.println("You have not enough money.. Choose other option");
					 break;
				 }
				 p1.dollars-=70;
				 p1.turn+=1;
				 for (int i =0; i<30; i++){
					 if(temples[i] ==null){
						 temples[i] = new Temple (temple_name);
						 
						 break;
					 }
				 
				 }
			 }
			 if(temple_num == 2){
				 if(p1.dollars<=30){
					 System.out.println("You have not enough money.. Choose other option");
					 break;
				 }
				 p1.dollars-=30;
				 p1.turn+=1;
				 for (int i =0; i<30; i++){
					 if(temples1[i] ==null){
					 temples1[i] = new Small_temple(temple_name);
					 
					 break;
				 }
				 }
				
			 }
			 break;
		 }
	 }
	 public void Buy_pet(Player p1){
		 Scanner in = new Scanner(System.in);
		 while (true){
			 System.out.println("What do you want to buy pet "
			 		+ "1.Platypus(오리너구리) 2.Mole(두더지) 3.Swallow(제비) 4.Dog(개)? ");
			 System.out.println("Platypus(오리너구리) give you $5"
			 		+ " 1/5 probability Per turn-> -$10, press 1");
			 System.out.println("Mole(두더지) give you $10"
			 		+ " 1/8 probability per turn-> -$15, press 2 ");
			 System.out.println("Swallow(제비) give you $3"
			 		+ " 1/4 probability per turn-> -$10, press 3");
			 System.out.println("Dog(개) give you $50 "
			 		+ "1/25 probability per turn -> -$30, press 4");
			 int Pet_number = in.nextInt();
			 
			 if(Pet_number ==1){
				 if(p1.dollars<=10){
					 System.out.println("You have not enough money.. Choose other option");
					 break;
				 }
				 System.out.println("What do you want to call your platypus??");
				 Scanner inp = new Scanner(System.in);
				 String platypus_name= inp.nextLine();
				 p1.dollars-=10;
				 p1.turn+=1;
				 for (int i =0; i<10; i++){
					 if(platypus[i] ==null){
					 platypus[i] = new Pet(platypus_name);
					 
					 break;
				 }
				 }
				 
				 
			 }
			 if(Pet_number ==2){
				 if(p1.dollars<=15){
					 System.out.println("You have not enough money.. Choose other option");
					 break;
				 }
				 System.out.println("What do you want to call your mole??");
				 Scanner inp = new Scanner(System.in);
				 String mole_name= inp.nextLine();
				 p1.dollars-=15;
				 p1.turn+=1;
				 for (int i =0; i<10; i++){
					 if(mole[i] ==null){
					 mole[i] = new Pet(mole_name);
					 
					 break;
				 }
				 }
				 
			 }
			 if(Pet_number ==3){
				 if(p1.dollars<=10){
					 System.out.println("You have not enough money.. Choose other option");
					 break;
				 }
				 System.out.println("What do you want to call your swallow??");
				 Scanner inp = new Scanner(System.in);
				 String swallow_name= inp.nextLine();
				 p1.dollars-=10;
				 p1.turn+=1;
				 for (int i =0; i<10; i++){
					 if(swallow[i] ==null){
					 swallow[i] = new Pet(swallow_name);
					 
					 break;
				 }
				 }
			 }
			 if(Pet_number ==4){
				 if(p1.dollars<=30){
					 System.out.println("You have not enough money.. Choose other option");
					 break;
				 }
				 System.out.println("What do you want to call your dog??");
				 Scanner inp = new Scanner(System.in);
				 String dog_name= inp.nextLine();
				 p1.dollars-=30;
				 p1.turn+=1;
				 for (int i =0; i<10; i++){
					 if(dog[i] ==null){
					 dog[i] = new Pet(dog_name);
					 
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
	    	System.out.println();
	    	System.out.println("Collecting my Pet..");
	    	int platypus_num =(int)(Math.random()*4)+1;
	   	 	int Mole_num =(int)(Math.random()*8)+1;
	   	 	int Swallow_num =(int)(Math.random()*4)+1;
	   	 	int Dog_num =(int)(Math.random()*25)+1;
	    	for(int i =0; i<10; i++){
	    		if(p1.platypus[i] == null){
	    			break;
	    		}
	    		if(platypus_num ==1){
		    		p1.dollars+=5;
		    		System.out.println("Platypus(오리너구리) " +p1.platypus[i].name + " get 5dollars!! You earned $5!!!");
		    	}
	    	}
	    	for(int i =0; i<10; i++){
	    		if(p1.mole[i] == null){
	    			break;
	    		}
	    		if(Mole_num ==1){
		    		p1.dollars+=10;
		    		System.out.println("Mole(두더지) "+p1.mole[i].name + " get 10dollars!! You earned $10!!!");
		    	}
	    	}
	    	for(int i =0; i<10; i++){
	    		if(p1.swallow[i] == null){
	    			break;
	    		}
	    		if(Swallow_num ==1){
		    		p1.dollars+=3;
		    		System.out.println("Swallow(제비) "+p1.swallow[i].name+" get 3dollars!! You earned $3!!!");
		    	}
	    	}
	    	for(int i =0; i<10; i++){
	    		if(p1.dog[i] == null){
	    			break;
	    		}
	    		if(Dog_num ==1){
		    		p1.dollars+=50;
		    		System.out.println("Dog(개) "+p1.dog[i].name+ " get 50dollars!! You earned $50!!!");
		    	}
	    	}
	    	
	    	
	    	System.out.println("Done collecting from pets...");
	    }

}
