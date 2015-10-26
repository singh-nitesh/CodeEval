import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DigitStatics {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int a = Integer.parseInt(line.split(" ")[0]);
            long n = Long.parseLong(line.split(" ")[1]);
            long[] value= new long[10];
            int[] rep= new int[4];
            for(int i=1;i<=4;i++){
            	long val = a;
            	val = (int)Math.pow(a, i);
            	rep[i-1]=(int)(val%10);
            }
            long val = (n/4);
            for(int i=0;i<4;i++){
            	value[rep[i]]+=val;
            }
            int vale = (int)(n%4);
            for(int i=0;i<vale;i++){
            	value[rep[i]]++;
            }            
            System.out.println("0: "+value[0]+", 1: "+value[1]+", 2: "+value[2]+", 3: "+value[3]+", 4: "+value[4]+", 5: "+value[5]+", 6: "+value[6]+", 7: "+value[7]+", 8: "+value[8]+", 9: "+value[9]);
        }
    }
}
