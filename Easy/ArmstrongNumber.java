import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ArmstrongNumber {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\ppp.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String val = line.trim();
			int result=0;
			for(int i=0;i<val.length();i++){
				result=result+power(Integer.parseInt(String.valueOf(val.charAt(i))), val.length());
			}
			if(result==Integer.parseInt(val)){
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}
	
	private static int power(int num, int pow){
		int result=1;
		for(int i=1;i<=pow;i++){
			result*=num;
		}
		return result;
	}
}
