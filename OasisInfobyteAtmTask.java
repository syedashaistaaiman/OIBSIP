import java.util.*;
public class OasisInfobyteAtmTask
{
    public static void main(String args[])
    { 
        Scanner scnnr = new Scanner(System.in);
        
        System.out.println("enter  balance");
        int balanceinyouraccount= scnnr.nextInt(); //amount in user's account
        System.out.println("YOUR CURRENT BALANCE IS "+balanceinyouraccount);
        int pincode=18092023; //user's pin
        System.out.println("Please enter your card pin number: ");
        int password=scnnr.nextInt(); // pin entered by user at atm
        int k=1; // number of attemts to enter pin 
        if(password!=pincode)  //if user have entered wrong pin
        {
            while(true)
            {
                k++;
            System.out.println("    OPPS!!!!     Wrong pin ENTERED!!       ");
            System.out.println("Please TRY AGAIN !!");
            System.out.println("       Re-enter your pin (Max. Attempts :- 3) :      ");
            password=scnnr.nextInt();
            if(k==3) 
            {
                //user will have 3  attempts to re-enter the pin 
            System.out.println("You have crossed maximum number of attempts !!");
            System.out.println("Retry After 24hours or contact your nearest branch!!!!");
            System.exit(0);
            }
            }
        }
        if(password==pincode)//if user have entered correct pin
        {
            System.out.println("                WELCOME                ");  
            while(true)
            {
                System.out.println("Enter 1 for viewing your Transaction History");
                System.out.println("Enter 2 for drawouting money");
                System.out.println("Enter 3 for Depositing money");
                System.out.println("Enter 4 for Transfering money");
                System.out.println("Enter 5 for checking your balance");
                System.out.println("Enter 6 for Quitting");
                System.out.print("Choose what you would like to do ");
                int choicemadebyyou = scnnr.nextInt(); // user's option to 
                int drawout, depositing;
                int transactions=0;
                switch(choicemadebyyou)
                {
                    case 1: //showing transaction history
                    if ( transactions == 0 )
                    {
                        System.out.println("\nEmpty");
                    }
                    else 
                    {
			            System.out.println("number of transaction"+transactions);
                    }
                    break;


                    case 2: // withdrawing cash from user's account                   
                    transactions++;
                    System.out.println("Enter amount you want to drawout : ");
                    drawout=scnnr.nextInt();
                    //checking if balance is less than withdrawal amount or is it zero!
                    if(drawout>balanceinyouraccount||balanceinyouraccount==0)
                    {
                        System.out.printf("Amount entered is not sufficient !!!!!\n");
                        break;
                    }
                    System.out.println("Please collect your amount!!!");
                    balanceinyouraccount=balanceinyouraccount-drawout;                    
                    break;


                    case 3: //depositing amount in user's account                   
                    transactions++;
                    System.out.print("Enter amount to be deposited: ");
                    depositing = scnnr.nextInt();
                    balanceinyouraccount = balanceinyouraccount + depositing;
                    System.out.println("You have deposited Money successfully ");                   
                    break;


                    case 4: //transfering amount to another account                   
                    transactions++;
                    System.out.print("Enter destination account number: ");
                    int destinationAccountNo = scnnr.nextInt();
                    System.out.print("Enter transfer amount: ");
                    int transferingAmount = scnnr.nextInt();
                    System.out.println("The amount is transfered successfully!!!   ");
                    balanceinyouraccount = balanceinyouraccount - transferingAmount;                   
                    break;


                    case 5://checking balance
                    System.out.println("your balance is "+balanceinyouraccount);


                    case 6: //exit
                    System.out.println("THANK YOU!!!! for visiting our ATM!");
                    System.exit(0);
                }
            }
       }
    }
}
