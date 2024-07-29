package com.edtech.util;

import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner;

    public ConsoleReader() {
        scanner = new Scanner(System.in);
    }

    public String readLine() {
        System.out.print("> ");
        return scanner.nextLine();
    }
}
