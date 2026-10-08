import java.util.Random;

public class Wolf extends Animal {

    public Wolf(String name) {
        super(name, 70);
    }

    @Override
    public int attack() {
        Random random = new Random();
        return random.nextInt(11) + 5;
    }
}

