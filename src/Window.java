public class Window {
        int widthCm;
        int heightCm;

        public Window(int widthCm, int heightCm) {
            this.widthCm = widthCm;
            this.heightCm = heightCm;
        }

        public int getAreaCm2() {
            return widthCm * heightCm;
        }

        public String toString() {
            return widthCm + "x" + heightCm + "cm";
        }
    }



