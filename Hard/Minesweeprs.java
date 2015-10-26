import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Minesweeprs {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(";")[1].split("");
            int i = Integer.parseInt(line.split(";")[0].split(",")[0]);
            int j = Integer.parseInt(line.split(";")[0].split(",")[1]);
            char[][] in = new char[i][j];
            int k=1;
            for(int a=0;a<i;a++){
            	for(int b=0;b<j;b++){
            		in[a][b]=input[k].charAt(0);
            		k++;
                }
            }
            String result = "";
            for(i=0;i<in.length;i++){
            	for(j=0;j<in[i].length;j++){
            		int count=0;
            		if(in[i][j]!='*'){
            			if(i!=0 && in[i-1][j]=='*'){
            				count++;
            			}
            			if(j!=0 && in[i][j-1]=='*'){
            				count++;
            			}
            			if(i!=in.length-1 && in[i+1][j]=='*'){
            				count++;
            			}
            			if(j!=in[i].length-1 && in[i][j+1]=='*'){
            				count++;
            			}
            			if(i!=0 && j!=0 && in[i-1][j-1]=='*'){
            				count++;
            			}
            			if(i!=0 && j!=in[i].length-1 && in[i-1][j+1]=='*'){
            				count++;
            			}
            			if(i!=in.length-1 && j!=0 && in[i+1][j-1]=='*'){
            				count++;
            			}
            			if(i!=in.length-1 && j!=in[i].length-1 && in[i+1][j+1]=='*'){
            				count++;
            			}
            			in[i][j] = String.valueOf(count).charAt(0);
            		}
        			result+=in[i][j];
                }
            }
            System.out.println(result);
        }
    }
}
