//q4
class A{
static  boolean checkpallindrome(int n){
 int x,sum=0,temp;     
  temp=n;    
  while(n>0){    
   x=n%10;    
   sum=(sum*10)+x;    
   n=n/10;    
  }    
  if(temp==sum)    
   return true;    
  else    
   return false;    
} 
public static void main(String args[]){
int a=0;
int b=0;
int c=0,d=0;
int max=-1;
for(a=100;a<1000;a++){
 for(b=100;b<1000;b++){
   c=a*b;
   if((c>max)&(checkpallindrome(c)))
   max=c; 
 }
}
System.out.println("The Answer is: "+max);
 }
}
