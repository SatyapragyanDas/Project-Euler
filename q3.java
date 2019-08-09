//q3
class A{
public boolean isPrime(long m){
long q=2;
while(q<m){
if(m%q==0)
return false;
q++;
}
return true;
}
public static void main(String args[]){
A p=new A();
long n=600851475143l;
long d=2;
long temp;
while(d<=n){
temp=n%d;
if((temp==0)&(p.isPrime(temp)))
System.out.println(d+"  ");
d++;
}
}
}  
