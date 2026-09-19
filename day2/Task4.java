import java.util.Scanner;

class Task4 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int [] AR=new int[10];
        int [] EAR=new int[10];
        int [] OAR=new int[10];
        int i,n1=0,n2=0;
        System.out.print("Enter the 10 numbers : ");
        for(i=0;i<10;i++){
            AR[i]=sc.nextInt();
            if(AR[i]%2==0){
                EAR[n1]=AR[i];
                n1++;
            }
            else{
                OAR[n2]=AR[i];
                n2++;
            }
        }
        System.out.println("Even numbers : ");
        for(i=0;i<n1;i++){
            System.out.print(EAR[i]+" ");
        }
        System.out.println();
        System.out.println("Odd numbers : ");
        for(i=0;i<n2;i++){
            System.out.print(OAR[i]+" ");
        }

    }
}
