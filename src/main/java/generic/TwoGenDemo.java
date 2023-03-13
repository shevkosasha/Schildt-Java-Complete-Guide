package generic;

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(100, "generic");
        twoGen.showTypes();
        System.out.println("value T: " + twoGen.getOb1());
        System.out.println("value V: " + twoGen.getOb2());
    }
}
