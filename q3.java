//q3
class A{
public static void main(String args[]){
int i=0;
long n=600851475143l;
for(i=2;i<=n;i++){
if(n%i==0){
n=n/i;
i--;
}
}
System.out.println(i);
}
}
