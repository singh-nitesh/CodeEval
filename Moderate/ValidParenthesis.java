import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ValidParenthesis {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            char[] stack = new char[line.length()];
            int top=-1;
            int i = 0;
            for(i=0;i<line.length();i++){
                if(line.charAt(i)=='('){
                	top++;
                	stack[top] = '(';
                } else if(line.charAt(i)=='{'){
                	top++;
                	stack[top] = '{';
                } else if(line.charAt(i)=='['){
                	top++;
                	stack[top] = '[';
                }
                if(line.charAt(i)==')'){
                	if(top==-1 || stack[top]!='('){
                		break;
                	}
                	top--;
                } else if(line.charAt(i)=='}'){
                	if(top==-1 || stack[top]!='{'){
                		break;
                	}
                	top--;
                } else if(line.charAt(i)==']'){
                	if(top==-1 || stack[top]!='['){
                		break;
                	}
                	top--;
                }
            }
            System.out.println((i==line.length()&&(i%2==0))?"True":"False");
        }
    }
}
