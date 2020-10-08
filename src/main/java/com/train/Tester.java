package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tickets = 0;
        while (tickets != -1) {
            System.out.print("Please enter number of tickets: ");
            tickets = scanner.nextInt();
            if(tickets == -1){
                break;
            }
            System.out.print("How many round-trip tickets: ");
            int roundTripTickets = scanner.nextInt();
            Ticket ticket = new Ticket(tickets, roundTripTickets);
            ticket.total();

        }
    }
}
