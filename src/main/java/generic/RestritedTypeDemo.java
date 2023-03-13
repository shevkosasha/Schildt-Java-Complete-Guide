package generic;

public class RestritedTypeDemo {
    public static void main(String[] args) {
        Integer inums[] = { 1 , 2 , 3 , 4 , 5 } ;
        RestrictedTypes<Integer> iob = new RestrictedTypes<> (inums ) ;
        double v = iob.average();
        System.out.println ( " Average value :  " + v ); ;
        Double dnums [ ]  =  { 1.1, 2.2, 3.3, 4.4, 5.5} ;
        RestrictedTypes<Double> dob  =  new RestrictedTypes<Double> ( dnums ) ;
        double w = dob . average ( ) ;
    }


//    double v  =  iob.average ( ) ;
//
//    System.out.println( " Cpeднee значение iob равно " + v) ;
//    Double dnums [ ]  =  { 1.1, 2.2, 3.3, 4.4, 5.5} ;
//    RestrictedTypes<Double> dob  =  new RestrictedTypes<Double> ( dnums ) ;
//    douЫe w = dob . average ( ) ;
}
