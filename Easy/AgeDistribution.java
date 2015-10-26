import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class AgeDistribution {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int age = Integer.parseInt(line);
            String result="";
            if(age>=0 && age<=2){
            	result="Still in Mama's arms";
            } else if(age>=3 && age<=4){
            	result="Preschool Maniac";
            } else if(age>=5 && age<=11){
            	result="Elementary school";
            } else if(age>=12 && age<=14){
            	result="Middle school";
            } else if(age>=15 && age<=18){
            	result="High school";
            } else if(age>=19 && age<=22){
            	result="College";
            } else if(age>=23 && age<=65){
            	result="Working for the man";
            } else if(age>=66 && age<=100){
            	result="The Golden Years";
            } else {
            	result="This program is for humans";
            }
            System.out.println(result);
        }
    }
}
