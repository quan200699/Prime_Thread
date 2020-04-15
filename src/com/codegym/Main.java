package com.codegym;

public class Main {

    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(100000);
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(100000);
        Thread thread1 = new Thread(lazyPrimeFactorization);
        Thread thread2 = new Thread(optimizedPrimeFactorization);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
