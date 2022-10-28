import java.util.Scanner;
public class Banking {

	public static void main(String[]args) {
	  int balance=5000;
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter your name");
        String name =input.nextLine();
      System.out.println("Hello"+name);
      System.out.println("Enter your account number");
        int acc = input.nextInt();
        int bank=1;
        
    while(bank==1) {
         System.out.println("1 Indian bank");
         System.out.println("2 State bank");
         System.out.println("3 Axis bank");
         System.out.println("4 IOB bank");
         int bak = input.nextInt();
         switch(bak) {
          case 1:
        	  System.out.println("Welcome to Indian bank");
        	  break;
          case 2:	  
        		 System.out.println(" Welcome to State bank");
        		 break;
          case 3:
        	 System.out.println("Welcome to Axis bank");
        	 break;
           case 4:
        	  System.out.println("Welcome to IOB bank");
        	  break;
          }
        	break;  
   }
	
	int a=1;
	while(a==1) {
	  System.out.println("1 Deposite");
	  System.out.println("2 Withdraw");
	  System.out.println("3 Check Balance");
      System.out.println("4Exit");
      System.out.println("Enter your choice");
      int ch = input.nextInt();
      if(ch==1) {
    	  System.out.println("Enter the amount of Deposite");
    	  int Deposite = input.nextInt();
    	  System.out.println("amount deposited sucesfully");
      }
      else if(ch==2){
    	  System.out.println("Enter the amount of withdraw");
    	  int withdraw = input.nextInt();
    	  if(withdraw>balance) {
    	  System.out.println("amount withdraw failure,please chek your amount");
    }
    	  
    	  else {
    		  balance=balance-withdraw;
    		  System.out.println("amount withdraw sucessfully");
    	  }
      }
          else if(ch==3){
    	  
    	  System.out.println("Your balance is"+balance);
      }  
          else if(ch==4) {
        	  System.out.println("ThankYou Visit Again");
        	  break;
       }
          else {
          }
        }
	}
} 
      
      

	  
	   
	   
	   
	   
	
		
	
	


