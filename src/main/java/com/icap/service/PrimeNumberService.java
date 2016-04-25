package com.icap.service;

/**
 * Created by omib on 24/04/2016.
 */
public interface PrimeNumberService
{
    /**
     * Returns prime number array of a size equivalent to the the limit argument.
     * Use case: Return first 10 prime numbers or return first 20 prime numbers.
     *
     * @param limit
     * @return
     */
    int[] getPrimeNumbers(int limit);

    /**
     * Returns ALL prime numbers upto the "maximum" threshold argument.
     * Use case: Return ALL prime numbers < 100 or Return ALL prime numbers < 50
     *
     * @param max
     * @return
     */
    int[] getAllPrimeNumbersUpto(int max);


    /**
     * Return prime numbers FROM the specified "minimum" threshold & size limit argument.
     * Use case: Return first 10 prime numbers >= 20.
     *
     * @param min
     * @param limit
     * @return
     */
    int[] getAllPrimeNumbersFrom(int min, int limit);

    /**
     * Returns prime numbers upto the "maximum" threshold AND the size limit arguments.
     * Use case: Return first 10 prime numbers < 100 or Return first 20 prime numbers < 50
     *
     * @param limit
     * @param max
     * @return int[]
     */
    int[] getPrimeNumbersWithLimitAndRange(int limit,int max);

    /**
     * Returns ALL prime numbers BETWEEN the "minimum" & "maximum" thresholds defined in the argument.
     * Use case: Return ALL prime numbers >= 10 && < 100
     *
     * @param min
     * @param max
     * @return int[]
     */
    int[] getAllPrimeNumbersInRange(int min,int max);

    /**
     * Returns prime numbers BETWEEN & (exclusive or inclusive) of the "minimum" & "maximum" thresholds defined in the argument AND applies
     * a size limit on the returned results.
     *
     * Use case: Return 20 prime numbers >= 10 && < 100 or
     *           Return 20 prime numbers >= 10 && <= 100
     *
     * @param min lower limit
     * @param max upper limit
     * @param limit result size limit
     * @param inclusive
     * @return int[]
     */
    int[] getAllPrimeNumbersInRangeWithLimit(int min,int max,int limit,boolean inclusive);

}
