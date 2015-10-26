import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FindTheHighestScore {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\hhh.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			// Process line of input Here
			String[] rows = line.trim().split("\\|");
			int[] result = new int[rows[0].trim().split(" ").length];
			for(int i=0;i<rows.length;i++){
				String[] row = rows[i].trim().split(" "); 
				for(int j=0;j<row.length;j++){
					int val=Integer.parseInt(row[j]);
					if(i==0) {
						result[j]=val;
					} else if(result[j]<val) {
						result[j]=val;
					}
				}
			}
			String resultString="";
			for(int i=0;i<result.length;i++){
				resultString=resultString+result[i]+" ";
			}
			System.out.println(resultString.trim());
		}
	}
}
