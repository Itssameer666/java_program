/*create a BankAccount class with:-
account_no
name
balance
create methods:-
deposit()
withdraw()
display()
use a constructor to initilize the account
*/
import java.util.*;
class BankAccount{
int account_no;
String name;
int balance;
BankAccount(int ano,String aname,int bal){
account_no=ano;
name=aname;
balance=bal;
}
void deposit(){
int d=(balance-5000);
System.out.println("Deposit balance :"+d);
}
void withdraw(){
int w=(balance+2000);
System.out.println("Withdraw balance :"+w);
}
void display_balance(){
System.out.println("Balance :"+balance);
}
}
class BankDemo {
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Account No : ");
int acno=sc.nextInt();
System.out.print("Enter the Accountant Name : ");
String acname=sc.next();
System.out.print("Enter the Balance: ");
int b=sc.nextInt();
BankAccount ba=new BankAccount(acno,acname,b);
ba.deposit();
ba.withdraw();
ba.display_balance();
}
}