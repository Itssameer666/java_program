import java.util.*;
class MargeOfTwoArray{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [] A=new int[5];
        int [] B=new int[5];
        int [] C=new int[10];
         System.out.print("Enter the first Array Elements :");
        for(int i=0;i<5;i++){
            A[i]=sc.nextInt();
        }
        System.out.print("Enter the first Array Elements :");
        for(int i=0;i<5;i++){
            B[i]=sc.nextInt();
        }
        // marge proccess
        for(int i=0;i<5;i++){
            C[i]=A[i];
        }
        for(int i=0;i<5;i++){
            C[5+i]=B[i];
        }
        System.out.println("Marge Array:");
                for(int i=0;i<10;i++){
                    Arrays.sort(C);
                System.out.print(C[i]+" ");    
            
        }
    }
}