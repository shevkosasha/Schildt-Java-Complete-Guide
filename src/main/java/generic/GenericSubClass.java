package generic;

public class GenericSubClass {
    public static void main(String[] args) {
        System.out.println("Generic Sub Class");
        GenSub<String> genSub = new GenSub<String >("int", 2);
        System.out.println(genSub.getOb());
        System.out.println(genSub.getGenOb());
        System.out.println(genSub instanceof Parent);
    }

    String returnValue(String s){
        return s;
    }

    Boolean returnValue(Boolean b){
        return b;
    }

    static class Parent{
        Integer ob;

        public Parent() {
            ob = 0;
        }

        public Parent(Integer ob) {
            this.ob = ob;
        }

        public Object getOb() {
            return ob;
        }
    }

    static class GenSub<T> extends Parent {
        T gen;

        public GenSub(T ob, int i) {
            super(i);
            this.gen = ob;
        }

        public T getGenOb() {
            return gen;
        }
    }
}
