package com.example.lab12.task1;

public class Task1Example {
    public static void main(String[] args)
    {
        int[] coinDenominations1 = {1, 5, 10, 20, 50};
        int[] coinDenominations2 = {1, 2, 5, 10, 15, 20, 30, 40};
        int[] coinDenominations3 = {10, 20, 50};
        ATM atm1 = new ATM(coinDenominations1);
        ATM atm2 = new ATM(coinDenominations2);
        ATM atm3 = new ATM(coinDenominations3);

        int amount1 = 93;
        System.out.println("Withdrawal: " + amount1);
        System.out.println("ATM1: \n" + atm1.withdraw(amount1));
        System.out.println("ATM2: \n" + atm2.withdraw(amount1));
        System.out.println("ATM3: \n" + atm3.withdraw(amount1));

        int amount2 = 13139;
        System.out.println("Withdrawal: " + amount2);
        System.out.println("ATM1: \n" + atm1.withdraw(amount2));
        System.out.println("ATM2: \n" + atm2.withdraw(amount2));

        int amount3 = 9;
        System.out.println("Withdrawal: " + amount3);
        System.out.println("ATM1: \n" + atm1.withdraw(amount3));
        System.out.println("ATM2: \n" + atm2.withdraw(amount3));

        int amount4 = 0;
        System.out.println("Withdrawal: " + amount4);
        System.out.println("ATM1: \n" + atm1.withdraw(amount4));
    }

}
