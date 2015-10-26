import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StackImplementation {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] inputs= line.split(" ");
            int[] stack = new int[inputs.length];
            for(int i=0;i<inputs.length;i++){
            	push(stack,Integer.parseInt(inputs[i]),i);
            }
            boolean isAlternate = true;
            String output="";
            for(int i=stack.length-1;i>=0;i--){
            	int val = pop(stack,i);
            	if(isAlternate){
            		output+=val+" ";
            		isAlternate=false;
            	} else {
            		isAlternate= true;
            	}
            }
            
            System.out.println(output.trim());
        }
    }
	
	private static void push(int[] stack, int value, int top){
		stack[top]=value;
	}
	
	private static int pop(int[] stack, int top){
		int val = stack[top];
		stack[top]=0;
		return val;
	}
}
