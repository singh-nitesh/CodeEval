import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TextDoller {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split("");
            String result="";
            for(int i=0;i<input.length;i++){
            	if(i==0){
            		result+=unit(input[i]);
            	} else if(i==1){
            		
            	}
            }
        }
    }
	
	private static String unit(String num){
		if(num.equals("1")){
			return "One";
		} else if(num.equals("2")){
			return "Two";
		} else if(num.equals("3")){
			return "Three";
		} else if(num.equals("4")){
			return "Four";
		} else if(num.equals("5")){
			return "Five";
		} else if(num.equals("6")){
			return "Six";
		} else if(num.equals("7")){
			return "Seven";
		} else if(num.equals("8")){
			return "Eight";
		} else if(num.equals("9")){
			return "Nine";
		}else {
			return "";
		}
	}
	
	private static String tens(String num){
		if(num.equals("1")){
			return "One";
		} else if(num.equals("2")){
			return "Twenty";
		} else if(num.equals("3")){
			return "Thirty";
		} else if(num.equals("4")){
			return "Forty";
		} else if(num.equals("5")){
			return "Fifty";
		} else if(num.equals("6")){
			return "Sixty";
		} else if(num.equals("7")){
			return "Seventy";
		} else if(num.equals("8")){
			return "Eighty";
		} else if(num.equals("9")){
			return "Ninty";
		}else {
			return "";
		}
	}
	
	private static String hundred(String num){
		if(num.equals("1")){
			return "OneHundred";
		} else if(num.equals("2")){
			return "TwoHundred";
		} else if(num.equals("3")){
			return "ThreeHundred";
		} else if(num.equals("4")){
			return "FourHundred";
		} else if(num.equals("5")){
			return "FiveHundred";
		} else if(num.equals("6")){
			return "SixHundred";
		} else if(num.equals("7")){
			return "SevenHundred";
		} else if(num.equals("8")){
			return "EightHundred";
		} else if(num.equals("9")){
			return "NineHundred";
		}else {
			return "";
		}
	}
	
	private static String Thousand(String num){
		if(num.equals("1")){
			return "OneThousand";
		} else if(num.equals("2")){
			return "TwoThousand";
		} else if(num.equals("3")){
			return "ThreeThousand";
		} else if(num.equals("4")){
			return "FourThousand";
		} else if(num.equals("5")){
			return "FiveThousand";
		} else if(num.equals("6")){
			return "SixThousand";
		} else if(num.equals("7")){
			return "SevenThousand";
		} else if(num.equals("8")){
			return "EightThousand";
		} else if(num.equals("9")){
			return "NineThousand";
		}else {
			return "";
		}
	}
	
}
