//q10
class A{
public static void main(String args[]){
int i=0,j=0;
int sum=2;
for(i=2;i<2000000;i++){
int p=0;
	if(i%2!=0){
		for(j=2;j<=Math.sqrt(i);j++){
			if(i%j==0){
			p=1;
			break;
			}
		}
	if(p!=1){
		sum=sum+i;
	}
	}
}
System.out.println(sum);
}
}
