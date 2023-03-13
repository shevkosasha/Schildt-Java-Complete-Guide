package generic;

public class GenericInterfaceDemo<T extends Comparable<T>> implements GenericInterface<T> {
    T[] vals;

    public GenericInterfaceDemo(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) v = vals[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) v = vals[i];
        }
        return v;
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};
        Character[] chs = {'a', 'b', 'c','f'};
        GenericInterfaceDemo demo1 = new GenericInterfaceDemo(nums);
        GenericInterfaceDemo demo2 = new GenericInterfaceDemo(chs);
        System.out.println("min num: " + demo1.min());
        System.out.println("max num: " + demo1.max());
        System.out.println("min char: " + demo2.min());
        System.out.println("max num: " + demo2.max());

    }
}
