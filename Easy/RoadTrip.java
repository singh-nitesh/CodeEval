import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RoadTrip {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] cities=line.split(";");
            int[] distances = new int[cities.length];
            for(int i=0;i<cities.length;i++){
            	distances[i]=Integer.parseInt(cities[i].split(",")[1]);
            }
            for(int i=0;i<distances.length-1;i++){
            	for(int j=i+1;j<distances.length;j++){
                	if(distances[i]>distances[j]){
                		int temp = distances[i];
                		distances[i] = distances[j];
                		distances[j] = temp;
                	}
                }
            }
            String result=String.valueOf(distances[0]) + ",";
            for(int i=1;i<distances.length;i++){
            	result+=String.valueOf(distances[i]-distances[i-1])+",";
            }
            System.out.println(result.subSequence(0, result.length()-1));
        }
    }
}
