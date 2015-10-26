/* Sample code to read in test cases:*/
import java.io.*;
public class Fizzbuzz {
    public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] input = line.split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int count = Integer.parseInt(input[2]);
            String output = new String();
            for(int i=1;i<=count;i++){
            	if(i%x==0 && i%y!=0){
            		output = output + "F ";
            	} else if(i%x!=0 && i%y==0){
            		output = output + "B ";
            	} else if(i%x==0 && i%y==0){
            		output = output + "FB ";
            	} else{
            		output = output + i+" ";
            	}
            }
            System.out.println(output.trim());
        }
    }
}
