package generic;

public class Dimensions {
    int x, y;

    public Dimensions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        System.out.println("Coords XY: ");
        String str = this.x + ", " + this.y;
        System.out.println(str);
        return str;
    }

    static class Dimensions3D extends Dimensions{
        int z;

        public Dimensions3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
        @Override
        public String toString() {
//            System.out.println(this.x + ", " + this.y + ", " + this.z);
            System.out.println("Coords XYZ: ");
            String str = this.x + ", " + this.y + ", " + this.z;
            System.out.println(str);
            return str;
        }
    }

    static class Dimensions4D extends Dimensions3D{
        int d;

        public Dimensions4D(int x, int y, int c, int d) {
            super(x, y, c);
            this.d = d;
        }
        @Override
        public String toString() {
//            System.out.println(this.x + ", " + this.y + ", " + this.z + ", " + this.d);
            System.out.println("Coords XYZD: ");
            String str = this.x + ", " + this.y + ", " + this.z + ", " + this.d;
            System.out.println(str);
            return str;
        }
    }
}
