public class Main {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Welcome to prime numbers!");
        System.out.println("Here are the prime numbers between 2 and 100:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Prime numbers up to 100:\n");

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("-------------------------------------------------------------------------");
    }
}
