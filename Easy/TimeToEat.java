import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TimeToEat {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] inputs = line.split(" ");
            int[] hour= new int[inputs.length]; 
            int[] min= new int[inputs.length]; 
            int[] sec= new int[inputs.length]; 
            
            for(int i=0;i<inputs.length;i++){
            	String[] val = inputs[i].split(":");
            	hour[i]= Integer.parseInt(val[0]);
            	min[i]= Integer.parseInt(val[1]);
            	sec[i]= Integer.parseInt(val[2]);
            }
            
            for(int i=0;i<hour.length-1;i++){
            	for(int j=i+1;j<hour.length;j++){
            		if(hour[i]>hour[j]){
            			int temp = sec[i];
            			sec[i]=sec[j];
            			sec[j]=temp;
            			temp = min[i];
            			min[i]=min[j];
            			min[j]=temp;
            			temp = hour[i];
            			hour[i]=hour[j];
            			hour[j]=temp;
            			String tem = inputs[i];
            			inputs[i] = inputs[j];
            			inputs[j] = tem;
            		}
            	}
            }
            
            for(int i=0;i<min.length-1;i++){
            	for(int j=i+1;j<min.length;j++){
            		if(min[i]>min[j] && hour[i]>=hour[j]){
            			int temp = sec[i];
            			sec[i]=sec[j];
            			sec[j]=temp;
            			temp = min[i];
            			min[i]=min[j];
            			min[j]=temp;
            			temp = hour[i];
            			hour[i]=hour[j];
            			hour[j]=temp;
            			String tem = inputs[i];
            			inputs[i] = inputs[j];
            			inputs[j] = tem;
            		}
            	}
            }
            
            for(int i=0;i<sec.length-1;i++){
            	for(int j=i+1;j<sec.length;j++){
            		if(sec[i]>sec[j] && hour[i]>=hour[j] && min[i]>=min[j]){
            			int temp = sec[i];
            			sec[i]=sec[j];
            			sec[j]=temp;
            			temp = min[i];
            			min[i]=min[j];
            			min[j]=temp;
            			temp = hour[i];
            			hour[i]=hour[j];
            			hour[j]=temp;
            			String tem = inputs[i];
            			inputs[i] = inputs[j];
            			inputs[j] = tem;
            		}
            	}
            }
            
            String result="";
            for(int i=inputs.length-1;i>=0;i--){
            	result+=inputs[i]+" ";
            }
            System.out.println(result.trim());
        }
    }
}
