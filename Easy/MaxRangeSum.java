import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MaxRangeSum {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int days=Integer.parseInt(line.split(";")[0]);
            String[] values =line.split(";")[1].split(" ");
            int maxResult=0;
            for(int i=0;i<values.length;i++){
            	int result=0;
            	if(i+days>values.length)
            		break;
            	for(int j=i;j<i+days;j++)
            		result+=Integer.parseInt(values[j]);
            	if(result>maxResult){
            		maxResult=result;
            	}
            }
            System.out.println(maxResult>0?maxResult:0);
        }
    }
}
