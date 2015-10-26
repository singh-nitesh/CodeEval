import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LowestCommonAncestor {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int[] ancestor = {30,8,52,3,20,-1,-1,-1,-1,10,29};
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            int index1=-1;
            int index2=-1;
            for(int i=0;i<ancestor.length;i++) {
            	if(Integer.parseInt(input[0])==ancestor[i]){
            		index1=i;
            	}
            	if(Integer.parseInt(input[1])==ancestor[i]){
            		index2=i;
            	}
            }
            do{
            	if(index1<index2){
            		if(index2%2==1){
            			index2 = index2/2;
                	} else {
                		index2 = (index2/2)-1;
                	}
            	} else {
            		if(index1%2==1){
            			index1 = index1/2;
                	} else {
                		index1 = (index1/2)-1;
                	}
            	}
            }while(index1!=index2);
            System.out.println(ancestor[index1]);
        }
    }
}
