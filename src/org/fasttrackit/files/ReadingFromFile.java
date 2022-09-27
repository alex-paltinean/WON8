package org.fasttrackit.files;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        readingFirstLine();
        readingAllFile();
        readFileBuffered();
    }

    private static void readFileBuffered() throws IOException {
        System.out.println("Buffered read:");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/content.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void readingAllFile() throws FileNotFoundException {
        System.out.println("Starting to read all file!");
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    private static void readingFirstLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        String s = scanner.next();
        int i = scanner.nextInt();
        System.out.println(s);
        System.out.println(i);
    }
}
