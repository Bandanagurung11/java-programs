import java.util.Scanner;
class Array
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
System.out.println("enter 5 element of array");
for(int i=0; i<=5-1; i++)
{
arr[i]=sc.nextInt();
}
System.out.println("greatest of array:");
for(int i=0; i<=5-1; i++)
{
for(int j=i+1; j<=5-1; j++)
{
if(arr[j]>arr[i])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println(arr[0]);

}
}
