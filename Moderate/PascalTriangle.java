import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class PascalTriangle {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int val = Integer.parseInt(line);
            String result="";
            int[] prev= null;
            for(int i=0;i<=val;i++){
            	int[] arr = new int[i+1];
            	for(int j=0;j<i;j++){
            		if(prev==null){
            			arr[j]=1;
            		} else {
            			if(j==0 || j-1==i){
            				arr[j]=1;
            			} else {
            				arr[j]=(prev[j]+prev[j-1]);
            			}
            		}
            		result+=arr[j]+" ";
            	}
            	prev=arr;
            }
            System.out.println(result);
        }
    }
}
