import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StringsAndArrows {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int count=0;
            while(true){
            	int index1 = line.indexOf(">>-->");
            	int index2 = line.indexOf("<--<<");
            	if(index1==-1 && index2==-1){
            		break;
            	} else if((index1>index2 && index2!=-1) || (index1==-1 && index2!=-1)){
            		if(index2+4<=line.length())
            			line =  line.substring(index2+4,line.length());
            		else
            			line = "";
            		count++;
            	} else if((index1<index2  && index1!=-1) || (index2==-1 && index1!=-1)){
            		if(index1+4<=line.length())
            			line =  line.substring(index1+4,line.length());
            		else
            			line = "";
            		count++;
            	}
            }
            System.out.println(count);
        }
    }
}
