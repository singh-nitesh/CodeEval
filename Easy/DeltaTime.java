import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DeltaTime {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int time1 = convertToSeconds(line.split(" ")[0]);
            int time2 = convertToSeconds(line.split(" ")[1]);
            System.out.println(convertToTime(time1-time2));
        }
    }
	
	private static int convertToSeconds(String time) {
		int hour = Integer.parseInt(time.split(":")[0]);
		int min = Integer.parseInt(time.split(":")[1]);
		int sec = Integer.parseInt(time.split(":")[2]);
		return (hour*60*60)+(min*60)+sec;
	}
	
	private static String convertToTime(int time) {
		time =Math.abs(time);
		int sec = time%60;
		int min = (time/60)%60;
		int hour = (time/60)/60;
		return timeFormat(hour)+":"+timeFormat(min)+":"+timeFormat(sec);
	}
	
	private static String timeFormat(int time){
		String val =String.valueOf(time);
		if(val.length()==1){
			return "0"+val;
		}
		return val;
	}
}
