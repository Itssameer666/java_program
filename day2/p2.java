import java.util.Scanner;
class palindrome{
public static void main(String [] args){
 Scanner sc=new Scanner(System.in);
 String rev="",str;
 System.out.println("Enter the str :");
 str=sc.nextLine();
 for(int i=str.length()-1;i>=0;i--){
 rev =rev+str.charAt(i);
 }
if(str.equals(rev)){
 System.out.println("String is palindrome");
}
else
{
System.out.println("String is not palindrome");
}
       
}

}