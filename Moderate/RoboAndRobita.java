import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RoboAndRobita {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int m = Integer.parseInt(line.split(" \\| ")[0].split("x")[0]);
            int n = Integer.parseInt(line.split(" \\| ")[0].split("x")[1]);
            int k=1;
            int l=0;
            int a = Integer.parseInt(line.split(" \\| ")[1].split(" ")[0])-1;
            int b = Integer.parseInt(line.split(" \\| ")[1].split(" ")[1])-1;
            int i=0;
            int j=0;
            int count=0;
            boolean found=false;
            while(true){
            	if(!found){
            		do{
            			count++;
            			if(i==a && j==b){
            				found=true;
            				break;
            			}
            			j++;
            		}while(j<n-1);
            	} else {
            		break;
            	}
            	if(!found){
            		do{
            			count++;
            			if(i==a && j==b){
            				found=true;
            				break;
            			}
            			i++;
            		}while(i<m-1);
            	} else {
            		break;
            	}
            	if(!found){
            		do{
            			count++;
            			if(i==a && j==b){
            				found=true;
            				break;
            			}
            			j--;
            		}while(j>l);
            	} else {
            		break;
            	}
            	if(!found){
            		do{
            			count++;
            			if(i==a && j==b){
            				found=true;
            				break;
            			}
            			i--;
            		}while(i>k);
            	} else {
            		break;
            	}
            	
            	m--;
            	n--;
            	l++;
            	k++;
            }
            System.out.println(count-1);
        }
    }
}
