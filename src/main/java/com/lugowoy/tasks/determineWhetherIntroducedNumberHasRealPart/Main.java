package com.lugowoy.tasks.determineWhetherIntroducedNumberHasRealPart;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 01.10.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Enter real number : ");
        double number = READER.readDouble();

        Determinator determinator = Determinator::determineWhetherIntroducedNumberHasRealPart;
        if (determinator.determine(number)) {
            System.out.printf("The entered number %.1f has a real part", number);
        } else {
            System.out.printf("The entered number %.1f does not have a real part", number);
        }

    }

}