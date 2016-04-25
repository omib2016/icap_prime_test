package com.icap.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by omib on 24/04/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response
{
    private final int[] primeNumbers;

    public Response(int[] primeNumbers)
    {
        this.primeNumbers = primeNumbers;
    }

    public int[] getPrimeNumbers()
    {
        return primeNumbers;
    }
}
