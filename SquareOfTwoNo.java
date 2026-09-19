import java.util.*;
public class SquareOfTwoNo {
    static int square(int x){
        return x*x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        int result=square(a);
        System.out.print("Square of Number :"+result);

    }
    
}

