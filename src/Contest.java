
public class Contest {
    Animal animal1;
    Animal animal2;
    int rounds = 0;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public void playRound() {
        if (!animal1.isActive() || !animal2.isActive()) {
            return;
        }

        rounds++;
        System.out.println("--- Runde " + rounds + " ---");

        int damage = animal1.attack();
        animal2.setEnergy(animal2.getEnergy() - damage);

        System.out.println(animal1.name + " angriber "
                + animal2.name + " for " + damage);
        System.out.println(animal2.name + " har "
                + animal2.energy + " energi tilbage");

        if (animal2.isActive()) {
            damage = animal2.attack();
            animal1.setEnergy(animal1.getEnergy() - damage);

            System.out.println(animal2.name + " angriber "
                    + animal1.name + " for " + damage);
            System.out.println(animal1.name + " har "
                    + animal1.energy + " energi tilbage");
        }

        System.out.println();
    }

    public Animal getWinner() {
        if (animal1.isActive() && !animal2.isActive()) {
            return animal1;
        }

        if (animal2.isActive() && !animal1.isActive()) {
            return animal2;
        }

        return null;
    }
}

