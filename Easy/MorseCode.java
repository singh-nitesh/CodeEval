import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MorseCode {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
           String[] words=line.split("  "); 
           String result="";
           for(String word : words){
        	   String[] letters = word.split(" ");
        	   for(String letter : letters){
        		   result+=decode(letter);
        	   }
        	   result+=" ";
           }
           System.out.println(result.trim());
        }
    }
	
	private static char decode(String letter){
		if(letter.equalsIgnoreCase(".-")){
			return 'A';
		} else if(letter.equalsIgnoreCase("-...")){
			return 'B';
		}else if(letter.equalsIgnoreCase("-.-.")){
			return 'C';
		}else if(letter.equalsIgnoreCase("-..")){
			return 'D';
		}else if(letter.equalsIgnoreCase(".")){
			return 'E';
		}else if(letter.equalsIgnoreCase("..-.")){
			return 'F';
		}else if(letter.equalsIgnoreCase("--.")){
			return 'G';
		}else if(letter.equalsIgnoreCase("....")){
			return 'H';
		}else if(letter.equalsIgnoreCase("..")){
			return 'I';
		}else if(letter.equalsIgnoreCase(".---")){
			return 'J';
		}else if(letter.equalsIgnoreCase("-.-")){
			return 'K';
		}else if(letter.equalsIgnoreCase(".-..")){
			return 'L';
		}else if(letter.equalsIgnoreCase("--")){
			return 'M';
		}else if(letter.equalsIgnoreCase("-.")){
			return 'N';
		}else if(letter.equalsIgnoreCase("---")){
			return 'O';
		}else if(letter.equalsIgnoreCase(".--.")){
			return 'P';
		}else if(letter.equalsIgnoreCase("--.-")){
			return 'Q';
		}else if(letter.equalsIgnoreCase(".-.")){
			return 'R';
		}else if(letter.equalsIgnoreCase("...")){
			return 'S';
		}else if(letter.equalsIgnoreCase("-")){
			return 'T';
		}else if(letter.equalsIgnoreCase("..-")){
			return 'U';
		}else if(letter.equalsIgnoreCase("...-")){
			return 'V';
		}else if(letter.equalsIgnoreCase(".--")){
			return 'W';
		}else if(letter.equalsIgnoreCase("-..-")){
			return 'X';
		}else if(letter.equalsIgnoreCase("-.--")){
			return 'Y';
		}else if(letter.equalsIgnoreCase("--..")){
			return 'Z';
		}else if(letter.equalsIgnoreCase(".----")){
			return '1';
		}else if(letter.equalsIgnoreCase("..---")){
			return '2';
		}else if(letter.equalsIgnoreCase("...--")){
			return '3';
		}else if(letter.equalsIgnoreCase("....-")){
			return '4';
		}else if(letter.equalsIgnoreCase(".....")){
			return '5';
		}else if(letter.equalsIgnoreCase("-....")){
			return '6';
		}else if(letter.equalsIgnoreCase("--...")){
			return '7';
		}else if(letter.equalsIgnoreCase("---..")){
			return '8';
		}else if(letter.equalsIgnoreCase("----.")){
			return '9';
		}else {
			return '0';
		}
	}
}
