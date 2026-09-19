class Task1{
    public static void main(String []args){
        int start=2;
        int end=20;
       
        for(int n=start;n<=end;n++){
             int c=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==2){
                System.out.print(n+" ");
            }

        }


    }

}