package com.example.lab12.task1;

public interface CoinHandler
{
    StringBuilder handleRequest(int amount, StringBuilder res);
    void setNextHandler(CoinHandler nextHandler);
}
