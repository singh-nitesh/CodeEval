import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class KnightsMove {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int c = convertToInt(line.charAt(0));
            int n = Integer.parseInt(line.substring(1));
            int[][] res = new int[8][2];
            res[0][0]=c-2;res[0][1]=n-1;
            res[1][0]=c-2;res[1][1]=n+1;
            res[2][0]=c-1;res[2][1]=n-2;
            res[3][0]=c-1;res[3][1]=n+2;
            res[4][0]=c+1;res[4][1]=n-2;
            res[5][0]=c+1;res[5][1]=n+2;
            res[6][0]=c+2;res[6][1]=n-1;
            res[7][0]=c+2;res[7][1]=n+1;
            String result="";
            for(int i=0;i<8;i++){
            	if(res[i][0]>=1 && res[i][0]<=8 && res[i][1]>=1 && res[i][1]<=8){
            		result+=convertToChar(res[i][0])+res[i][1]+" ";
            	}
            }
            System.out.println(result);
        }
    }
	private static int convertToInt(char val){
		if(val=='a'){
			return 1;
		} else if(val=='b'){
			return 2;
		} else if(val=='c'){
			return 3;
		} else if(val=='d'){
			return 4;
		} else if(val=='e'){
			return 5;
		} else if(val=='f'){
			return 6;
		} else if(val=='g'){
			return 7;
		} else {
			return 8;
		}
	}
	
	private static String convertToChar(int val){
		if(val==1){
			return "a";
		} else if(val==2){
			return "b";
		} else if(val==3){
			return "c";
		} else if(val==4){
			return "d";
		} else if(val==5){
			return "e";
		} else if(val==6){
			return "f";
		} else if(val==7){
			return "g";
		} else {
			return "h";
		}
	}
}
