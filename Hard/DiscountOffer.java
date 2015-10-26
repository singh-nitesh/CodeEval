import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DiscountOffer {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] cust = line.split(";")[0].split(",");
            String[] prod = line.split(";")[1].split(",");
            double SS=0;
            for(int j=0;j<cust.length;j++){
            	double maxss=0;
            	for(int i=0;i<prod.length;i++){
            		double ss=0;
            		if(numberOfLetter(prod[i])%2==0){
            			ss = numberOfVowel(cust[i])*1.5;
            		} else {
            			ss = numberOfConsonent(cust[i]);
            		}
            		if(hasCommonFactor(numberOfLetter(cust[j]),numberOfLetter(prod[i]))){
            			ss=ss*1.5;
            		}
            		if(ss>maxss){
            			maxss=ss;
            		}
            	}
            	SS+=maxss;
            }
            System.out.println(SS);
        }
    }
	
	private static int numberOfLetter(String val){
		int count=0;
		for(int i=0;i<val.length();i++){
			if(val.charAt(i)!=' '){
				count++;
			}
		}
		return count;
	}
	
	private static int numberOfVowel(String val){
		int count=0;
		for(int i=0;i<val.length();i++){
			if(val.charAt(i)=='a'){
				count++;
			} else if(val.charAt(i)=='e'){
				count++;
			} else if(val.charAt(i)=='i'){
				count++;
			} else if(val.charAt(i)=='o'){
				count++;
			} else if(val.charAt(i)=='u'){
				count++;
			} else if(val.charAt(i)=='y'){
				count++;
			} else if(val.charAt(i)=='A'){
				count++;
			} else if(val.charAt(i)=='E'){
				count++;
			} else if(val.charAt(i)=='I'){
				count++;
			} else if(val.charAt(i)=='O'){
				count++;
			} else if(val.charAt(i)=='U'){
				count++;
			} else if(val.charAt(i)=='Y'){
				count++;
			}
		}
		return count;
	}
	
	private static int numberOfConsonent(String val){
		int count=0;
		for(int i=0;i<val.length();i++){
			if(val.charAt(i)=='a'){
				continue;
			} else if(val.charAt(i)=='e'){
				continue;
			} else if(val.charAt(i)=='i'){
				continue;
			} else if(val.charAt(i)=='o'){
				continue;
			} else if(val.charAt(i)=='u'){
				continue;
			} else if(val.charAt(i)=='y'){
				continue;
			} else if(val.charAt(i)=='A'){
				continue;
			} else if(val.charAt(i)=='E'){
				continue;
			} else if(val.charAt(i)=='I'){
				continue;
			} else if(val.charAt(i)=='O'){
				continue;
			} else if(val.charAt(i)=='U'){
				continue;
			} else if(val.charAt(i)=='Y'){
				continue;
			} else if(val.charAt(i)==' '){
				continue;
			} else {
				count++;
			}
		}
		return count;
	}
	
	private static boolean hasCommonFactor(int num1, int num2) {
		int min = minimum(num1, num2);
	    for(int i = 2; i <= min / 2; i++) { 
	        if (num1 % i == 0 && num2 % i == 0) {
	            return true;
	        }
	    }
	    if (num1 % min == 0 && num2 % min == 0) {
	        return true;
	    }
	    return false;
	}
	
	private static int minimum(int num1, int num2) {
	    return num1 <= num2 ? num1 : num2;
	}
	
	private static String[] rotate(String[]val){
		String temp= val[0];
		for(int i=0;i<val.length-1;i++){
			val[i]= val[i+1];
		}
		val[val.length-1]=temp;
		return val;
	}
	
}
