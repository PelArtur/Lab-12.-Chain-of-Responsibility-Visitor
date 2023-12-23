package com.example.lab12.task1;

import java.util.Arrays;

public class ATM
{
    private CoinHandler HandlerChainHead;

    public ATM(int[] coinDenominations)
    {
        Arrays.sort(coinDenominations);
        int length = coinDenominations.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = coinDenominations[i];
            coinDenominations[i] = coinDenominations[length - i - 1];
            coinDenominations[length - i - 1] = temp;
        }
        buildChain(coinDenominations);
    }

    public StringBuilder withdraw(int amount)
    {
        if(amount < 1)
        {
            return new StringBuilder("Unable to process the given amount. The amount must be greater than zero.\n");
        }
        else
        {
            StringBuilder message = new StringBuilder("-------------\n");
            return HandlerChainHead.handleRequest(amount, message);
        }
    }

    private void buildChain(int[] coinDenominations)
    {
        CoinHandler prevHandler = null;

        for (int denomination : coinDenominations)
        {
            CoinHandler currentHandler = new CoinDenominationHandler(denomination);

            if (prevHandler != null)
            {
                prevHandler.setNextHandler(currentHandler);
            }
            else
            {
                this.HandlerChainHead = currentHandler;
            }

            prevHandler = currentHandler;
        }
    }
}
