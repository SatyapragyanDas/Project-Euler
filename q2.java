//q2
class A {
public static void main(String[] args) {
long a=1, b=2,c=0,sum=2;
for (long i=1; i<=4000000;++i){
c=a+b;
if(a%2==0)
sum=sum+a;
a=b;
b=c;
}
System .out.println(sum);
}
}
