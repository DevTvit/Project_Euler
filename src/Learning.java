
public class Learning {
	public static void main(String[] args) {
	
	 
	int num1,num2,m1,m2,mult1,mult2,x;
	String y = "ab12312312313ssss";
	x = 12;
	num1=3;
	num2=5;
	m1 = 0;
	m2 = 0;
	mult1 = 1;
	mult2 = 1;
	while(num1*mult1<1000) {
		m1 = m1 + num1*mult1;
		mult1++;
	}
	while(num2*mult2<1000) {
		m2 = m2 + num2*mult2;
		mult2++;
	}
	{
	x = m1 + m2;
	
	System.out.println(x);
	}
		
		//System.out.println("madafaka");
	/*int var1 = 2;
	int var2 = 2;
	if ((var1 > 1) && (var2>1))
		System.out.println("DOBRZE KURWA");
	else
		System.out.println("èLE KURWA");*/
		
		
	/*	int count = 0;
				for (int x = 3; x<1000;x++)
				{
				  if ( x%3 == 0 || x % 5 ==0) {
					  count += x;
				  }
				}				System.out.println(count);*/
}}