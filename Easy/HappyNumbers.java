import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class HappyNumbers {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\lll.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int num = Integer.parseInt(line.trim());
			int original = num;
			while(true){
				int result=0;
				while(num>0){
					int digit=num%10;
					result=result+(digit*digit);
					num=num/10;
				}
				if(result==1){
					System.out.println("1");
					break;
				} else if(result==4 || result==16 || result==37 || result==58 || result == 89 || result==145 || result==42 || result==20){
					System.out.println("0");
					break;
				}
				num=result;
			}
		}
	}
}
