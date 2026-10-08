import java.util.ArrayList;

public class Room {

        String name;
        ArrayList<Lamp> lamps = new ArrayList<>();
        ArrayList<Window> windows = new ArrayList<>();

        public Room(String name) {
            this.name = name;
        }

        public void addLamp(Lamp lamp) {
            lamps.add(lamp);
        }

        public void addWindow(Window window) {
            windows.add(window);
        }

        public int getLampCount() {
            return lamps.size();
        }

        public int getTotalWatt() {
            int total = 0;

            for (Lamp lamp : lamps) {
                total += lamp.watt;
            }

            return total;
        }

        public int getTotalWindowArea() {
            int total = 0;

            for (Window window : windows) {
                total += window.getAreaCm2();
            }

            return total;
        }

        public void printRoom() {
            System.out.println(name);
            System.out.println("Lamper: " + lamps);
            System.out.println("Vinduer: " + windows);
            System.out.println("Antal lamper: " + getLampCount());
            System.out.println("Samlet watt: " + getTotalWatt());
            System.out.println("Vinduesareal: " + getTotalWindowArea() + " cm2");
            System.out.println();
        }
    }


