import java.util.*;
public class BankManagement
{
public static void main(String[] args) {
   Account obj = new Account(123, "shaad");
   obj.showMenu();
}
}

class Account{
    int acc_num;
    int last_tr;
    String name;
    int balance;
   
    Account(int acc_num, String name){
        name = name;
        acc_num = acc_num;
        balance = 0;
    }
   
    public void deposite(int amount){
       if(amount > 0){
           balance = balance + amount;
           last_tr = amount;
           System.out.println(amount+ " Rs. deposited");
       }    
    }
   
    public void withdraw(int amount){
        if(amount > 0){
            if(amount <= balance){
                balance = balance - amount;
                last_tr = -amount;
                System.out.println(amount+" Rs. withdrawn");
            }
        }
    }
   
    public void getLastTransaction(){
        if(last_tr > 0){
            System.out.println("Deposied: "+last_tr);
        }else if(last_tr < 0){
            System.out.println("withdrawn: "+Math.abs(last_tr));
        }else{
            System.out.println("No transaction occured");
        }
    }
   
    public void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Welcome! "+name);
        System.out.println("Choose any one option");
        System.out.println("A: Check balance");
        System.out.println("B: Deposie");
        System.out.println("C: withdraw");
        System.out.println("D: Check Last Transaction");
        System.out.println("E: Exit");
        System.out.println("=======================================================================");
        System.out.println();
        do{
            option = sc.next().charAt(0);
            switch(option){
                case 'A':
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Current Balance: "+balance);
                    System.out.println("----------------------------------------------------------------");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Enter amount to be deopsited");
                    int depAmount = sc.nextInt();
                    deposite(depAmount);
                    System.out.println("----------------------------------------------------------------");
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Enter amount to be withdrawn");
                    int withAmount = sc.nextInt();
                    withdraw(withAmount);
                    System.out.println("----------------------------------------------------------------");
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("----------------------------------------------------------------");
                    getLastTransaction();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid key enterd! Kindly re-enter the key");
                   
            }
           
        }while(option != 'E');
        System.out.println("Thanks for using the application.");
    }
   
}