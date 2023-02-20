package ref;

import java.io.Console;

public class PrintConsole {

    public static void main(String[] args) {
        System.out.println("Hello there");

        Console cons = System.console();
        String input = cons.readLine("Enter Something? ");
        String input2 = cons.readLine("Enter Another? ");
        System.out.printf("This is what you entered >>> %s and %s", input, input2);
    }

}