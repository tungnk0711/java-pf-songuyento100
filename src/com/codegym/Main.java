package com.codegym;

public class Main {

    public static void main(String[] args) {
        System.out.println("Prime numbers range from 1 to 100: ");
        for (int i = 1; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.printf("%d ", i);
            }
        }

    }

    /**
     * check so nguyen to
     *
     * @param n: so nguyen duong
     * @return true la so nguyen so,
     * false khong la so nguyen to
     */
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
