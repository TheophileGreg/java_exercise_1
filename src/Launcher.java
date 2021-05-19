import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Bienvenue petit codeur");
        String inputUser = myObj.nextLine();

        while (!inputUser.equals("quit")) {
            if (!inputUser.equals("quit")) {
                System.out.println("Unknown command");
            }
            inputUser = myObj.nextLine();
        }
        System.exit(0);
    }
}
