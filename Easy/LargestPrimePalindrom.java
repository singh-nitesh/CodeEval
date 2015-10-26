
public class LargestPrimePalindrom {
	public static void main (String[] args) {
		int i=1000;
		int result=0;
		while(i>2) {
			boolean isPrime = true;
			for(int j=2;j<i/2+1;j++){
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				if(isPalindrom(i)){
					result=i;
					break;
				}
			}
			i--;
		}
		System.out.println(result);
	}

	private static boolean isPalindrom(int value){
		String stringValue = String.valueOf(value);
		int length = stringValue.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + stringValue.charAt(i);
		if (stringValue.equals(reverse))
			return true;
		else
			return false;
	}
}
