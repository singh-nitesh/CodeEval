import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class StringList {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int length = Integer.parseInt(line.split(",")[0]);
            String string = line.split(",")[1];
            Set<String> result = getPermutations(string, length);
            String output="";
            for(String val : result){
            	output+=val+",";
            }
            System.out.println(output.substring(0,output.length()-1));
        }
    }
	
	private static Set<String> getPermutations(String a,int n) {
		int l = a.length();
		int permutations = (int) Math.pow(l, n);
		char[][] table = new char[permutations][n];
		for (int x = n-1; x >= 0; x--) {
			int t2 = (int) Math.pow(l, x);
			for (int p1 = 0; p1 < permutations;) {
				for (int al = 0; al < l; al++) {
					for (int p2 = 0; p2 < t2; p2++) {
						table[p1][x] = a.charAt(al);
						p1++;
					}
				}
			}
		}


		Set<String> result = new TreeSet<String>();
		for (char[] permutation : table) {
			result.add(new String(permutation));
		}
		return result;
	}
}
