package generic;

public class SimpleGenDemo {
    public static void main(String[] args) {
        // Создать ссылку типа Gen для целых чисел
        SimpleGen<Integer> intOb ;
// Создать объект типа Gen<Integer> и присвоить
// ссылку на него переменной iOb . Обратите внимание на
// применение автоупаковки для инкапсуляции значения 8 8 1 1 в объекте типа Integer
        intOb  =  new SimpleGen<Integer> (88) ;
// показать тип данных , хранящихся в переменной iOb
        intOb.showType();
// получить значение переменной iOb . Обратите
// внимание на то , что для этого не требуется
// никакого приведения типов
        int v  =  intOb.getOb();
        System.out.println ( " Value :  " + v ) ;
        System.out.println() ;

        SimpleGen<String> stringOb = new SimpleGen<String>("Text msg");
        stringOb.showType();
        System.out.println("Value: " + stringOb.getOb());
    }
}
