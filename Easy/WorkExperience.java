import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class WorkExperience {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split("; ");
            int[] startDate=new int[input.length];
            int[] endDate=new int[input.length];
            for(int i=0;i<input.length;i++){
            	startDate[i]=convertToMonthStart(input[i].split("-")[0]);
            	endDate[i]=convertToMonthEnd(input[i].split("-")[1]);
            }
            for(int i=0;i<startDate.length-1;i++){
            	for(int j=i+1;j<startDate.length;j++){
            		if(startDate[i]>startDate[j]){
            			int temp = startDate[i];
            			startDate[i]=startDate[j];
            			startDate[j]=temp;
            			temp = endDate[i];
            			endDate[i]=endDate[j];
            			endDate[j]=temp;
            		}
            	}
            }
            int result=0;
            int prevStartDate=0;
            int prevEndDate=0;
            for(int i=0;i<startDate.length;i++){
            	if(i==0){
            		result=endDate[i]-startDate[i];
            		prevEndDate = endDate[i];
            	} else {
            		if(startDate[i]>prevEndDate){
            			result+=(endDate[i]-startDate[i]);
                		prevEndDate = endDate[i];
            		} else if(endDate[i]>prevEndDate) {
            			result+=(endDate[i]-prevEndDate);
            			prevEndDate = endDate[i];
            		}
            	}
            }
            System.out.println(result/12);
        }
    }
	private static int convertToMonthEnd(String date){
		int year = Integer.parseInt(date.split(" ")[1]);
		String month = date.split(" ")[0];
		int result = (year-1990)*12;
		if(month.equalsIgnoreCase("jan")){
			result++;
		} else if(month.equalsIgnoreCase("feb")){
			result+=2;
		} else if(month.equalsIgnoreCase("mar")){
			result+=3;
		} else if(month.equalsIgnoreCase("apr")){
			result+=4;
		} else if(month.equalsIgnoreCase("may")){
			result+=5;
		} else if(month.equalsIgnoreCase("jun")){
			result+=6;
		} else if(month.equalsIgnoreCase("jul")){
			result+=7;
		} else if(month.equalsIgnoreCase("aug")){
			result+=8;
		} else if(month.equalsIgnoreCase("sep")){
			result+=9;
		} else if(month.equalsIgnoreCase("oct")){
			result+=10;
		} else if(month.equalsIgnoreCase("nov")){
			result+=11;
		} else if(month.equalsIgnoreCase("dec")){
			result+=12;
		}
		return result;
	}
	
	private static int convertToMonthStart(String date){
		int year = Integer.parseInt(date.split(" ")[1]);
		String month = date.split(" ")[0];
		int result = (year-1990)*12;
		if(month.equalsIgnoreCase("feb")){
			result+=1;
		} else if(month.equalsIgnoreCase("mar")){
			result+=2;
		} else if(month.equalsIgnoreCase("apr")){
			result+=3;
		} else if(month.equalsIgnoreCase("may")){
			result+=4;
		} else if(month.equalsIgnoreCase("jun")){
			result+=5;
		} else if(month.equalsIgnoreCase("jul")){
			result+=6;
		} else if(month.equalsIgnoreCase("aug")){
			result+=7;
		} else if(month.equalsIgnoreCase("sep")){
			result+=8;
		} else if(month.equalsIgnoreCase("oct")){
			result+=9;
		} else if(month.equalsIgnoreCase("nov")){
			result+=10;
		} else if(month.equalsIgnoreCase("dec")){
			result+=11;
		}
		return result;
	}
}
