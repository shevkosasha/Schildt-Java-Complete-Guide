package Lambda;

public class LambdaDemo {
    interface NumericTest{
        boolean test(int n);
    }
    interface NumericTest2{
        boolean test(int n, int m);
    }
    interface NumericFunc{
        int run(int i);
    }
    interface StringFunc{
        String run(String i);
    }

    public static void main(String[] args) {
        NumericTest isEven =  ( n )  ->  ( n % 2 ) == 0;
        NumericTest2 isFactor =  ( n, m )  ->  ( n % m ) == 0;
        NumericFunc factorial = (n) -> {
            var result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        StringFunc reverse = (str) -> {
            String res = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };
        for (int i = 2; i < 5; i++) {
//            System.out.println(isEven.test(i));
//            System.out.println(isFactor.test(i, i-1));
            System.out.println(factorial.run(i));
        }
        System.out.println(reverse.run("abcdef"));
    }
    public static class Test{
        public static Boolean isEven(int i){
            return i % 2 == 0;
        }
    }
}
