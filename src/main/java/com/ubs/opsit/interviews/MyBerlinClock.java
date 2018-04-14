package com.ubs.opsit.interviews;

/**
 * Created by Animesh_Kotwal on 4/14/2018.
 */
public class MyBerlinClock {

    public static void main(String[] args) {

        TimeConverter timeConverter = new TimeImpl();
        System.out.println(timeConverter.convertTime("13:17:01"));

    }
}
