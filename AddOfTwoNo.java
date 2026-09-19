import java.util.*;
public class AddOfTwoNo {
    static int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        int result=add(a,b);
        System.out.print("Sum :"+result);

    }
    
}
