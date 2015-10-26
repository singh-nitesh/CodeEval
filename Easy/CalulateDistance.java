import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CalulateDistance {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String[] input = line.trim().split("\\) \\(");
            String[] input1 = input[0].substring(1).split(",");
            String[] input2 = input[1].substring(0,input[1].length()-1).split(",");
            int input1Val1 =Integer.parseInt(input1[0].trim());
            int input1Val2 =Integer.parseInt(input1[1].trim());
            int input2Val1 =Integer.parseInt(input2[0].trim());
            int input2Val2 =Integer.parseInt(input2[1].trim());
            int calc = (int)Math.sqrt((input1Val1-input2Val1)*(input1Val1-input2Val1)+(input1Val2-input2Val2)*(input1Val2-input2Val2));
            System.out.println(calc);
        }
    }
}
