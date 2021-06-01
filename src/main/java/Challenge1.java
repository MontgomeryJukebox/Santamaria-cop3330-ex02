import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the input string?");
        String input = in.nextLine();
        while (input.length() == 0) {
            System.out.println("You must enter something into the program");
            input = in.nextLine();
        }
        System.out.println(input + " has " + input.length() + " characters");
    }
}
