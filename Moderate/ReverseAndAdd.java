import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReverseAndAdd {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            long val = Integer.parseInt(line);
            int count=0;
            while(true){
            	count++;
            	val = val+ reverse(val);
            	if(isPalindrom(val)){
            		break;
            	}
            }
            System.out.println(count+" "+val);
        }
    }
	
	private static long reverse(long val){
		String value = String.valueOf(val);
		String result="";
		for(int i=0;i<value.length();i++){
			result=value.charAt(i)+result;
		}
		return Long.parseLong(result);
	}
	
	private static boolean isPalindrom(long val){
		if(val==reverse(val)){
			return true;
		} else {
			return false;
		}
	}
}
