//q10
class A{
public static boolean isPrime(long n) {

        if((n > 2 && n % 2 == 0)){
            return false;
        }

        for (long i = 3; i <= (long)Math.sqrt(n); i += 2) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
public static void main(String args[]){
long n=3;
long sum=2;
while(n<2000000){
if(isPrime(n))
sum=sum+n;
n++;
}
System.out.println(sum);
}
}
