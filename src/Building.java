import java.util.ArrayList;

public class Building {

        String name;
        ArrayList<Room> rooms = new ArrayList<>();

        public Building(String name) {
            this.name = name;
        }

        public void addRoom(Room room) {
            rooms.add(room);
        }

        public int getTotalLampCount() {
            int total = 0;

            for (Room room : rooms) {
                total += room.getLampCount();
            }

            return total;
        }

        public int getTotalWatt() {
            int total = 0;

            for (Room room : rooms) {
                total += room.getTotalWatt();
            }

            return total;
        }

        public void printBuilding() {
            System.out.println("=== " + name + " ===");

            for (Room room : rooms) {
                room.printRoom();
            }

            System.out.println("Total: " + getTotalLampCount() + " lamper");
            System.out.println("Samlet watt: " + getTotalWatt());
        }
    }


