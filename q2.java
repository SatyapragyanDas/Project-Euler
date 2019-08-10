//q2
class A {
public static void main(String[] args) {
long a=1, b=2,c=0,sum=0;
while(true){
if(a>=4000000)
break;
if(a%2==0)
sum=sum+a;
c=a+b;
a=b;
b=c;
}
System .out.println(sum);
}
}
