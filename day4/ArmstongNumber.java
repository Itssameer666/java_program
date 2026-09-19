import java.util.*;
class  ArmstongNumber{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int sum=0,d;

System.out.print("Enter a Number : ");
int n=sc.nextInt();
int temp=n;
while(n>0){
d=n%10;
sum=sum+d*d*d;
n=n/10;
}
if(sum==temp){
System.out.println(temp+" is Armstrong number");      
}
else{
System.out.println(temp+" is not Armstrong number");      

}
}
}