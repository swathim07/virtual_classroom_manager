package com.edtech;

import com.edtech.util.ConsoleReader;
import com.edtech.util.CommandHandler;

public class VirtualClassroomManagerApplication {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        CommandHandler commandHandler = new CommandHandler();

        while (true) {
            String input = consoleReader.readLine();
            commandHandler.handleCommand(input);
        }
    }
}
