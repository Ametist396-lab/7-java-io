package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        System.out.println(readAsString(new FileInputStream("task03/src/test/resources/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder text = new StringBuilder();
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        int b;
        while ((b = reader.read()) != -1) {
            text.append((char)b);
        }
        return text.toString();
    }
}
