import java.util.*;
public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[3][3];
        int lg=A[0][0],i,j;
        System.out.println("Enter of 3x3 Matrix :");
        for( i=0;i<3;i++){
            for( j=0;j<3;j++){
                A[i][j]=sc.nextInt();
            }
        }
                for( i=0;i<3;i++){
            for( j=0;j<3;j++){
 
                        if(A[i][j]>lg){
                        lg=A[i][j];
            }
        }
    }
        System.out.println("largest element :"+lg);  
}
}