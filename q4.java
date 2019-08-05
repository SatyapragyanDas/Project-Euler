//q4
class A{
static  int checkpallindrome(int n){
 int x,sum=0,temp;     
  temp=n;    
  while(n>0){    
   x=n%10;    
   sum=(sum*10)+x;    
   n=n/10;    
  }    
  if(temp==sum)    
   return 1;    
  else    
   return 0;    
} 
public static void main(String args[]){
int a=999;
int b=999;
int c=0,d=0;
for(a=999;a>100;a--){
 for(b=999;b>100;b--){
   c=a*b;
    d=A.checkpallindrome(c);
   if(d==1)
   break; 
 }
if(d==1)
break;
}
System.out.println("The Answer is: "+c);
 }
}
