package edu.wctc;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate joshTree = LocalDate.of(1987,3,9);
        LocalDate rattleHum = LocalDate.of(1988,10,10);
        LocalDate current = LocalDate.now();

        Period first = Period.between(joshTree,current);
        Period second = Period.between(joshTree,rattleHum);
        LocalDate third = rattleHum.plus(second);

        System.out.println("Time since The Joshua Tree release: " + first);
        System.out.println("Release of Rattle and Hum since The Joshua Tree: " + second);
        System.out.println("Release of hypothetical third album: " + third);

    }
}