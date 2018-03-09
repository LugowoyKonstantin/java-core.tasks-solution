package com.lugowoy.tasks.determineThatTicketIsHappy;

import com.lugowoy.helper.other.GeneratorRandomNumber;

import static com.lugowoy.tasks.determineThatTicketIsHappy.DeterminatorThatTicketIsHappy.MAX_VALUE_OF_NUMBER_TICKET;
import static com.lugowoy.tasks.determineThatTicketIsHappy.DeterminatorThatTicketIsHappy.MIN_VALUE_OF_NUMBER_TICKET;

/** Created by Konstantin Lugowoy on 20.08.2017. */

public class Main {

    public static void main(String[] args) {

        Ticket ticket = new Ticket(GeneratorRandomNumber.generateInt(MIN_VALUE_OF_NUMBER_TICKET, MAX_VALUE_OF_NUMBER_TICKET));

        DeterminatorThatTicketIsHappy determinator = DeterminatorThatTicketIsHappy::determineThatTicketIsHappyUsingArithmeticOperators;

        if (determinator.determine(ticket)) {
            System.out.printf("Ticket number %d is \"happy\".", ticket.getNumber());
        } else {
            System.out.printf("Ticket number %d is not \"happy\".", ticket.getNumber());
        }


    }

}