package red.patterns.behavioural.visitor;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Hotel {
    private final Guest[] rooms = new Guest[100];

    public void reception(Guest guest) {
        if (!hasRoom(guest)) {
            try {
                allocateRoom(guest);
            } catch (NoRoomsException e) {
                System.err.println(e.getClass().getSimpleName() + " - " + e.getMessage());
                return;
            }
            System.out.println(guest + " has been allocated a room");
            return;
        }

        revokeRoom(guest);
        System.out.println(guest + " room was taken back");
    }

    public void room(Guest guest) {
        if (hasRoom(guest)) {
            System.out.println(guest + " room is awesome");
            return;
        }

        System.out.println(guest + " wonders how his room would've looked like in this hotel");
    }

    public void bathroom(Guest guest) {
        if (hasRoom(guest)) {
            System.out.println(guest + " took a shower in his own bathroom");
            return;
        }

        System.out.println(guest + " doesn't have his own room so he went to the public restroom");
        publicRestroom(guest);
    }

    public void publicRestroom(Guest guest) {
        System.out.println(guest + " washed his hands in a public restroom");
    }

    private boolean hasRoom(Guest guest) {
        return Arrays.asList(rooms).contains(guest);
    }

    private void allocateRoom(Guest guest) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = guest;
                return;
            }
        }

        throw new NoRoomsException("No space for " + guest);
    }

    private void revokeRoom(Guest guest) {
        if (!hasRoom(guest))
            throw new NoSuchElementException();

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(guest)) {
                rooms[i] = null;
                return;
            }
        }
    }
}
