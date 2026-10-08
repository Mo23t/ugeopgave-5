import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {

            // DEL 1 - BYGNING

            Building building = new Building("Min skole");

            Room room1 = new Room("Klasselokale");
            room1.addLamp(new Lamp(60));
            room1.addLamp(new Lamp(40));
            room1.addWindow(new Window(120, 90));

            Room room2 = new Room("Køkken");
            room2.addLamp(new Lamp(40));
            room2.addLamp(new Lamp(40));
            room2.addWindow(new Window(60, 60));

            Room room3 = new Room("Kontor");
            room3.addLamp(new Lamp(100));
            room3.addLamp(new Lamp(60));
            room3.addWindow(new Window(100, 80));

            building.addRoom(room1);
            building.addRoom(room2);
            building.addRoom(room3);

            building.printBuilding();


            // DEL 2 - DYR

            System.out.println("=== DYREKONKURRENCE ===");

            ArrayList<Animal> animals = new ArrayList<>();

            animals.add(new Lion("Simba"));
            animals.add(new Rabbit("Bunny"));
            animals.add(new Wolf("Wolfy"));
            animals.add(new Lion("Mufasa"));

            for (int i = 0; i < animals.size(); i += 2) {

                Animal first = animals.get(i);
                Animal second = animals.get(i + 1);

                System.out.println(first.name + " VS " + second.name);

                Contest contest = new Contest(first, second);

                while (contest.getWinner() == null) {
                    contest.playRound();
                }

                System.out.println("Vinder: "
                        + contest.getWinner().getName());
                System.out.println();
            }
        }
    }



