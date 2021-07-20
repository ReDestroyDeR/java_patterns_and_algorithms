package red.patterns.behavioural.visitor;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class VisitorGeneral {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Guest guest = new Guest("Ioan");
        hotel.room(guest);
        hotel.bathroom(guest);
        hotel.publicRestroom(guest);
        hotel.reception(guest);
        hotel.room(guest);
        hotel.bathroom(guest);
        hotel.reception(guest);

        for (int i = 0; i < 150; i++) {
            hotel.reception(new Guest(i + ""));
        }
    }
}
