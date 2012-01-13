package insomnia.cleanhtml;

import org.owasp.validator.html.*;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    
	try {
	    String output = "<p>Hello World!</p><script>alert(\"Hello World\")</script>" ;

	    File file = new File(".");

	    String dir = file.getCanonicalPath();
	    System.out.println("The current directory is " + dir);
	    Policy policy = Policy.getInstance("antisamy-policy.xml");
	    AntiSamy as = new AntiSamy();
	    CleanResults cleanResults = as.scan(output, policy);
	    System.out.println(cleanResults.getCleanHTML());
	} 
	catch(Exception e) {
	    e.printStackTrace() ; 
	}
    }
}
