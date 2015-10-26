import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CashRegister {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int input1 = (int)(Float.parseFloat(line.split(";")[0])*100);
            int input2 = (int)(Float.parseFloat(line.split(";")[1])*100);
            int result=-1;
            if(input2>=input1){
            	 result = input2-input1;
            }
            System.out.println(result==-1?"ERROR":getValue(result));
        }
    }
	
	private static String getValue(int val){
		String result="";
		if(val==0){
			result+="ZERO,";
		}
		while(val>=1){
			if(val>=10000){
				result+="ONE HUNDRED,";
				val-=10000;
			} else if(val>=5000){
				result+="FIFTY,";
				val-=5000;
			} else if(val>=2000){
				result+="TWENTY,";
				val-=2000;
			} else if(val>=1000){
				result+="TEN,";
				val-=1000;
			}else if(val>=500){
				result+="FIVE,";
				val-=500;
			}else if(val>=200){
				result+="TWO,";
				val-=200;
			}else if(val>=100){
				result+="ONE,";
				val-=100;
			} else if(val>=50){
				result+="HALF DOLLAR,";
				val-=50;
			} else if(val>=25){
				result+="QUARTER,";
				val-=25;
			} else if(val>=10){
				result+="DIME,";
				val-=10;
			} else if(val>=5){
				result+="NICKEL,";
				val-=5;
			} else if(val>=1){
				result+="PENNY,";
				val-=1;
			}
		}
		
		return result.substring(0,result.length()-1);
	}
}