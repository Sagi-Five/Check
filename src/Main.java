import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Please insert a number that greater than 4: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 4 && number % 2 == 0) {
                    System.out.println(number + " is even");
                } else {
                    System.out.println("is not an integer");}

            }
            else {
                    System.out.println("Incorrect number :( Try again");
                }
        }
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {return false;}
            else if (number % (i+1) == 0) {return true;}
            System.out.println(isPrime(number));
        }
        return true;

    }
    public static void findPrime(int number) {
        int p1, p2;
        for (p1 = 2; p1 <= number / 2; p1++) {
            if (isPrime(p1)) {
                p2 = number - p1;
                if (isPrime(p2));
                System.out.println(number + " is prime " + p1);
                return;
            }
        }
        System.out.println(number + " is not prime " + p1);
    }
}
