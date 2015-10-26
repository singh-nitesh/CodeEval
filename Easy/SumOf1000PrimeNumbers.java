public class SumOf1000PrimeNumbers {
	public static void main (String[] args) {
		int count = 0;
		int i=2;
		long sum=0;
		while(count<1000) {
			boolean isPrime = true;
			for(int j=2;j<i/j+1;j++){
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				sum = sum + i;
				count++;
			}
			i++;
		}
		System.out.println(sum);
	}
}
