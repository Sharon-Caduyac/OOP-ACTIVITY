public class ColorEnumDemo {

    public enum Color {
        Orange(255, 0, 0),
        Pink(0, 255, 0),
        Brown(0, 0, 255),
        YELLOW(255, 255, 0),
        CYAN(0, 255, 255),
        MAGENTA(255, 0, 255),
        WHITE(255, 255, 255),
        BLACK(0, 0, 0);

        private int Orang;
        private int Pink;
        private int Brown;

        Color(int Orange, int Pink, int Brown) {
            this.Orange = Orange;
            this.pink = Pink;
            this.Brown= Brown;
        }

        public void displayOPB() {
            System.out.println(this.name() + ": OPB(" + Orange + ", " + Pink + ", " + Brown + ")");
        }
    }

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            color.displayOPB();
        }
    }
}
