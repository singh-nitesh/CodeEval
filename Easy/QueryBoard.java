import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class QueryBoard {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        int[][] matrix=new int[256][256];
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.trim().toLowerCase().split(" ");
            if("SetCol".equalsIgnoreCase(input[0])){
            	int j =  Integer.parseInt(input[1]);
            	int val = Integer.parseInt(input[2]);
            	for(int k=0;k<256;k++){
            		matrix[k][j]=val;
            	}
            }else if("SetRow".equalsIgnoreCase(input[0])){
            	int i =  Integer.parseInt(input[1]);
            	int val = Integer.parseInt(input[2]);
            	for(int k=0;k<256;k++){
            		matrix[i][k]=val;
            	}
            }else if("QueryCol".equalsIgnoreCase(input[0])){
            	int j =  Integer.parseInt(input[1]);
            	int sum=0;
            	for(int k=0;k<256;k++){
            		sum+=matrix[k][j];
            	}
            	System.out.println(sum);
            }else if("QueryRow".equalsIgnoreCase(input[0])){
            	int i =  Integer.parseInt(input[1]);
            	int sum=0;
            	for(int k=0;k<256;k++){
            		sum+=matrix[i][k];
            	}
            	System.out.println(sum);
            }
        }
    }
}
