import java.util.Scanner;

public class Infinity {
	int cash = 10000;
	int level2 = cash-680;
	int level3 = cash-900;
	int level4 = cash-1100;
	int level5 = cash-1480;
	int level6 = cash-1680;
	int level7 = cash-1900;


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Infinity obj = new Infinity();
		obj.userFunction();
		
	}	
	public void userFunction() {
		//this is user function
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		System.out.println("Hii "+name);
		//this is executing function
		System.out.println("you have Rs.10000-/- in cash for our purchase items");
		System.out.println("you are choose any one Thief or Police: ");
		String user = sc.nextLine();
		user = user.toUpperCase();
		if(user.equals("POLICE")) {
			System.out.println("congratulations "+name+" you are choose is Police");
			System.out.println("Choose your wepon: "+"\n"+" 1.pistel "+"\n"+" 2.AWM"+"\n"+" 3.AKM"+"\n"+" 4.M416");
			String user1 = sc.nextLine();
			user1 = user1.toLowerCase();
			if(user1.equals("pistel")) {
				System.out.println("you are choose pistel");
				System.out.println("ubgrade pistel level1,level2,level3,level4,level5,level6,level7");
				System.out.println("if you need upgrad,witch level you need you are purchase item");
				System.out.println("Pistel Upgrade info: "+"\n"+"level2: "+"\n"+"     Rs: 680"+"\n"+"     Damage = 35"+"\n"+"     Fire Rate = 0.14"+"\n"+"     DPS = 259");
				System.out.println("level3: "+"\n"+"     Rs: 900"+"\n"+"     Damage = 70"+"\n"+"     Fire Rate = 0.30"+"\n"+"     DPS = 359");

				String user2 = sc.nextLine();
				user2 = user2.toLowerCase();
			
				if(user2.equals("level2")) {
					System.out.println("you are upgrade in Level2. your pistel has level1 to upgrade level 2.Balance Amount is "+level2);					
				}
				else if(user2.equals("level3")) {
					System.out.println("you are upgrade in Level3. your pistel has level1 to upgrade level 2.Balance Amount is "+level3);					
				}
				else if(user2.equals("level4")) {
					System.out.println("you are upgrade in Level4. your pistel has level1 to upgrade level 2.Balance Amount is "+level4);					
				}
				else if(user2.equals("level5")) {
					System.out.println("you are upgrade in Level5. your pistel has level1 to upgrade level 2.Balance Amount is "+level5);					
				}
				else if(user2.equals("level6")) {
					System.out.println("you are upgrade in Level6. your pistel has level1 to upgrade level 2.Balance Amount is "+level6);					
				}
				else if(user2.equals("level7")) {
					System.out.println("you are upgrade in Level7. your pistel has level1 to upgrade level 2.Balance Amount is "+level7);					
				}
			}
			else if(user1.equals("awm")) {
				System.out.println("you are choose AWM");
				System.out.println("ubgrade pistel level1,level2,level3,level4,level5,level6,level7");
				System.out.println("if you need upgrad,witch level you need you are purchase item");
				System.out.println("Pistel Upgrade info: "+"\n"+"level2: "+"\n"+"     Rs: 680"+"\n"+"     Damage = 35"+"\n"+"     Fire Rate = 0.14"+"\n"+"     DPS = 259");
				String user3 = sc.nextLine();
				user3 = user3.toLowerCase();
			
				if(user3.equals("level2")) {
					System.out.println("you are upgrade in Level2. your pistel has level1 to upgrade level 2.Balance Amount is "+level2);					
				}
				else if(user3.equals("level3")) {
					System.out.println("you are upgrade in Level3. your pistel has level1 to upgrade level 2.Balance Amount is "+level3);					
				}
				else if(user3.equals("level4")) {
					System.out.println("you are upgrade in Level4. your pistel has level1 to upgrade level 2.Balance Amount is "+level4);					
				}
				else if(user3.equals("level5")) {
					System.out.println("you are upgrade in Level5. your pistel has level1 to upgrade level 2.Balance Amount is "+level5);					
				}
				else if(user3.equals("level6")) {
					System.out.println("you are upgrade in Level6. your pistel has level1 to upgrade level 2.Balance Amount is "+level6);					
				}
				else if(user3.equals("level7")) {
					System.out.println("you are upgrade in Level7. your pistel has level1 to upgrade level 2.Balance Amount is "+level7);					
				}
			}
			else if(user1.equals("akm")) {
				System.out.println("you are choose AKM");
				System.out.println("ubgrade pistel level1,level2,level3,level4,level5,level6,level7");
				System.out.println("if you need upgrad,witch level you need you are purchase item");
				System.out.println("Pistel Upgrade info: "+"\n"+"level2: "+"\n"+"     Rs: 680"+"\n"+"     Damage = 35"+"\n"+"     Fire Rate = 0.14"+"\n"+"     DPS = 259");
				String user4 = sc.nextLine();
				user4 = user4.toLowerCase();
			
				if(user4.equals("level2")) {
					System.out.println("you are upgrade in Level2. your pistel has level1 to upgrade level 2.Balance Amount is "+level2);					
				}
				else if(user4.equals("level3")) {
					System.out.println("you are upgrade in Level3. your pistel has level1 to upgrade level 2.Balance Amount is "+level3);					
				}
				else if(user4.equals("level4")) {
					System.out.println("you are upgrade in Level4. your pistel has level1 to upgrade level 2.Balance Amount is "+level4);					
				}
				else if(user4.equals("level5")) {
					System.out.println("you are upgrade in Level5. your pistel has level1 to upgrade level 2.Balance Amount is "+level5);					
				}
				else if(user4.equals("level6")) {
					System.out.println("you are upgrade in Level6. your pistel has level1 to upgrade level 2.Balance Amount is "+level6);					
				}
				else if(user4.equals("level7")) {
					System.out.println("you are upgrade in Level7. your pistel has level1 to upgrade level 2.Balance Amount is "+level7);					
				}
			}
			else if(user1.equals("m416")) {
				System.out.println("you are choose M416");
				System.out.println("ubgrade pistel level1,level2,level3,level4,level5,level6,level7");
				System.out.println("if you need upgrad,witch level you need you are purchase item");
				System.out.println("Pistel Upgrade info: "+"\n"+"level2: "+"\n"+"     Rs: 680"+"\n"+"     Damage = 35"+"\n"+"     Fire Rate = 0.14"+"\n"+"     DPS = 259");
				String user5 = sc.nextLine();
				user5 = user5.toLowerCase();
			
				if(user5.equals("level2")) {
					System.out.println("you are upgrade in Level2. your pistel has level1 to upgrade level 2.Balance Amount is "+level2);					
				}
				else if(user5.equals("level3")) {
					System.out.println("you are upgrade in Level3. your pistel has level1 to upgrade level 2.Balance Amount is "+level3);					
				}
				else if(user5.equals("level4")) {
					System.out.println("you are upgrade in Level4. your pistel has level1 to upgrade level 2.Balance Amount is "+level4);					
				}
				else if(user5.equals("level5")) {
					System.out.println("you are upgrade in Level5. your pistel has level1 to upgrade level 2.Balance Amount is "+level5);					
				}
				else if(user5.equals("level6")) {
					System.out.println("you are upgrade in Level6. your pistel has level1 to upgrade level 2.Balance Amount is "+level6);					
				}
				else if(user5.equals("level7")) {
					System.out.println("you are upgrade in Level7. your pistel has level1 to upgrade level 2.Balance Amount is "+level7);					
				}
			}
			else {
				System.out.println("Error: Choose corect weapon");
			}
			
			
		}
		else {
			System.out.println("congratulations "+name+" you are choose is Thief");
			System.out.println("Choose your wepon: "+"\n"+" 1.pistel "+"\n"+" 2.knife"+"\n"+" 3.SMG"+"\n"+" 4.LOCKER open tool");
			String user2 = sc.nextLine();
			user2 = user2.toUpperCase();
			if(user2.equals("Pistel")){
				System.out.println("you are choose pistel");
			}
			if(user2.equals("Knife")){
				System.out.println("you are choose Knife");
			}
			if(user2.equals("SMG")){
				System.out.println("you are choose SMG");
			}
			if(user2.equals("Locker open tool")){
				System.out.println("you are choose locker open tool");
			}
			else {
				System.out.println("Error: Enter correct word");
			}
		}
	  }
	
}
