package com.icap.controller;

import com.icap.entity.Response;
import com.icap.service.PrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by omib on 24/04/2016.
 */
@RestController
public class PrimeController
{
    private final PrimeNumberService primeNumberService;

    @Autowired
    public PrimeController(PrimeNumberService primeNumberService)
    {
        this.primeNumberService = primeNumberService;
    }

    @RequestMapping("/getPrimeNumbers")
    public Response getPrimeNUmbers(@RequestParam(value = "limit") int limit)
    {
        int[] primeNumbers = primeNumberService.getPrimeNumbers(limit);
        return new Response(primeNumbers);
    }

    @RequestMapping("/getPrimeNumbersUpto")
    public Response getAllPrimeNumbersUpto(@RequestParam(value = "max") int max)
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersUpto(max);
        return new Response(primeNumbers);
    }

    @RequestMapping("/getPrimeNumbersFrom")
    public Response getAllPrimeNumbersFrom(@RequestParam(value = "min") int min, @RequestParam(value = "limit") int limit)
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersFrom(min, limit);
        return new Response(primeNumbers);
    }

    @RequestMapping("/getPrimeNumbersWithLimitAndRange")
    public Response getPrimeNumbersWithLimitAndRange(@RequestParam(value = "max") int max, @RequestParam(value = "limit") int limit)
    {
        int[] primeNumbers = primeNumberService.getPrimeNumbersWithLimitAndRange(limit, max);
        return new Response(primeNumbers);
    }

    @RequestMapping("/getPrimeNumbersInRange")
    public Response getAllPrimeNumbersInRange(@RequestParam(value = "min") int min, @RequestParam(value = "max") int max)
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersInRange(min, max);
        return new Response(primeNumbers);
    }

    @RequestMapping("/getPrimeNumbersInRangeAndLimit")
    public Response getAllPrimeNumbersInRangeWithLimit(@RequestParam(value = "min") int min, @RequestParam(value = "max") int max,
                                                       @RequestParam(value = "limit") int limit,@RequestParam(value = "inclusive") boolean inclusive)
    {
        int[] primeNumbers = primeNumberService.getAllPrimeNumbersInRangeWithLimit(min, max, limit, inclusive);
        return new Response(primeNumbers);
    }

}
