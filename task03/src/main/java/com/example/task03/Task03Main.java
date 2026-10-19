package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        System.out.println(readAsString(new FileInputStream("task03/src/test/resources/input.test"),
                Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // 1. Проверка на null (хорошая практика)
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException("InputStream и Charset не могут быть null");
        }

        Reader reader = new InputStreamReader(inputStream, charset);

        StringBuilder sb = new StringBuilder();

        char[] buffer = new char[1024];
        int charsRead;

        while ((charsRead = reader.read(buffer)) != -1) {
            sb.append(buffer, 0, charsRead);
        }
        return sb.toString();
    }
}
