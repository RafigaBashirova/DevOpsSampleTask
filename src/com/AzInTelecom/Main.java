package com.AzInTelecom;


import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i = 1;
        while(true) {
            System.out.println("Hello , this is line number: " + i);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i = i + 1;
        }

    }
}