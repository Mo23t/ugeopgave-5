
public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name, 100);
    }

    @Override
    public int attack() {
        return 4;
    }
}

