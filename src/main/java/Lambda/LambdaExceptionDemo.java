package Lambda;

public class LambdaExceptionDemo {
    interface DoubleNumericArrayFunc{
        double func(double[] n) throws EmptyArrayException;
    }

    static class EmptyArrayException extends Exception {
        public EmptyArrayException() {
            super("Array is empty");
        }
    }

    public static void main(String[] args) throws EmptyArrayException {
        int t = 10;
        double[] values = {1.0,2.0,3.0,4.0,5.0};
        double[] emptyArr = {};
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            int b = t;
            if (n.length == 0) throw new EmptyArrayException();
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };

        System.out.println("avg: " + average.func(values));
        System.out.println("avg: " + average.func(emptyArr));

    }
}
