package Lambda;

import java.util.*;
import java.util.function.Function;

public class ReferencesDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.forEach(number -> System.out.println(number));
//        numbers.forEach(System.out::println);

        Function<String, Integer> toInteger = string -> MainClass.parse(string);
        Integer integer = toInteger.apply("5");
        Function<String, Integer> toIntegerRef = MainClass::parse;

        UserFactory userFactory = User::new;
        User user = userFactory.create("John", "Snow");

        StringBuffer buffer = new StringBuffer("abc");
        System.out.println(buffer.capacity());

    }
    static class MainClass {
        private static Integer parse(String s) {
            return Integer.parseInt(s);
        }
    }

    static class User{
        String name, surname;

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    }
    interface UserFactory {
        User create(String name, String surname);
    }
}
