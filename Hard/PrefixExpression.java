import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class PrefixExpression {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(" ");
            float[] stack = new float[input.length];
            int top=-1;
            for(int i=input.length-1;i>=0;i--){
            	float a=0;
            	float b=0;
            	if(input[i].equals("+")){
            		a=stack[top];
            		top--;
            		b=stack[top];
            		stack[top]=a+b;
            	}else if(input[i].equals("-")){
            		a=stack[top];
            		top--;
            		b=stack[top];
            		stack[top]=a-b;
            	}else if(input[i].equals("*")){
            		a=stack[top];
            		top--;
            		b=stack[top];
            		stack[top]=a*b;
            	}else if(input[i].equals("/")){
            		a=stack[top];
            		top--;
            		b=stack[top];
            		stack[top]=a/b;
            	} else {
            		top++;
            		stack[top]=Integer.parseInt(input[i]);
            	}
            }
            System.out.println((int)stack[top]);
        }
    }
}
