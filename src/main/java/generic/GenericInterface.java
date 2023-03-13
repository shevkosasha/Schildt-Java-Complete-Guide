package generic;

public interface GenericInterface<T extends Comparable<T>> {
    T min();
    T max();
}
