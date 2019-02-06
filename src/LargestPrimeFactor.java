//public class LargestPrimeFactor {
//	public static void main(String[] args) {
//	long n=600851475143L;
//		for( int i=1 ; i<n; i++) {
//			if(n%i==0) {
//			//	n=n/i;
//			}}
//			System.out.println(i);}}

//	Boolean flag  = true;
//		for (long i = n/2; i>1 ; i--){
//			if (n%i == 0) {
//			for (long j = 2; j < i; j ++){
//			flag = false;
//			if (i % j == 0)
//			{  break;}
//			System.out.println(i);
//}}}}}
			// long x = n ;

//	----------
	
//			long i = 2 ;
//			 while (i <= n/2) { 
//			 if (n % i == 0) {
//				 n = n/i; }
//				 else i +=1;}
//			 System.out.println(n);}}

public class LargestPrimeFactor {
	public static void main(String[] args) {
	long n=600851475143L;
		for( int i=1 ; i<n; i++) {

			if(n%i==0  ) {	
				n=n/i;}}
			System.out.println(n);
			
			}}