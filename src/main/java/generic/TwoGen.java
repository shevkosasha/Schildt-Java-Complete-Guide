package generic;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }
    void showTypes(){
        System.out.println("T object is an instance of " + ob1.getClass().getName());
        System.out.println("T object is an instance of " + ob2.getClass().getName());
    }
}

