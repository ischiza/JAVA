import java.io.*;
import java.net.*;

public class Connection
{
    public static void main(String[] args) throws Exception
    {
        new Connection();
    }
    public Connection() throws Exception
    {
        URL url = new URL("http://www.fetagracollege.org"); //The URL
        HttpURLConnection huc = connect(url); //Connects to the website
        huc.connect(); //Opens the connection
        String str = readBody(huc); //Reads the response
        huc.disconnect(); //Closes
        System.out.println(str); //Prints all output to the console
    }

    private String readBody(HttpURLConnection huc) throws Exception //Reads the response
    {
        InputStream is = huc.getInputStream(); //Inputstream
        BufferedReader rd = new BufferedReader(new InputStreamReader(is)); //BufferedReader
        String line;
        StringBuffer response = new StringBuffer();
        while ((line = rd.readLine()) != null)
        {
            response.append(line); //Append the line
            response.append('\n'); //and a new line
        }
        rd.close();
        return response.toString();
    }

    private HttpURLConnection connect(URL url) throws Exception //Connect to the URL
    {
        HttpURLConnection huc = (HttpURLConnection) url.openConnection(); //Opens connection to the website
        huc.setReadTimeout(15000); //Read timeout - 15 seconds
        huc.setConnectTimeout(15000); //Connecting timeout - 15 seconds
        huc.setUseCaches(false); //Don't use cache
        HttpURLConnection.setFollowRedirects(true); //Follow redirects if there are any
        huc.addRequestProperty("Host", "www.fetagracollege.org"); //www.fetagracollege.org is the host
        huc.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.57 Safari/537.36"); //Chrome user agent
        return huc;
    }
}