import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CountingPrimes {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int val1 = Integer.parseInt(line.split(",")[0]);
            int val2 = Integer.parseInt(line.split(",")[1]);
            int count=0;
            for(int i=val1;i<=val2;i++){
            	boolean isPrime=true;
            	for(int j=2;j<i/j+1;j++){
    				if(i%j==0) {
    					isPrime=false;
    					break;
    				}
    			}
            	if(isPrime){
            		count++;
            	}
            }
            System.out.println(count);
        }
    }
}
