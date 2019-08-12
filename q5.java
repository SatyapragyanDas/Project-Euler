//q5
class A{
public static int findLcm(int[] a){
int lcm=0;
boolean found;
int i=1;
while(true){
	found=true;
	for(int j=0;j<20;j++){
		if(i%a[j]!=0){
		found=false;
		break;
		}
	}
	if(found){
	lcm=i;
	break;
	}
	i++;
	}
return lcm;
}
public static void main(String args[]){
int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
System.out.println(findLcm(a));
}
}
