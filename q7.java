//q7
class A{
public static void main (String args[]){		
       int i =0;
       int num =0;
       int count=0;
       String  primeNumbers = "";
       for (i = 1; i <= 10001; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }
	count++;
	if(count==10001)
	break;	
       }	
       System.out.println("Prime numbers from 1 to 10001 are :"+primeNumbers);
   }
}
