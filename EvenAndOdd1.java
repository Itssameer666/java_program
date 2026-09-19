//WAP to create an array of ten numbers by user input.Now search a number in array.
import java.util.*;
class EvenAndOdd{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a[] =new int[10];
int e=0,o=0,n;
System.out.println("Enter the ten Number :");
for(int i=0;i<10;i++){
a[i]=sc.nextInt();
if(a[i]%2==0){
e++;

}
else{
o++;
}
}
System.out.println("Even Number :"+e);
System.out.println("Odd Number :"+o);
}
}