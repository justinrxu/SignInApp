package com.example.justinxu.signinapp;

/**
 * Created by Phoenix on 2/24/2018.
 */

import java.net.*;
import java.io.*;

public class HTTPReader {
    public static void main() {

    }

    public static void read(String[] args, String link) throws Exception {
        //create URL
        URL oracle = new URL(link);
        //URL connection
        URLConnection yc = oracle.openConnection();
        //read stream
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            // change this to something useful
            System.out.println(inputLine);
        in.close();

    }
}