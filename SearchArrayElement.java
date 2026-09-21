import java.util.*;
class SearchArrayElement{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Search number : ");
int n=sc.nextInt();
int arr[]={1,2,3,4,5};
int c=0;
for(int i=0;i<arr.length;i++){
if(arr[i]==n){
c=1;
break;
}
}
if(c==1){
System.out.println("Number is present in array");
}
else{
System.out.println("Number is not present in array");
}
}
}
