import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class UniqueElement {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\iii.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] input = line.trim().split(",");
			int previous=Integer.parseInt(input[0]);
			String result = String.valueOf(previous)+",";
			for(int i=0;i<input.length;i++){
				int next = Integer.parseInt(input[i]);
				if(previous<next){
					previous=next;
					result+=previous+",";
				}
			}
			System.out.println(result.substring(0, result.length() - 1));
		}
	}
}
