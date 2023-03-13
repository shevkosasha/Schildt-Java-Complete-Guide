package generic;

public class WildCardTypes<T extends Number>{
    T[] nums;

    public WildCardTypes(T[] nums) {
        this.nums = nums;
    }
    double average(){
        double sum  =  0.0 ;
        for ( int i = 0 ;  i < nums.length; i++ )
            sum += nums[i].doubleValue( ) ;
        return sum / nums.length;
    }

    boolean sameAvg(WildCardTypes<?> ob){
        if(average() == ob.average()){
            return true;
        }
        return false;
    }
}

