//q7
class A{
public static boolean isPrime(long n){
if((n>2 && n%2==0)){
return false;
}
for (long i = 3; i <= (long)Math.sqrt(n); i += 2) {
if (n % i == 0) {
return false;
}
}
return true;
}

public static void main (String args[]){		
long n=2;
long x=0;
int counter=0;
while(true){
if(counter==10001)
break;
if(isPrime(n)){
x=n;
counter++;
}
n++;
}
System.out.println(x);
}
}
