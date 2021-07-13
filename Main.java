import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public static void main(String[] args) {
        mainMenu();
        clearScreen();
        System.out.print("Thank you!");
    }

    static void mainMenu() {
        while (true) {
            clearScreen();
            System.out.println(reservations);
            System.out.print("System Menu\n" + "\n" + "a. View All Reservation\n" + "b. Make Reservation\n"
                    + "c. Delete Reservation\n" + "d. Generate Report\n" + "e. Exit\n" + "\n" + "Choose:");
            try {
                String choice = scan.next().toLowerCase();
                switch (choice) {
                    case "b":
                        makeReservation();
                        break;
                    case "e":
                        return;
                    default:
                        continue;
                }
            } catch (Exception e) {
                scan.close();
                continue;
            }
        }
    }

    static void makeReservation() {
        scan.nextLine();
        while (true) {
            clearScreen();
            System.out.println("Make reservation\n");
            System.out.print("Enter Name:");
            String name = scan.nextLine();
            System.out.print("Enter Date:");
            String date = scan.nextLine();
            System.out.print("Enter Time:");
            String time = scan.nextLine();
            System.out.print("Enter No. of Adults:");
            int noOfAdults = scan.nextInt();
            System.out.print("Enter No. of Children:");
            int noOfChildren = scan.nextInt();
            // Reservation reservation = new Reservation(name, date, time, noOfAdults,
            // noOfChildren);
            // reservations.add(reservation);
            reservations.add(new Reservation(name, date, time, noOfAdults, noOfChildren));
            return;
        }
    }

    static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
        }
    }

}

class Reservation {
    String name;
    String date;
    String time;
    int noOfAdults;
    int noOfChildren;

    public Reservation(String name, String date, String time, int noOfAdults, int noOfChildren) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.noOfAdults = noOfAdults;
        this.noOfChildren = noOfChildren;
    }

    @Override
    public String toString() {
        return String.format("\nname:%s\n" + "date:%s\n" + "time:%s\n" + "No. of Adults:%s\n" + "No. of Children:%s\n",
                this.name, this.date, this.time, this.noOfAdults, this.noOfChildren);
    }
}