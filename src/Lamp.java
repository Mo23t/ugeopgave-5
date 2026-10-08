public class Lamp {

        int watt;
        boolean isOn;

        public Lamp(int watt) {
            this.watt = watt;
            this.isOn = false;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }

        public String toString() {
            return watt + "W";
        }
    }


