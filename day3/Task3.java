//WAP to take full name as input and display short name.
import java.util.*;
class Task3{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String name;
int i;
System.out.print("Enter the full nmae :");
name=sc.nextLine();
String [] shname=name.split(" ");
System.out.print("Your short name : ");
for(i=0;i<shname.length-1;i++){
System.out.print(shname[i].charAt(0)+".");
}
System.out.print(shname[shname.length-1]);
}
}