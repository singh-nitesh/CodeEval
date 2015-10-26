import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class EmailValidation {
	public static void main (String[] args) throws IOException {
        File file = new File("c:\\aaa.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String regex = "^(\"[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-\\+\\@]+)*\"|[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-\\+]+)*)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        	System.out.println(line.matches(regex));
        }
    }
}


/*
disposable.style.email.with+156@example.com
a"b(c)d,e:f;g<h>i[j\k]l@example.com

very.common@example.com
1@d.net
bob123@alice123.com
this is not true
Abc.example.com
<invalid>@foo.com
just"not"right@example.com
hfij#kjdfvkl
disposable.style.email.with+symbol@example.com
"very.unusual.@.unusual.com"@example.com
b@domain.net
this\ still\"not\\allowed@example.com
asterisk_domain@foo.*
A@b@c@example.com
this is"not\allowed@example.com
a.little.lengthy.but.fine@dept.example.com
b@d.net
niceandsimple@example.com

*/