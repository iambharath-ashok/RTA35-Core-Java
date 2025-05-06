package com.bharath.learning.core.threads.communication;

class Flight {

    private boolean seatAvailable = true;

    public synchronized void bookTicket(String passengerName) throws InterruptedException {

        while (!seatAvailable) {
            System.out.println(passengerName + " is waiting for a seat to be available.");
            this.wait();
        }

        System.out.println(passengerName + "  booked a ticket.");
        seatAvailable = false;
    }

    public synchronized void cancelTicket(String passengerName) {
        System.out.println(passengerName + " has cancelled the ticket.");
        seatAvailable = true;
        this.notify();

    }

}

public class Passenger implements Runnable {

    private String passengerName;
    private Flight flight;

    public Passenger(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public void run() {
        try {
            flight.bookTicket(passengerName);
        } catch (InterruptedException e) {
            System.out.println(passengerName + " was interrupted while booking a ticket.");
        }
    }

}


class FlightReservationApp {

    public static void main(String[] args) throws InterruptedException {

        Flight flight = new Flight();

        Passenger passenger1 = new Passenger("John", flight);
        Passenger passenger2 = new Passenger("Alice", flight);
        Passenger passenger3 = new Passenger("Bob", flight);


        Thread p1 = new Thread(passenger1);
        Thread p2 = new Thread(passenger2);
        Thread p3 = new Thread(passenger3);

        p1.start();
        // Simulate some time before the next passenger tries to book a ticket
        Thread.sleep(100);
        p2.start();
        Thread.sleep(100);
        p3.start();

        Thread.sleep(3000);
        // Simulate cancellation of the ticket by the first passenger
        flight.cancelTicket("John");


    }
}
