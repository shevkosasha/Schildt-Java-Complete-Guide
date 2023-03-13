package Lambda;

public class MethodRefDemo {
    interface StringFunc{
        String run(String s);
    }
    class MyStringOp {
        static StringFunc reverse = (str) -> {
            String res = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };

//        public static String reverse(String s) {
//        }
    }
    class Demo{
        private static String op(StringFunc f, String s) {
            return f.run(s);
        }

//        public static void main(String[] args) {
//            System.out.println(op(MyStringOp::reverse, "abcdef"));
//        }
    }
}
