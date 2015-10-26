import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class PassTriangle {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        List<int[]> mainArray = new ArrayList<int[]>();
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            int[] value = new int[input.length];
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < input.length; j++) {
            	value[j]=(Integer.parseInt(input[j]));
            }
            mainArray.add(value);
        }
        for(int i=mainArray.size()-2;i>=0;i--){
        	for(int j=0;j<=i;j++){
        		if(mainArray.get(i+1)[j]>mainArray.get(i+1)[j+1]){
        			mainArray.get(i)[j]=mainArray.get(i+1)[j]+mainArray.get(i)[j];
        		} else {
        			mainArray.get(i)[j]=mainArray.get(i+1)[j+1]+mainArray.get(i)[j];
        		}
        	}
        }
        System.out.println(mainArray.get(0)[0]);
    }
}
