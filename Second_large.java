import java.util.*;
class Second_large{
public static void main(String[] args){
int i,j,n,temp;
Scanner sc=new Scanner (System.in);
System.out.println("enter the length of array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of your array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("the second largest no is:"+a[n-2]);
}
}



