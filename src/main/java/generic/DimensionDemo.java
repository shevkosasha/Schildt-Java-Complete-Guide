package generic;

public class DimensionDemo {
    public static void main(String[] args) {
        Dimensions[] dimensions2D = new Dimensions[6];
        dimensions2D[0] = new Dimensions(3, 2);
        dimensions2D[1] = new Dimensions(5, 4);
        dimensions2D[2] = new Dimensions.Dimensions3D(3, 2, 1);
        dimensions2D[3] = new Dimensions.Dimensions3D(5, 4, 3);
        dimensions2D[4] = new Dimensions.Dimensions4D(3, 2, 1,0);
        dimensions2D[5] = new Dimensions.Dimensions4D(5, 4, 3, 2);
        Coords<Dimensions> c2D = new Coords<Dimensions>(dimensions2D);
        Coords.printCoords(c2D);
        Coords.show2D(c2D);
    }
}
