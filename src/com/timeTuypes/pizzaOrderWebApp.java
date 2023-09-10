package com.timeTuypes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class pizzaOrderWebApp {
    public static void main(String[] args) {
        LocalTime openingInHour = LocalTime.of(11, 0);
        LocalTime closingInHour = LocalTime.of(22, 0);
        System.out.println("Shop opening in " +openingInHour + "Closing time of the Shop:" + closingInHour);

        LocalDate orderDate = LocalDate.now().minusDays(5);
        System.out.println("We ordered the Pizza:" +orderDate);

        LocalDateTime orderDateAndTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println("Pizza ordered " +orderDateAndTime);

        LocalTime deliveryTime = LocalTime.of(1, 20);
        System.out.println("Total time of Delivery" +deliveryTime);

        LocalDateTime expectedDelivery = orderDateAndTime.plusHours(deliveryTime.getHour()).
                plusMinutes(deliveryTime.getMinute());
        System.out.println("The estimeted delivery time:" +expectedDelivery);
        LocalDateTime realDeliveryTime = orderDateAndTime.plusMinutes(90);
        System.out.println("The Real Delivery Date And Time" +realDeliveryTime);

        long realDiffarenceBetweenEstimateAndReal = ChronoUnit.MINUTES.between(expectedDelivery, realDeliveryTime);
        System.out.println("The Real Diffarence Between Minutes:" +realDiffarenceBetweenEstimateAndReal);

        if(expectedDelivery.isBefore(realDeliveryTime)) {
            System.out.println("The pizza has reached before time");
        } else {
            System.out.println("The pizza has not reached before time");
        }
    }
}
