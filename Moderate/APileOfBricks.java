import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class APileOfBricks {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int x1 = Integer.parseInt(line.split("\\|")[0].split(" ")[0].split(",")[0].substring(1));
            int y1 = Integer.parseInt(line.split("\\|")[0].split(" ")[0].split(",")[1].substring(0,line.split("\\|")[0].split(" ")[0].split(",")[1].length()-1));
            int x2 = Integer.parseInt(line.split("\\|")[0].split(" ")[1].split(",")[0].substring(1));
            int y2 = Integer.parseInt(line.split("\\|")[0].split(" ")[1].split(",")[1].substring(0,line.split("\\|")[0].split(" ")[1].split(",")[1].length()-1));
            
            int length = Math.abs(x1-x2);
            int breadth = Math.abs(y1-y2);
            
            String[] values = line.split("\\|")[1].split(";");
            
            int[] result=new int[values.length];
            
            for(int i=0;i<values.length;i++){
            	int index = Integer.parseInt(values[i].split(" ")[0].substring(1));
            	int bx1=Integer.parseInt(values[i].split(" ")[1].split(",")[0].substring(1));
            	int by1=Integer.parseInt(values[i].split(" ")[1].split(",")[1]);
            	int bz1=Integer.parseInt(values[i].split(" ")[1].split(",")[2].substring(0,values[i].split(" ")[1].split(",")[2].length()-1));
            	int bx2=Integer.parseInt(values[i].split(" ")[2].split(",")[0].substring(1));
            	int by2=Integer.parseInt(values[i].split(" ")[2].split(",")[1]);
            	int bz2=Integer.parseInt(values[i].split(" ")[2].split(",")[2].substring(0,values[i].split(" ")[2].split(",")[2].length()-2));
            	
            	int bLength=Math.abs(bx1-bx2);
            	int bBreadth = Math.abs(by1-by2);
            	int bDepth = Math.abs(bz1-bz2);
            	
            	if(bLength<=length && bBreadth<=breadth){
            		result[i]=index;
            	} else if(bBreadth<=length && bLength<=breadth){
            		result[i]=index;
            	} else if(bLength<=length && bDepth<=breadth){
            		result[i]=index;
            	} else if(bDepth<=length && bLength<=breadth){
            		result[i]=index;
            	} else if(bBreadth<=length && bDepth<=breadth){
            		result[i]=index;
            	} else if(bDepth<=length && bBreadth<=breadth){
            		result[i]=index;
            	} 
            }            
            for(int i=0;i<result.length-1;i++){
            	for(int j=i+1;j<result.length;j++){
            		if(result[i]>result[j]){
            			int temp = result[i];
            			result[i]=result[j];
            			result[j]=temp;
            		}
            	}
            }
            String output="";
            for(int i=0;i<result.length;i++){
            	if(result[i]!=0)
            		output+=result[i]+",";
            }
            System.out.println(output.length()>0?output.substring(0,output.length()-1):"-");
        }
    }
}
