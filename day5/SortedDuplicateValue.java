class SortedDuplicateValue{
public static void main(String [] args){
int arr[]={1,1,2,3,3,4,4};
int k=0;
for(int n=1;n<arr.length;n++){
if(arr[k]!=arr[n]){
k++;
arr[k]=arr[n];
}
}
System.out.println("count : "+(k+1));
System.out.print("Sorted Array : ");
for (int i = 0; i <= k; i++) {
System.out.print(arr[i] + " ");
}
}
}