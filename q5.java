class A{
	static long gcd(long x,long y){
		if(y==0)
		return x;
		else 
		return gcd(y,x%y);
	} 
	static long findLcm(long[] a){
	long p=a[0];
	for(int i=1;i<20;i++)
	p=((a[i]*p)/(gcd(a[i],p)));
	return p;
	} 
public static void main(String args[]){
long arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
System.out.println(findLcm(arr)); 
}
}
