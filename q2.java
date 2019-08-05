//q2
class A {
public static void main(String[] args) {
long a=0, b=1,c=0,sum=0;
for (int i=1; i<=4000000;++i){
if(a%2==0)
sum=sum+a;
c=a+b;
a=b;
b=c;
}
System .out.println(sum);
}
}
