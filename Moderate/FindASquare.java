import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FindASquare {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\bbb.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] input = line.split(", ");
            int x1=Integer.parseInt(input[0].substring(1,input[0].indexOf(',')));
            int y1=Integer.parseInt(input[0].substring(input[0].indexOf(',')+1,input[0].indexOf(')')));
            int x2=Integer.parseInt(input[1].substring(1,input[1].indexOf(',')));
            int y2=Integer.parseInt(input[1].substring(input[1].indexOf(',')+1,input[1].indexOf(')')));
            int x3=Integer.parseInt(input[2].substring(1,input[2].indexOf(',')));
            int y3=Integer.parseInt(input[2].substring(input[2].indexOf(',')+1,input[2].indexOf(')')));
            int x4=Integer.parseInt(input[3].substring(1,input[3].indexOf(',')));
            int y4=Integer.parseInt(input[3].substring(input[3].indexOf(',')+1,input[3].indexOf(')')));
            boolean result= false;
            int difX12=Math.abs(x1-x2);
            int difX13=Math.abs(x1-x3);
            int difX14=Math.abs(x1-x4);
            int difX23=Math.abs(x2-x3);
            int difX24=Math.abs(x2-x4);
            int difX34=Math.abs(x3-x4);
            int difY12=Math.abs(y1-y2);
            int difY13=Math.abs(y1-y3);
            int difY14=Math.abs(y1-y4);
            int difY23=Math.abs(y2-y3);
            int difY24=Math.abs(y2-y4);
            int difY34=Math.abs(y3-y4);
            
            
            double a = Math.round(Math.sqrt(difX12*difX12+difY12*difY12)*1000);
            double b = Math.round(Math.sqrt(difX13*difX13+difY13*difY13)*1000);
            double c = Math.round(Math.sqrt(difX14*difX14+difY14*difY14)*1000);
            double d = Math.round(Math.sqrt(difX23*difX23+difY23*difY23)*1000);
            double e = Math.round(Math.sqrt(difX24*difX24+difY24*difY24)*1000);
            double f = Math.round(Math.sqrt(difX34*difX34+difY34*difY34)*1000);
            
            if(a==0 && b==0 && c==0 && d==0 && e==0 && f==0){
            	result=false;
            }else if(a==b && b==c && c==d){
            	if(e==f)
            		result=true;
            } else if(b==c && c==d && d==e){
            	if(f==a)
            		result=true;
            } else if(c==d && d==e && e==f){
            	if(a==b)
            		result=true;
            } else if(e==f && f==a && a==b) {
            	if(c==d)
            		result= true;
            } else if(f==a && a==b && b==c){
            	if(d==e)
            		result=true;
            } else if(a==d && d==e && f==e){
            	if(b==c)
            		result=true;
            } else if(b==d && d==e && e==f){
            	if(a==c)
            		result=true;
            } else if(e==f && f==c && c==b) {
            	if(a==d)
            		result= true;
            } else if(a==c && c==e && e==f){
            	if(b==d)
            		result=true;
            } else if(a==c && c==f && f==d) {
            	if(b==e)
            		result= true;
            } else if(a==c && c==d && d==e){
            	if(b==f)
            		result=true;
            } else if(a==b && b==d && d==f){
            	if(c==e)
            		result=true;
            } else if(a==b && b==d && d==e){
            	if(f==c)
            		result=true;
            } else if(a==b && b==c && c==e) {
            	if(d==f)
            		result= true;
            }  else if(b==c && c==d && d==f) {
            	if(a==e)
            		result= true;
            }         
            System.out.println(result);
        }
    }
}
