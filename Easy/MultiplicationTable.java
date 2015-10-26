import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MultiplicationTable {
	public static void main (String[] args) throws IOException {
		for(int i=1;i<=12;i++){
			int[] result = new int[12];
			for(int j=1;j<=12;j++){
				result[j-1]= i*j;
				System.out.format("%4d",i*j);
			}
			System.out.println();
		}
		
	}
}
