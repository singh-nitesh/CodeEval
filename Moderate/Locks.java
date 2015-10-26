import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Locks {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int input = Integer.parseInt(line.split(" ")[0]);
            int val = Integer.parseInt(line.split(" ")[1]);
            int[] array = new int[input];
            for(int i=0;i<val;i++){
            	if(i==val-1){
            		array[input-1]=array[input-1]==0?1:0;
            	} else {
            		for(int j=1;j<input;j+=2){
            			array[j]=1;
            		}
            		for(int j=2;j<input;j+=3){
            			array[j]=array[j]==0?1:0;
            		}
            	}
            }
            int count=0;
            for(int i=0;i<input;i++){
            	if(array[i]==0){
            		count++;
            	}
            }
            System.out.println(count);
        }
    }
}
