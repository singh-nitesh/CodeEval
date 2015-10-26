import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class StraightLines {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" \\| ");
            int[][] points = new int[input.length][2];
            for(int i=0;i<input.length;i++){
            	int a = Integer.parseInt(input[i].split(" ")[0]);
            	int b = Integer.parseInt(input[i].split(" ")[1]);
            	points[i][0]=a;
            	points[i][1]=b;
            }
            Set<int[]> lineSet = new HashSet<int[]>();
            System.out.println(permute(points,lineSet));
        }
    }
	
	private static int permute(int[][] points,Set<int[]> lineSet){
		int count=0;
		for(int i=0;i<points.length-2;i++){
			for(int j=i+1;j<points.length-1;j++){
				for(int k=j+1;k<points.length;k++){
					if(isLine(points,i,j,k)==1 && !contains(lineSet,i,j,k)){
						count++;
						int[] val = new int[3];
						val[0]=i;
						val[1]=j;
						val[2]=k;
						lineSet.add(val);
					}
				}
			}
		}
		return count;
	}
	
	private static boolean contains(Set<int[]> lineSet,int i,int j,int k){
		int count=0;
		for(int[] val : lineSet){
			count=0;
			if(i == val[0] || i==val[1] || i==val[2]){
				count++;
			}
			if(j == val[0] || j==val[1] || j==val[2]){
				count++;
			}
			if(k == val[0] || k==val[1] || k==val[2]){
				count++;
			}
			if(count>=2){
				return true;
			}
		}
		return false;
	}
	
	private static int isLine(int[][] points,int i,int j,int k){
		if(((float)(points[i][0] * (points[j][1] - points[k][1]) + points[j][0] * (points[k][1] - points[i][1]) + points[k][0] * (points[i][1] - points[j][1]) ) / (float)2) == 0){
			return 1;
		} else {
			return 0;
		}
	}
}
