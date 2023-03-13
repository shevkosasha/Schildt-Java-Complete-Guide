package generic;

import java.util.Objects;

public class SimpleGen<T> {
    private T ob;

    public SimpleGen(T ob) {
        this.ob = ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("current type is: " + ob.getClass().getName());
    }
}
