package com.busticketbooking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookingSystem system =
                new BookingSystem();

        while (true) {

            System.out.println("\n===== BUS TICKET BOOKING SYSTEM =====");

            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. View Available Buses");
            System.out.println("4. Book Ticket");
            System.out.println("5. View My Tickets");
            System.out.println("6. Cancel Ticket");
            System.out.println("7. Bus Summary");
            System.out.println("8. Exit");

            System.out.print("Enter choice : ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    system.signUp(scanner);
                    break;

                case 2:
                    system.login(scanner);
                    break;

                case 3:
                    system.showAvailableBuses();
                    break;

                case 4:
                    system.bookTicket(scanner);
                    break;

                case 5:
                    system.viewTickets();
                    break;

                case 6:
                    system.cancelTicket(scanner);
                    break;

                case 7:
                    system.showBusSummary();
                    break;

                case 8:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

}
