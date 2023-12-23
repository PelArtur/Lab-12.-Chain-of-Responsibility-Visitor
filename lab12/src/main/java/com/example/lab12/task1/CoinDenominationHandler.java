package com.example.lab12.task1;

public class CoinDenominationHandler implements CoinHandler
{
    private final int denomination;
    private CoinHandler nextHandler;

    public CoinDenominationHandler(int denomination)
    {
        this.denomination = denomination;
    }

    public void setNextHandler(CoinHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }

    @Override
    public StringBuilder handleRequest(int amount, StringBuilder res) {
        int numCoins = amount / denomination;
        int remainder = amount % denomination;

        if (numCoins > 0)
        {
            String curr = numCoins + " x " + denomination + " coin(s)\n";
            res.append(curr);
        }

        if (remainder != 0 && nextHandler != null)
        {
            return nextHandler.handleRequest(remainder, res);
        }
        else if (remainder != 0) {
            return new StringBuilder("It is not possible to provide the needed amount of money.\n");
        }
        else
        {
            return res.append("-------------\n");
        }
    }
}
