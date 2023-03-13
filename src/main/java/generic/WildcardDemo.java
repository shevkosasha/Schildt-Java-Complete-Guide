package generic;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        WildCardTypes<Integer> iob  =  new WildCardTypes<> ( inums ) ;
        double v  =  iob.average( ) ;
        System . out . println (" Cpeднee значение iob равно: " + v ) ;
        Double dnums [ ] = { 1.1, 2.2, 3.3, 4.4, 5.5 } ;
        WildCardTypes<Double> dob = new WildCardTypes<Double> ( dnums ) ;
        double w = dob . average ( ) ;
        System . out .println( " Cpeднee значение dob равно " + w) ;
        Float fnums []  =  { 1.0F , 2.0F , 3.0F , 4.0F , 5.0F } ;
        WildCardTypes<Float > fob = new WildCardTypes<Float> ( fnums ) ;
        double х = fob . average ( ) ;
        System . out . println(" Cpeднee значение fob равно " + х ) ;
        System . out . print ( " Cpeдниe значения iob и dob " ) ;
        if ( iob . sameAvg ( dob ) ){
            System.out.println("equals");
            System.out.println("iob = dob = " + iob.average());
        } else {
            System.out.println("not equals");
            System.out.println(iob.average());
            System.out.println(dob.average());
        }
    }
}
