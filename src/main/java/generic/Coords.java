package generic;

class Coords<T extends Dimensions>{
    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }
    static void show2D(Coords<? extends Dimensions> c){
        printCoords(c);
    }

    static void printCoords(Coords<? extends Dimensions> c){
        for (int i = 0; i < c.coords.length; i++) {
            c.coords[i].toString();
        }
    }
}
