package com.icap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by omib on 14/04/2016.
 */
@SpringBootApplication
public class PrimeNumberApp
{
    private static final Logger log = LoggerFactory.getLogger(PrimeNumberApp.class);

    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(PrimeNumberApp.class, args);
    }

}
