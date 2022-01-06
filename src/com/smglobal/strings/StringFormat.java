package com.smglobal.strings;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class StringFormat {

    public static void main(String[] args){

        String str ="hello world";

        String s1 = String.format("The value %s ", str);
        System.out.println(s1);

        float valueFloat = 3.223232F;

        String s2 = String.format("The value float %f ", valueFloat);
        System.out.println(s2);

        String s3 = String.format("The value float %32.16f", 32.33434);
        System.out.println(s3);

        String url = "https://api.jikan.moe/v3/search/anime?q=naruto";
        System.out.println(getJSON(url));

    }


    public static String getJSON(String url) {
        HttpsURLConnection con = null;
        try {
            URL u = new URL(url);
            con = (HttpsURLConnection) u.openConnection();

            con.connect();


            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            return sb.toString();


        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }  finally {
            if (con != null) {
                try {
                    con.disconnect();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }

}
