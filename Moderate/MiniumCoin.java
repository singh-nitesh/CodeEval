import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MiniumCoin {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int val = Integer.parseInt(line);
            int coin5=val/5;
            int coin3=(val%5)/3;
            int coin1=((val%5)%3);
            System.out.println(coin5+coin3+coin1);
        }
    }
}
