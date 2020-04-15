package com.codegym;

public class LazyPrimeFactorization implements Runnable {
    int n;

    public LazyPrimeFactorization(int n) {
        this.n = n;
    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        StringBuilder primes = new StringBuilder("LazyPrimeFactorization: ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.append(i).append(" ");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(primes);
        System.out.println("Time: " + (endTime - startTime));
    }
}
