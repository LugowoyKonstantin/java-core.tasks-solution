package com.lugowoy.tasks.writeProgramToCalculateCoordinatesOfBallThrownAtArbitraryTime;

import com.lugowoy.helper.factory.FactoryPoint;
import com.lugowoy.helper.factory.creator.CreatorPoint;
import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 08.11.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    private static final double g = 9.832;

    public static void main(String[] args) {

        System.out.println("Enter the value of the initial speed (m/sec) : ");
        double initialSpeed = READER.readDouble();

        System.out.println("Enter the value of the angle (degree) under which the ball was thrown : ");
        double angle = Math.toRadians(READER.readDouble());

        System.out.println("Enter the time (seconds) value for which to calculateArithmeticMeanNumbers : ");
        double timeMoment = READER.readDouble();

        double momentOfLastImpactOnSurface = calculateMomentOfLastImpactOnSurface(calculateFlightTimeOfBallBeforeHittingHorizontalSurface(initialSpeed,
                                                                                        angle), timeMoment);

        Point<Double> ballPoint = FactoryPoint.getFactoryPoint(new CreatorPoint<Double>()).create();
        ballPoint.setCoordinateX(Math.round(100 * calculateCoordinateX(initialSpeed, angle, timeMoment)) / 100.0);
        ballPoint.setCoordinateY(Math.round(100 * calculateCoordinateY(initialSpeed, angle, timeMoment, momentOfLastImpactOnSurface)) / 100.0);

        System.out.printf("At the time %f, the position of the thrown ball is at the point with the coordinates : ", timeMoment);
        System.out.println(ballPoint);

    }

    private static double calculateFlightTimeOfBallBeforeHittingHorizontalSurface(double initialSpeed, double angle) {
        return 2 * initialSpeed * Math.sin(angle) / g;
    }

    private static double calculateMomentOfLastImpactOnSurface(double timeFlightBeforeHitting, double timeMoment) {
        return timeFlightBeforeHitting * Math.floor(timeMoment / timeFlightBeforeHitting);
    }

    private static double calculateCoordinateX(double initialSpeed, double angle, double timeMoment) {
        return initialSpeed * Math.cos(angle) * timeMoment;
    }

    private static double calculateCoordinateY(double initialSpeed, double angle, double timeMoment, double momentOfLastImpact) {
        return initialSpeed * Math.sin(angle) * (timeMoment - momentOfLastImpact) - g * (timeMoment - momentOfLastImpact) * (timeMoment - momentOfLastImpact) / 2;
    }

}