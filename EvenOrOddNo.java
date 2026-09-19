import java.util.*;
public class EvenOrOddNo {
    static void  evenOrOdd(int x){
        if(x%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
         evenOrOdd(a);

    }
    
}