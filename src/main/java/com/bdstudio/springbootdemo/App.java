package com.bdstudio.springbootdemo;

import org.springframework.boot.SpringApplication;

import com.bdstudio.springbootdemo.controller.SampleController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SampleController.class, args);
    }
}
