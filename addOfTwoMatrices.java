//WAP to find subtraction of two matrix 
import java.util.*;
class addOfTwoMatrices
{
 public static void main(String [] args)
{
 Scanner sc=new Scanner(System.in);
 int [][] A=new int[3][3];
 int [][] B=new int[3][3];
 int [][] C=new int[3][3];
 System.out.println("Enter matrix A of 3x3");
  for(int i=0;i<3;i++)
   {
     for(int j=0;j<3;j++){
    A[i][j]=sc.nextInt();
       }
   }
 System.out.println("Enter matrix B of 3x3");
  for(int i=0;i<3;i++)
   {
     for(int j=0;j<3;j++){
    B[i][j]=sc.nextInt();
    C[i][j]=A[i][j]+B[i][j];
       }
   }
System.out.println("Subtraction of two matrix");
 for(int i=0;i<3;i++){
     for(int j=0;j<3;j++){
    System.out.print(C[i][j]+" ");
}
   System.out.print("\n");
   }

}
}
