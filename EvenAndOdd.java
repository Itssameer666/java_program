//WAP to create an array of ten numbers by user input.Now search a number in array.
import java.util.*;
class EvenAndOdd{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a[] =new int[10];
int c=0,n;

System.out.print("Enter the search number :");
n=sc.nextInt();
System.out.println("Enter the ten Number :");
for(int i=0;i<=10;i++){
a[i]=sc.nextInt();
if(a[i]==n){
c=1;
break;
}
}
if(c==1){
System.out.print("Number is present");
}

else{
System.out.print("Number is not present");
}

}
}