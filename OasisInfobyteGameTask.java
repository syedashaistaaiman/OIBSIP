import java.util.*;
public class OasisInfobyteGameTask {
public static void gameTask() {
Scanner scnnr=new Scanner(System.in);
int min=0;        // min value of range 
int max=100;         // max value of range
int guessmynumber=(int)(Math.random()*(max-min+1)+min);   // number taken by system
System.out.println("how many chances you want?");   
int M=scnnr.nextInt();     // chances given to user by system to guess number
System.out.println("chances you have :"+M);
int j,yournumber;

System.out.println("------------------------------------------------------------");
System.out.println("WELCOME TO MY GAME:GUESSING THE NUMBER");
System.out.println("choose the number between 0 to 100");
System.out.println("     *TAKE THE RISK OR LOSE THE CHANCE*       ");
System.out.println("-----------------------------------------------------------");
for(j=0;j<M;j++)
{
System.out.println("Try to PREDICT number:");
yournumber=scnnr.nextInt();    // number user predict

if(guessmynumber==yournumber) //guessed correct number
{
System.out.println("YES!!! YOUR CORRECT!!");
System.out.println("CONGRATULATIONS!!!!");
}
else if(guessmynumber<yournumber && j!=M-1) // guessed number is greater than number chossen by system
{
System.out.println("The number you have guessed is greater");
System.out.println("The number of attempts you are left with are/is "+(M-1-j));
}
else if(guessmynumber>yournumber && j!=M-1)    //guessed number is greater than number chossen by system
{
System.out.println("The number you have guessed is less ");
System.out.println("The number of attempts you are left with are/is "+(M-1-j));
}
}
if(j==M)     // the chances given to user is finished
{
System.out.println("OOPS!! SORRY YOU ARE OUT OF CHANCES NOW ");
System.out.println("The number which I have from my side is"+guessmynumber);
System.out.println("YOU DIDN'T LOSE THE GAME, YOU JUST RAN OUT OF CHANCES");
}
}
public static void main(String args[]) 
{
gameTask();
}
}