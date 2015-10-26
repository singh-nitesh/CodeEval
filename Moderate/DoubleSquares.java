import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DoubleSquares {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line = buffer.readLine();
        int linecount = Integer.parseInt(line);
        while (linecount!=0) {
        	linecount--;
        	line = buffer.readLine();
        	int val = Integer.parseInt(line);
        	int count=0;
        	int val1 = (int)Math.sqrt(val);
        	int val2 =1;
        	while(val1>=val2){
        		val2 = (int)Math.sqrt(val - (val1*val1));
	        	if((val2*val2)+(val1*val1) == val){
	        		count++;
	        	}
	        	val1--;
        	}
        	System.out.println(val==0?1:count);
        }
    }
}


/*

21
140700476
787401086
29641625
919693425
941036334
607671885
220653837
945629248
387888900
326127485
232305426
161535409
943083630
246814006
615561499
451998200
909343512
821348161
791354858
801125
100

*/