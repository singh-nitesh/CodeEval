import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SelfDescribingNumber {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\mmm.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int num = Integer.parseInt(line.trim());
			String original = line.trim();
			int position=original.length()-1;
			boolean isSelfDescribing=true;
			while(num>0){
				int digit = num%10;
				if(occurance(original,String.valueOf(position).charAt(0))!=digit){
					isSelfDescribing=false;
				}
				position--;
				num=num/10;
			}
			if(isSelfDescribing){
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
	private static int occurance(String s, char c){
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
		    if( s.charAt(i) == c ) {
		        counter++;
		    } 
		}
		return counter;
	}
}
