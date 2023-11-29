import java.util.ArrayList;
import java.util.Scanner;

class Ticket {
    private String movieName;
    private int seatNumber;
    private double ticketPrice;

    public Ticket(String movieName, int seatNumber, double ticketPrice) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public String toString() {
        return "Movie: " + movieName + "\nSeat Number: " + seatNumber + "\nTicket Price: $" + ticketPrice;
    }
}

class Snack {
    private String snackName;
    private double snackPrice;

    public Snack(String snackName, double snackPrice) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public String toString() {
        return "Snack: " + snackName + "\nSnack Price: $" + snackPrice;
    }
}

class Member {
    private String memberName;
    private double discount;

    public Member(String memberName, double discount) {
        this.memberName = memberName;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public String toString() {
        return "Member: " + memberName + "\nDiscount: " + (discount * 100) + "%";
    }
}

class BookingSystem {
    private ArrayList<Ticket> tickets;
    private ArrayList<Snack> snacks;
    private Member member;

    public BookingSystem() {
        tickets = new ArrayList<>();
        snacks = new ArrayList<>();
    }

    public void bookTicket(String movieName, int seatNumber, double ticketPrice) {
        Ticket ticket = new Ticket(movieName, seatNumber, ticketPrice);
        tickets.add(ticket);
    }

    public void buySnack(String snackName, double snackPrice) {
        Snack snack = new Snack(snackName, snackPrice);
        snacks.add(snack);
    }

    public void addMember(String memberName, double discount) {
        member = new Member(memberName, discount);
    }

    public double calculateTotal() {
        double total = 0;

        for (Ticket ticket : tickets) {
            total += ticket.getTicketPrice();
        }

        for (Snack snack : snacks) {
            total += snack.getSnackPrice();
        }

        if (member != null) {
            total *= (1 - member.getDiscount()); // Apply member discount
        }

        return total;
    }

    public void printBookingDetails() {
        System.out.println("Booking Details:");

        for (Ticket ticket : tickets) {
            System.out.println(ticket);
            System.out.println("---");
        }

        for (Snack snack : snacks) {
            System.out.println(snack);
            System.out.println("---");
        }

        if (member != null) {
            System.out.println(member);
            System.out.println("---");
        }

        System.out.println("Total Payment: $" + calculateTotal());
    }
}

public class tester {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        bookingSystem.bookTicket("Avengers: Endgame", 1, 12.50);
        bookingSystem.buySnack("Popcorn", 5.00);
        bookingSystem.addMember("John Doe", 0.10);

        bookingSystem.printBookingDetails();
    }
}
