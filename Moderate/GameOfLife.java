import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class GameOfLife {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        List<String[]> list = new ArrayList<String[]>();
        List<String[]> list1 = new ArrayList<String[]>();
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split("");
            list.add(input);
            String[] input1 = line.split("");
            list1.add(input1);
        }
        for(int k=0;k<10;k++){
        	for(int i=0;i<list.size();i++){
        		for(int j=0;j<list.get(i).length;j++){
        			int count=0;
        			if(i!=0 && list.get(i-1)[j].equalsIgnoreCase("*")){
        				count++;
        			}
        			if(j!=0 && list.get(i)[j-1].equalsIgnoreCase("*")){
        				count++;
        			}
        			if(i!=list.size()-1 && list.get(i+1)[j].equalsIgnoreCase("*")){
        				count++;
        			}
        			if(j!=list.get(i).length-1 && list.get(i)[j+1].equalsIgnoreCase("*")){
        				count++;
        			}
        			if(i!=0 && j!=0 && list.get(i-1)[j-1].equalsIgnoreCase("*")){
        				count++;
        			}
        			if(i!=0 && j!=list.get(i).length-1 && list.get(i-1)[j+1].equalsIgnoreCase("*")){
        				count++;
        			}
        			if(i!=list.size()-1 && j!=0 && list.get(i+1)[j-1].equalsIgnoreCase("*")){
        				count++;
        			}
        			if(i!=list.size()-1 && j!=list.get(i).length-1 && list.get(i+1)[j+1].equalsIgnoreCase("*")){
        				count++;
        			}

        			if(count<2 && list.get(i)[j].equalsIgnoreCase("*")){
        				list1.get(i)[j]=".";
        			} else if(count>=2 && count<=3 && list.get(i)[j].equalsIgnoreCase("*")){
        				list1.get(i)[j]="*";
        			} else if(count>=4 && list.get(i)[j].equalsIgnoreCase("*")){
        				list1.get(i)[j]=".";
        			} else if(count==3 && list.get(i)[j].equalsIgnoreCase(".")){
        				list1.get(i)[j]="*";
        			}
        		}
        	}
        	String result = "";
            for(int i=0;i<list.size();i++){
        		for(int j=0;j<list.get(i).length;j++){
        			result+=list1.get(i)[j];
        		}
        		result+="\n";
            }
            System.out.println(result);
            list = list1;
        }
        String result = "";
        for(int i=0;i<list.size();i++){
    		for(int j=0;j<list.get(i).length;j++){
    			result+=list.get(i)[j];
    		}
    		result+="\n";
        }
        System.out.println(result);
        
    }

}
