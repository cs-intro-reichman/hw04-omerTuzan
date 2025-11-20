public class Primes {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        boolean[] numbers = new boolean[num + 1];

        String primeOut = String.format("Prime numbers up to %s:%n", num);
        int primes = 2;
        int nonPrimes = 0;
        int primeCount = 0;
        
        for (int i = 2; i <= num; i++ ) {
            numbers[i] = true;
        }

        while (primes * primes <= num) {
            nonPrimes = primes * primes;
            while(nonPrimes <= num ) {
                numbers[nonPrimes] = false;
                nonPrimes += primes;
            }
            primes += 1;
        }

        for (int i = 2; i <= num; i++ ) {
            if (numbers[i] == true) {
               primeOut += i + "\n";
               primeCount++; 
            }
        }
        primeOut += String.format("There are %s primes between 2 and %s (%s%% are primes)", primeCount, num, (int)100f * primeCount/num);
        
        System.out.println(primeOut);

        
    }
}