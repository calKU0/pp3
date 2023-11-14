public class CinemaTicketMain {
    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket("Avengers",2,15);
        CinemaTicket ticket2 = new CinemaTicket("Kot w Butach",5,12);

        System.out.println(ticket1.toString());
        System.out.println(ticket2.toString());
    }
}
