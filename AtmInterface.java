
import java.util.*;
        class ATM{
     float Balance;
     int PIN = 7890;
     public void checkpin(){
         System.out.println("Enter your pin:");
         Scanner sc = new Scanner(System.in);
         int enterpin= sc.nextInt();
         if(enterpin==PIN){
             menu();
         }
         else{
             System.out.println("Enter a valid pin");
         }

     }
     public void menu(){
         System.out.println("Enter Your Choice:");
         System.out.println("1. Check A/C Balance");
         System.out.println("2. Withdraw Money");
         System.out.println("3. Deposit Money");
         System.out.println("4. Exit");

         Scanner sc = new Scanner(System.in);
         int opt =sc.nextInt();

         if(opt==1){
             checkBalance();
         }
         else if(opt==2){
             withdrawMoney();
         }
         else if(opt==3){
             depositMoney();
         }
         else if(opt==4){
             return;
         }
         else{
             System.out.println("Enter a valid choice");
         }
     }
     public void checkBalance(){
         System.out.println("Balance:"+Balance);
         menu();
     }
     public void withdrawMoney(){
         System.out.println("Enter Amount to Withdraw:");
         Scanner sc =new Scanner (System.in);
         float amount =sc.nextFloat();
         if(amount>Balance){
             System.out.println("Insufficient Balance");
         }
         else{
             Balance= Balance-amount;
             System.out.println("Money Withdrawl Successfully");

         }
         menu();
     }

     public void depositMoney(){
         System.out.println("Enter the Amount for deposit:");
         Scanner sc=new Scanner(System.in);
         float amount = sc.nextFloat();
         Balance=Balance + amount;
         System.out.println("Money Deposited Successfully");

     }

        }

        public class AtmInterface {
            public static void main(String[] args){
                ATM obj =new ATM();
                obj.checkpin();

            }
}