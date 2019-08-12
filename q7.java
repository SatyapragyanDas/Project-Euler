//q7
class A{
public static boolean isPrime(int n){
for(int i=2;i<n;i++){
if(n%i==0)
return false;
}
return true;
}
public static void main (String args[]){		
int n=2;
int x=0;
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
