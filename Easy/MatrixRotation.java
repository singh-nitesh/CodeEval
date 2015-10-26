import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MatrixRotation {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] matrixString = line.split(" ");
            int n = (int)Math.sqrt(matrixString.length);
            String[][] matrix=new String[n][n];
            int k=0;
            for(int i=0;i<n;i++) {
            	for(int j=0;j<n;j++) {
            		matrix[i][j]= matrixString[k];
            		k++;
            	}
            }
        	String result="";
        	for(int i=0;i<n;i++) {
            	for(int j=n-1;j>=0;j--) {
            		result = result + matrix[j][i] + " ";
            	}
            }
        	System.out.println(result);
        }
    }
}
