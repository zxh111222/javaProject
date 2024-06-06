package day20240605.url_demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 06  17:50
 */
public class URLReading {
    public static void main(String[] args) throws IOException {
        URL oracle = new URL("https://www.baidu.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

        in.close();
    }
}
