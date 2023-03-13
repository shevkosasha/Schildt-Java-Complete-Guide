package generic;

public class GenereicSuperClass {
    public static void main(String[] args) {
        System.out.println("hi");
        Gen<String> gen = new Gen<String>("Hi");
        Gen2<Integer, String> gen1 = new Gen2<Integer, String>(3, "Hello");
        System.out.println(gen.getOb());
        System.out.println(gen1.getOb1());
    }

    static class Gen<T>{
        T ob;
        public Gen(T ob) {
            this.ob = ob;
        }

        public T getOb() {
            return ob;
        }
    }

    static class Gen2<T,V> extends Gen<T>{
        V ob1;

        public Gen2(T ob, V ob1) {
            super(ob);
            this.ob1 = ob1;
        }

        public V getOb1() {
            return ob1;
        }
    }
}
