import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LakeNotCakes {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" \\| ");
            char[][] matrix = new char[input.length][input[0].split(" ").length];
            for(int i=0;i<input.length;i++){
            	String[] val = input[i].split(" ");
            	for(int j=0;j<val.length;j++){
                	matrix[i][j]=val[j].charAt(0);
                }
            }
            int count=0;
            for(int i=0;i<matrix.length;i++){
            	for(int j=0;j<matrix[i].length;j++){
                	if(matrix[i][j]=='o'){
                		count++;
                		lake(matrix,i,j);
                	}
                }
            }
            System.out.println(count);   
        }
    }
	
	private static void lake(char[][] matrix,int i,int j){
		matrix[i][j]='O';
		if(j!=matrix[i].length-1){
			if(matrix[i][j+1]=='o'){
				lake(matrix,i,j+1);
			}
		}
		if(i!=matrix.length-1){
			if(matrix[i+1][j]=='o'){
				lake(matrix,i+1,j);
			}
		}
		if(j!=matrix[i].length-1 && i!=matrix.length-1){
			if(matrix[i+1][j+1]=='o'){
				lake(matrix,i+1,j+1);
			}
		}
		if(j!=0){
			if(matrix[i][j-1]=='o'){
				lake(matrix,i,j-1);
			} 
		}
		if(i!=0){
			if(matrix[i-1][j]=='o'){
				lake(matrix,i-1,j);
			}
		}
		if(j!=0 && i!=0){
			if(matrix[i-1][j-1]=='o'){
				lake(matrix,i-1,j-1);
			}
		}
		if(j!=0 && i!=matrix.length-1){
			if(matrix[i+1][j-1]=='o'){
				lake(matrix,i+1,j-1);
			}
		}
		if(j!=matrix[i].length-1 && i!=0){
			if(matrix[i-1][j+1]=='o'){
				lake(matrix,i-1,j+1);
			}
		}
	}
}
