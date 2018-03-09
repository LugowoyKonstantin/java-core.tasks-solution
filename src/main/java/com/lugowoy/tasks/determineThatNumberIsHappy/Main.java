package com.lugowoy.tasks.determineThatNumberIsHappy;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 17.08.2017. */

public class Main {

    private static final Reader reader = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Enter the number of verification it is \"happy\" : ");
        int number = reader.readInt();

        DeterminableThatNumberIsHappy determinator = DeterminableThatNumberIsHappy::determineThatNumberIsHappy;

        if (determinator.determine(number)) {
            System.out.printf("The entered number %d is \"happy\" .", number);
        } else {
            System.out.printf("The entered number %d is not \"happy\" .", number);
        }

    }

}