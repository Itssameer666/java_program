import java.util.*;
class p1{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int [][] A=new int [3][3];
int [][] B=new int [3][3];
int i;
int j;
int f=0;
System.out.println("Enter the elements of A Matrix :");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter the elements of B Matrix :");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
B[i][j]=sc.nextInt();

}
}
for(i=0;i<3;i++){
for(j=0;j<3;j++){
if(A[i][j]==B[i][j]) {
continue;
}
else {
f=1;
break;
}
}
}

if(f==0){
System.out.println("Both matrices are equals");
}
else{
System.out.println("Both matrices are not equals");
}


}
}