package com.icap.service;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by omib on 25/04/2016.
 */
public class PrimeNumberServiceTest
{
    //Arrange
    private final PrimeNumberService primeNumberService = new PrimeNumberServiceImpl();

    @Test
    public void testGetPrimeNumbers()
    {
        //Act
        int[] primeNumbers = primeNumberService.getPrimeNumbers(10);

        //Assert
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        assertEquals(10, primeNumbers.length);
    }

    @Test
    public void testGetPrimeNumbersUpto()
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersUpto(12);

        //Assert
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        assertEquals(5, primeNumbers.length);

    }

    @Test
    public void testGetPrimeNumbersFrom()
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersFrom(10, 10);

        //Assert
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        assertEquals(10, primeNumbers.length);
    }

    @Test
    public void testGetPrimeNumbersInRange()
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersInRange(10, 30);

        //Assert
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        assertEquals(6, primeNumbers.length);
    }

    @Test
    public void testGetPrimeNumbersInRangeAndLimitExclusive()
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersInRangeWithLimit(10, 19, 3, false);

        //Assert
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        assertEquals(3, primeNumbers.length);
    }

    @Test
    public void testGetPrimeNumbersInRangeAndLimitInclusive()
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersInRangeWithLimit(10,19,5,true);

        //Assert
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        assertEquals(4, primeNumbers.length);
    }

    @Test
    public void testGetPrimeNumbersWithUpperLimitAndRange()
    {
        int[] primeNumbers = primeNumberService.getPrimeNumbersWithLimitAndRange(20,100);

        //Assert
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        assertEquals(20, primeNumbers.length);
    }





}
