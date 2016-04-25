package com.icap.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

/**
 * Created by omib on 25/04/2016.
 */
@Service
public class PrimeNumberServiceImpl implements PrimeNumberService
{
    @Override
    public int[] getPrimeNumbers(int limit)
    {
        validateLimit(limit);
        return IntStream.iterate(2, n -> n + 1).parallel().filter(n -> isPrime(n)).limit(limit).toArray();
    }

    @Override
    public int[] getAllPrimeNumbersUpto(int max)
    {
       validateUpperBound(max);
       return IntStream.range(2, max).parallel().filter(n -> isPrime(n)).toArray();
    }

    @Override
    public int[] getAllPrimeNumbersFrom(int min, int limit)
    {
        int validMin=validatelowerBound(min);
        validateLimit(limit);

        return IntStream.iterate(validMin, n -> n + 1).parallel().filter(n -> isPrime(n)).limit(limit).toArray();
    }

    @Override
    public int[] getPrimeNumbersWithLimitAndRange(int limit, int max)
    {
        validateLimit(limit);
        validateUpperBound(max);
        return IntStream.range(2, max).parallel().filter(n -> isPrime(n)).limit(limit).toArray();
    }

    @Override
    public int[] getAllPrimeNumbersInRange(int min, int max)
    {
        int validMin=validatelowerBound(min);
        validateUpperBound(max);
        validateRange(min, max);

        return IntStream.range(validMin, max).parallel().filter(n -> isPrime(n)).toArray();
    }

    @Override
    public int[] getAllPrimeNumbersInRangeWithLimit(int min, int max, int limit, boolean inclusive)
    {

        validateLimit(limit);
        int validMin=validatelowerBound(min);
        validateUpperBound(max);
        validateRange(min, max);


        if (inclusive)
        {
            return IntStream.rangeClosed(validMin, max).parallel().filter(n -> isPrime(n)).toArray();
        }

        return IntStream.range(validMin, max).parallel().filter(n -> isPrime(n)).toArray();
    }

    private boolean isPrime(int candidate)
    {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
    }

    private void validateLimit(int limit)
    {
        if (limit < 0 || limit == 0)
        {
            throw new IllegalArgumentException("Invalid limit.Negative or zero limits not allowed!");
        }
    }

    private void validateUpperBound(int max)
    {
        if (max < 0)
        {
            throw new IllegalArgumentException("Invalid upper bound.Negative upper bounds not allowed!");
        }
    }

    private int validatelowerBound(int min)
    {
        if (min < 0)
        {
            throw new IllegalArgumentException("Invalid lower bound.Negative lower bounds not allowed!");
        }

        int validMin = (min == 0 || min == 1) ? 2:min;
        return validMin;
    }

    private void validateRange(int min,int max)
    {
        if (min > max)
        {
            throw new IllegalArgumentException("Invalid range specified.Please verify min/max arguments");
        }

    }


}
