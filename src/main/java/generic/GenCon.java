package generic;

public class GenCon {
    private double val;

    public <T extends Number> GenCon(T val) {
        this.val = val.doubleValue();
    }

    public double getVal() {
        return val;
    }
    public void showVal(){
        System.out.println("val: " + this.getVal());
    }

    public static void main(String[] args) {
//        GenCon con = new GenCon("kop");
        GenCon con1 = new GenCon(12.5);
        con1.showVal();
    }
}
