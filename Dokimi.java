import java.io.*;
import java.util.*;
import javax.swing.text.*;
import javax.swing.text.html.*;
import javax.swing.text.html.parser.*;
import java.net.URL;
import java.util.HashSet;


public class Dokimi {
   public static void main(String [] args) throws Exception {



       HTMLEditorKit.Parser parser = new ParserDelegator();
       final List<String> links = new ArrayList<String>();
       URL url = new URL("http://www.google.com/");
	   url.openConnection();

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        HashSet<URL> Hset = new HashSet<URL>();


       parser.parse(br, new HTMLEditorKit.ParserCallback(){

           public void handleStartTag(HTML.Tag t, MutableAttributeSet a, int pos) {

               if(t == HTML.Tag.A) {
                   Object link = a.getAttribute(HTML.Attribute.HREF);
                   if(link != null) {
                       Hset.add(url);
                   }
               }
           }
       }, true);

       br.close();

       URL url1 = new URL("http://www.bbc.com/");
       Hset.add(url1);
       System.out.println(Hset);
   }
}