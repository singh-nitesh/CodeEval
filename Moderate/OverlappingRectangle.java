import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class OverlappingRectangle {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(",");
            double r1x1= Double.parseDouble(input[0]);
            double r1y1= Double.parseDouble(input[1]);
            double r1x2= Double.parseDouble(input[2]);
            double r1y2= Double.parseDouble(input[3]);
            double r2x1= Double.parseDouble(input[4]);
            double r2y1= Double.parseDouble(input[5]);
            double r2x2= Double.parseDouble(input[6]);
            double r2y2= Double.parseDouble(input[7]);
            boolean isOverlapping=false;
            if(r1x1<=r2x1 && r1x2>=r2x1){
            	if(r1y1>=r2y1 && r1y2<=r2y1){
            		isOverlapping=true;
            	}
            }
            if(r1x1<=r2x2 && r1x2>=r2x2){
            	if(r1y1>=r2y2 && r1y2<=r2y2){
            		isOverlapping=true;
            	}
            }
            if(r1x1<=r2x1 && r1x2>=r2x1){
            	if(r1y1>=r2y2 && r1y2<=r2y2){
            		isOverlapping=true;
            	}
            }
            if(r1x1<=r2x2 && r1x2>=r2x2){
            	if(r1y1>=r2y1 && r1y2<=r2y1){
            		isOverlapping=true;
            	}
            }
            
            if(r2x1<=r1x1 && r2x2>=r1x1){
            	if(r2y1>=r1y1 && r2y2<=r1y1){
            		isOverlapping=true;
            	}
            }
            if(r2x1<=r1x2 && r2x2>=r1x2){
            	if(r2y1>=r1y2 && r2y2<=r1y2){
            		isOverlapping=true;
            	}
            }
            if(r2x1<=r1x1 && r2x2>=r1x1){
            	if(r2y1>=r1y2 && r2y2<=r1y2){
            		isOverlapping=true;
            	}
            }
            if(r2x1<=r1x2 && r2x2>=r1x2){
            	if(r2y1>=r1y1 && r2y2<=r1y1){
            		isOverlapping=true;
            	}
            }
            
            
            
            System.out.println(isOverlapping?"True":"False");
        }
    }
}
