package ru.job4j.calculator;

/**
 * Created by M4MIND on 06.08.2017.
 */
public class Calculator {
    double result;

    void add (double first, double second) {
        this.result = first + second;
    }

    public double getResult () {
        return  this.result;
    }
}
