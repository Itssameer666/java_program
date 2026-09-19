// 0 1 1 2 3 5.........
import java.util.*;
class Task1{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n1=0,n2=1,n3,n,i;
System.out.print("Enter the numbers of terms : ");
n=sc.nextInt();
System.out.print(n1+" "+n2+" ");
for(i=1;i<=(n-2);i++){
n3=n1+n2;
System.out.print(n3+" ");
n1=n2;
n2=n3;
}
}
}