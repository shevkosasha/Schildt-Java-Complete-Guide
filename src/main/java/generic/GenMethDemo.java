package generic;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};
        String strings[] = {"a","b","c"};
        System.out.println(isIn(5, nums));
        System.out.println(isIn(7, nums));
//        System.out.println(isIn("b", nums));
        System.out.println(isIn("B", strings));
        System.out.println(isIn("b", strings));
    }
}
