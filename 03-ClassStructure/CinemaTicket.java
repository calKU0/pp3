public class CinemaTicket {
    static final String cinemaName = "CinemaCity";
    String filmTitle;
    int row;
    int seat;
    float price;

    CinemaTicket(String filmTitle, int row, int seat)
    {
        this.row = row;
        this.seat = seat;
        this.filmTitle = filmTitle;

        if (row < 3)
        {
            this.price = 10;
        }
        else
        {
            this.price = 25;
        }
    }

    @Override
    public String toString() {
        return "Row: " + this.row + "\nSeat: " + this.seat + "\nCinema name: " + cinemaName + "\nFilm title: " + this.filmTitle + "\nPrice: " + this.price;
    }
}