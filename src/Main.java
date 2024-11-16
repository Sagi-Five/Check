import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id = "207372095";
        Scanner scanner = new Scanner(System.in);
        int number;
            System.out.print("Please insert a number that greater than 4: ");
            number = scanner.nextInt();
        long startTime = System.currentTimeMillis();
            if (number > 4 && number % 2 == 0) {
                toFindPrime(number);
                primeSubstraction(number);
                decompositionPrime(number);
                count(number);

            }
            else if (number > 4 && number % 2 != 0) {
                System.out.println("Please insert an even number");
            }
            else if (number < 4) {
                System.out.println("You entered an number that lower than 4. Please try again.");
            }
            else if (number == 4) {
                System.out.println("Not included 4 -_-");
            }
        System.out.println("ID: " + id);


        long endTime = System.currentTimeMillis();
        double duration = (endTime - startTime) / 1000.0;
        System.out.println("Runtime " + duration + " seconds");
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void toFindPrime(int number) {
        int p1;
        boolean FoundPair = false;
        for (p1 = 3; p1 < number / 2 && FoundPair == false; p1 += 2) {
            int p2 = number - p1;
            if (isPrime(p1) && isPrime(p2)) {
                System.out.println(number + " = " + p1 + " + " + p2);
                FoundPair = true;
            }
        }
    }

    public static void primeSubstraction(int number) {
        boolean foundPair = false;
        for ( int p3 = 2; p3 < number && foundPair==false; p3++) {
           int p4 = number + p3;
            if (isPrime(p3) && isPrime(p4)) {
                 System.out.println(number + " = " + p4 + " - " + p3);
                foundPair=true;
            }
        }
    }

    public static void count (int number) {
        int primeCount = 0;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        System.out.println("The amount for prime numbers is : " + primeCount);
    }
    public static void decompositionPrime(int number) {
        int i = 2;
        System.out.print(number + " = ");
        while (number > 1) {
            while (number % i == 0) {
                if (i == number) {
                    System.out.println(i);
                }
                else System.out.print(i + " * ");
                number = number / i;
            }
            i++;
        }
    }
}
