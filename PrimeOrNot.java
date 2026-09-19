import java.util.*;
public class PrimeOrNot {
    void prime(int x){
        int c=0;
        for(int i=1;i<=x;i++){
        if(x%i==0){
            c++;
       }
    }
        if(c==2){
            System.out.println("Number is prime");

        }
        else{
            System.out.println("Number is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        PrimeOrNot p=new PrimeOrNot();
        p.prime(n);
      
    }
    
}
