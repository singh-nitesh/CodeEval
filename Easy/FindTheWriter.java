import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FindTheWriter {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String[] input = line.trim().split("\\|");
            String[] nums = input[1].split(" ");
            char[] inputCharArray = input[0].toCharArray();
            for(int i=0;i<nums.length;i++){
            	if(!nums[i].equalsIgnoreCase("")){
            		int num=Integer.parseInt(nums[i]);
            		System.out.print(inputCharArray[num-1]);
            	}
            }
            System.out.println();
        }
    }
}
