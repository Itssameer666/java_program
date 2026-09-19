import java.util.*;
class Task1{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter First number : ");
int a=sc.nextInt();
System.out.print("Enter Second number : ");
int b=sc.nextInt();
System.out.print("Enter third number : ");
int c=sc.nextInt();
int g=(a>b && a>c)?a:(b>a && b>c)?b:c;
System.out.println("Gretest number :"+g );

}
}