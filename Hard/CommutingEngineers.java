import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CommutingEngineers {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        List<long[]> co = new ArrayList<long[]>();
        while ((line = buffer.readLine()) != null) {
        	long[] in = new long[2];
        	in[0] = (long)(Double.parseDouble(line.split("\\(")[1].split(",")[0])*10000000);
        	in[1] = (long)(Double.parseDouble(line.split("\\(")[1].split(",")[1].substring(0,line.split("\\(")[1].split(",")[1].length()-1))*10000000);
        	co.add(in);
        }
        
        int[] loc = new int[co.size()];
        for(int i=0;i<loc.length;i++){
        	loc[i]=i+1;
        }
        long[] org = co.get(0);
        String result = "";
        for(int k=0;k<co.size();k++){
        	long[] dis = new long[co.size()];
	        for(int i=0;i<dis.length;i++){
	        	if(loc[i]!=0){
		        	long[] val = co.get(loc[i]-1);
		        	long a = Math.abs(org[0]-val[0]);
		        	long b = Math.abs(org[1]-val[1]);
		        	dis[i] = (long)Math.sqrt(a*a+b*b);
	        	}
	        }
	        for(int i=0;i<dis.length;i++){
	        	for(int j=i+1;j<dis.length;j++){
	        		if(dis[i]>dis[j]){
	        			long temp = dis[i];
	        			dis[i]=dis[j];
	        			dis[j]=temp;
	        			int t = loc[i];
	        			loc[i]=loc[j];
	        			loc[j]=t;
	        		}
	        	}
	        	if(loc[i]!=0){
	        		result+=loc[i]+"\n";
	        		org = co.get(loc[i]-1);
	        		loc[i]=0;
	        		break;
	        	}
	        }
        }
        System.out.println(result);
    }
}
