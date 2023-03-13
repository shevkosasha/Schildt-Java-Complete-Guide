package Lambda;

public class GenericFunctionalInterface {
    interface Func<T>{
        T run(T t);
    }

    public static void main(String[] args) {
        Func<String> reverse = (str) -> {
            String res = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };
        Func<Integer> factorial = (n) -> {
            Integer res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };
        System.out.println(reverse.run("qwerty"));
        System.out.println(factorial.run(5));

        String inStr = "test string";
        Func<String> toUpper = (str) -> str.toUpperCase();
        Func<String> deleteWhiteSpace = (str) -> {
            String res = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    res += str.charAt(i);
                }
            }
            return res;
        };
        String outStrUp = lambdaAsArg(toUpper, inStr);
        String whiteSpaceDeleted = lambdaAsArg(deleteWhiteSpace, inStr);
        System.out.println(outStrUp);
        System.out.println( whiteSpaceDeleted);
        System.out.println(lambdaAsArg((s) -> {
            String str = (String) s;
            String res = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    res += str.charAt(i);
                }
            }
            return res;
        }, "Str With White Spaces"));
    }

    static String lambdaAsArg(Func f, String s){
        return (String) f.run(s);
    }
}
