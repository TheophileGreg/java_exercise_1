import java.util.Scanner;

public class Launcher {

    public static int fib(int n) {
        if (n < 2)
            return (n);
        return (fib(n - 2) + fib(n - 1));
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Bienvenue petit codeur");
        String inputUser = myObj.nextLine();

        while (!inputUser.equals("quit")) {
            if (inputUser.equals("fibo")) {
                System.out.println("Veuillez saisir un nombre");
                int indexFibo = myObj.nextInt();
                myObj.nextLine();
                System.out.println(fib(indexFibo));
            } else {
                System.out.println("Unknown command");
            }
            inputUser = myObj.nextLine();
        }
        System.exit(0);
    }
}
