//q5
import java.util.*;
class A{
	static long gcd(long x,long y){
		if(y==0)
		return x;
		else 
		return gcd(y,x%y);
	} 
	static long findLcm(int[] a,int n){
	long p=a[0];
	for(int i=1;i<n;i++)
	p=((a[i]*p)/(gcd(a[i],p)));
	return p;
	} 
public static void main(String args[]){
int arr[]=new int[50];
System.out.println("Enter array length=");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++){
arr[i]=(i+1);
}
System.out.println(findLcm(arr,n)); 
}
}
