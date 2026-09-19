import java.util.*;
public class CubeOfNo {
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        int result=cube(a);
        System.out.print("Cube of Number :"+result);

    }
    
}

