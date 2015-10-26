import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Sudoku {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	int length = Integer.parseInt(line.split(";")[0]);
        	int sum = length==4?10:45;
        	String[] array =  line.split(";")[1].split(",");
        	int[][] arrayInt = new int[length][length];
        	boolean result = true;
        	int k=0;
        	for(int i=0;i<length;i++){
        		int[] sumtemp=new int[length];
        		for(int j=0;j<length;j++){
        			arrayInt[i][j]=Integer.parseInt(array[k]);
        			k++;
        			sumtemp[arrayInt[i][j]-1]=-1;
        		}
        		for(int j=0;j<sumtemp.length;j++){
        			if(sumtemp[j]!=-1){
        				result=false;
        				break;
        			}
        		}
        		if(result!=true){
        			break;
        		}
        	}
        	if(result){
        		for(int i=0;i<length;i++){
        			int[] sumtemp=new int[length];
        			for(int j=0;j<length;j++){
        				sumtemp[arrayInt[j][i]-1]=-1;
        			}
        			for(int j=0;j<sumtemp.length;j++){
            			if(sumtemp[j]!=-1){
            				result=false;
            				break;
            			}
            		}
            		if(result!=true){
            			break;
            		}
        		}
        	}
        	if(result){
        		for(int ival=0;ival<length;ival+=Math.sqrt(length))
        			for(int jval=0;jval<length;jval+=Math.sqrt(length)){
        				int[] sumtemp=new int[length];
		        		for(int i=ival;i<ival+Math.sqrt(length);i++){
		        			for(int j=0;j<jval+Math.sqrt(length);j++){
		        				sumtemp[arrayInt[j][i]-1]=-1;
		        			}
		        		}
		        		for(int j=0;j<Math.sqrt(length);j++){
		        			if(sumtemp[j]!=-1){
		        				result=false;
		        				break;
		        			}
		        		}
		        		if(result!=true){
		        			break;
		        		}
        			}
        	}
        	System.out.println(result?"True":"False");
        }
    }
}

/*
4;4,3,1,4,2,1,2,4,3,3,4,2,3,3,1,2
4;2,1,3,4,3,4,2,1,1,3,4,2,4,2,1,3
9;4,4,7,5,2,2,7,8,9,5,2,4,8,6,4,5,7,7,2,4,3,3,2,2,6,1,3,2,5,3,1,4,9,9,6,9,2,6,8,3,2,2,2,1,2,5,7,1,5,8,2,7,9,6,1,4,8,6,4,7,6,8,2,9,1,9,1,4,3,1,3,4,1,1,5,9,4,5,4,4,3
9;9,1,5,7,9,7,1,6,9,6,8,7,2,4,7,4,1,7,2,5,2,4,7,9,9,3,5,1,8,1,7,4,2,5,7,8,6,3,3,4,7,1,9,1,8,2,6,9,5,8,6,9,7,6,8,6,7,4,2,6,5,2,3,2,1,8,3,6,6,9,5,6,5,8,2,7,7,4,4,3,2
4;2,4,4,1,2,1,1,3,4,4,2,3,4,3,4,2
9;8,7,1,4,6,9,3,5,2,4,2,6,3,5,1,8,9,7,5,9,3,7,2,8,4,6,1,3,5,2,9,4,7,6,1,8,6,4,9,1,8,2,5,7,3,1,8,7,5,3,6,2,4,9,9,6,4,2,1,3,7,8,5,7,3,8,6,9,5,1,2,4,2,1,5,8,7,4,9,3,6
4;4,2,1,3,1,3,4,2,3,4,2,1,2,1,3,4
4;1,4,2,3,2,3,1,4,4,2,3,1,3,1,4,2
9;6,7,4,6,5,3,5,4,5,1,4,5,5,8,6,5,8,1,2,7,3,5,4,6,9,1,2,2,1,7,3,4,5,4,4,3,7,8,2,4,8,7,9,1,6,8,6,2,9,7,1,1,4,8,3,3,9,3,1,3,1,1,2,4,2,8,1,8,8,2,9,1,7,6,3,1,3,3,6,7,1
4;2,2,4,2,4,2,2,1,1,2,4,2,4,4,1,3
4;3,4,4,3,4,1,3,2,2,2,4,4,1,2,1,3
9;5,3,4,6,7,8,9,1,2,6,7,2,1,9,5,3,4,8,1,9,8,3,4,2,5,6,7,8,5,9,7,6,1,4,2,3,4,2,6,8,5,3,7,9,1,7,1,3,9,2,4,8,5,6,9,6,1,5,3,7,2,8,4,2,8,7,4,1,9,6,3,5,3,4,5,2,8,6,1,7,9
4;3,3,2,2,4,4,3,2,4,2,1,3,4,1,1,3
9;5,6,6,3,9,3,5,1,1,3,8,9,2,9,7,1,6,7,3,8,8,2,5,1,3,4,2,3,8,5,6,2,9,8,1,4,2,2,2,4,2,8,7,3,3,5,3,9,3,6,4,9,3,1,7,5,5,5,8,3,7,7,4,7,6,8,6,9,9,6,4,1,5,4,3,2,4,7,9,5,6
9;1,2,3,4,5,6,7,8,9,2,3,4,5,6,7,8,9,1,3,4,5,6,7,8,9,1,2,4,5,6,7,8,9,1,2,3,5,6,7,8,9,1,2,3,4,6,7,8,9,1,2,3,4,5,7,8,9,1,2,3,4,5,6,8,9,1,2,3,4,5,6,7,9,1,2,3,4,5,6,7,8
9;6,6,3,8,2,6,2,5,4,3,5,5,4,6,6,7,8,9,4,5,5,8,3,9,8,1,2,1,4,2,2,1,7,3,6,9,7,8,6,6,9,9,7,4,7,2,5,4,7,4,8,8,7,2,6,5,9,9,2,7,4,9,2,2,8,2,9,8,9,8,6,7,6,1,7,9,3,2,6,9,3
9;7,8,4,6,6,3,1,2,7,1,4,5,9,5,5,4,7,8,4,4,6,1,8,3,1,1,9,8,1,2,5,2,6,7,7,8,7,2,1,4,3,9,6,7,2,3,1,7,2,6,7,6,3,2,2,1,1,9,5,2,4,7,8,6,6,6,9,8,4,8,2,8,8,6,3,4,5,8,1,8,4
4;4,3,2,1,1,2,3,4,3,4,1,2,2,1,4,3
9;1,2,7,5,3,9,8,4,6,4,5,3,8,6,1,7,9,2,8,9,6,4,7,2,1,5,3,2,8,9,3,1,7,4,6,5,3,6,5,2,8,4,9,1,7,7,4,1,9,5,6,3,2,8,9,7,4,6,2,8,5,3,1,5,1,2,7,4,3,6,8,9,6,3,8,1,9,5,2,7,4
9;1,3,7,9,5,4,9,7,1,8,7,1,5,9,9,4,1,7,5,3,8,2,4,1,2,3,1,1,5,9,4,1,6,7,8,9,7,3,8,1,6,3,4,3,5,3,5,8,8,3,1,9,2,5,6,2,5,7,6,1,5,3,4,9,3,4,2,5,5,9,8,7,2,8,3,3,4,8,3,5,2
 */

