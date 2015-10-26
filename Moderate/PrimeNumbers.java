import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class PrimeNumbers {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int val = Integer.parseInt(line);
            String result = "";
            for(int i=2;i<val;i++){
            	boolean isPrime=true;
            	for(int j=2;j<i/j+1;j++){
    				if(i%j==0) {
    					isPrime=false;
    					break;
    				}
    			}
            	if(isPrime){
            		result+=i+",";
            	}
            }
            System.out.println(result.substring(0,result.length()-1));
        }
    }
}
