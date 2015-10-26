import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StringPermutation {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String alphabet = sort(line);
            int N = alphabet.length();
            String elements = alphabet.substring(0, N);
            String result = perm1(elements);
            System.out.println(result.substring(0,result.length()-1));
        }
    }
	
	private static String sort(String s){
		char[] input = s.toCharArray();
		String result="";
		for(int i=0;i<input.length-1;i++){
			for(int j=i+1;j<input.length;j++){
				if(input[i]>input[j]){
					char temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
			result+=input[i];
		}
		result+=input[input.length-1];
		return result;
	}
	
	public  static String perm1(String s) { 
		return perm1("", s); 
	}
	
	private static String perm1(String prefix, String s) {
		String result="";
		int N = s.length();
		if (N == 0) 
			result+=prefix+",";
		else {
			for (int i = 0; i < N; i++)
				result += perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
		}
		return result;
	}

}
