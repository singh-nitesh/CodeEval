import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SetIntersection {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\jjj.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] sets = line.trim().split(";");
			String[] set1= sets[0].split(",");
			String[] set2= sets[1].split(",");
			String result=""; 
			for(int i=0;i<set1.length;i++){
				int val1=Integer.parseInt(set1[i]);
				for(int j=0;j<set2.length;j++){
					int val2=Integer.parseInt(set2[j]);
					if(val1==val2){
						result+=set1[i]+",";
						break;
					} 
				}
			}
			if(result.length()>0){
				System.out.println(result.substring(0, result.length() - 1));
			}else{
				System.out.println();
			}
		}
	}
}
