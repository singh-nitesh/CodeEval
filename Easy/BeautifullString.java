import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class BeautifullString {
	public static void main (String[] args) throws IOException {
		File file = new File("c:\\aaa.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			char[] input = line.trim().toUpperCase().toCharArray();
			int[] num = new int[26];
			for(int i=0;i<input.length;i++){
				int a= input[i];
				if(a>=65 && a<=90){
					a=a-65;
					num[a]++;
				}
			}
			for(int i=0;i<num.length-1;i++){
				for(int j=i+1;j<num.length;j++){
					if(num[i]>num[j]){
						int temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
			int sum=0;
			for(int i=0;i<num.length;i++){
				if(num[i]!=0){
					sum=sum+(num[i]*(i+1));
				}
			}
			System.out.println(sum);
		}
	}
}
