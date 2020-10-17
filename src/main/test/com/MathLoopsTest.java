package com;

import org.junit.Test;

import org.junit.Assert;

public class MathLoopsTest {

    @Test
    public void sumOne() {
        int start = 0;
        int stop = 10;
        int expected = 55;
        Assert.assertEquals(expected, MathLoops.sum(start, stop));
    }

    @Test
    public void sumTwo() {
        int start = -3;
        int stop = 5;
        int expected = 9;
        Assert.assertEquals(expected, MathLoops.sum(start, stop));
    }

    @Test
    public void sumThree() {
        int start = 10;
        int stop = 0;
        int expected = 0;
        Assert.assertEquals(expected, MathLoops.sum(start, stop));
    }

    @Test
    public void sumFour() {
        int start = 10;
        int stop = 10;
        int expected = 10;
        Assert.assertEquals(expected, MathLoops.sum(start, stop));
    }

    @Test
    public void factorialWithNegative() {
        Assert.assertEquals(0, MathLoops.factorial(-2));
    }

    @Test
    public void factorialWithZero() {
        Assert.assertEquals(1, MathLoops.factorial(0));
    }

    @Test
    public void factorialWithOne() {
        Assert.assertEquals(1, MathLoops.factorial(1));
    }

    @Test
    public void factorialWithPositive() {
        Assert.assertEquals(120, MathLoops.factorial(5));
    }

    @Test
    public void collatzOne() {
        Assert.assertEquals(19, MathLoops.collatz(9));
    }

    @Test
    public void collatzTwo() {
        Assert.assertEquals(0, MathLoops.collatz(1));
    }

    @Test
    public void collatzThree() {
        Assert.assertEquals(118, MathLoops.collatz(97));
    }

    @Test
    public void fibonacciZero() {
        Assert.assertEquals(0, MathLoops.fibonacci(0));
    }

    @Test
    public void fibonacciOne() {
        Assert.assertEquals(1, MathLoops.fibonacci(1));
    }

    @Test
    public void fibonacciTen() {
        Assert.assertEquals(55, MathLoops.fibonacci(10));
    }
}