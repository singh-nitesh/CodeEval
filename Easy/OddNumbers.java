import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class OddNumbers {
	public static void main (String[] args) throws IOException {
		for(int i=1;i<=99;i++){
			if(i%2!=0)
				System.out.println(i);
		}
	}
}
