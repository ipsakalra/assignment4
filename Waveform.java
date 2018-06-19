class Waveform{
void swap(int arr[],int a,int b){
int temp=arr[a];
arr[a]=arr[b];
arr[b]=temp;
}
void sortwave(int arr[],int n){
for(int i=0;i<n;i+=2){
if(i>0 && arr[i-1]>arr[i])
swap(arr,i-1,i);
if(i<n-1 && arr[i]<arr[i+1])
swap(arr,i,i+1);
}
}
public static void main(String[] args){
Waveform w=new Waveform();
int arr[]={1,2,3,4,5,6,7,8};
int n=arr.length;
w.sortwave(arr,n);
for(int i : arr)
{
System.out.print(i+" ");
}
}
}




