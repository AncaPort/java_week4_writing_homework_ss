package java_writing_hw_week4_ss.Programme_24_method_overridding;

/**
 * Test class to create objects and call the methods
 * Output:
 * SBI Rate of Interest: 8
 * ICICI Rate of Interest: 7
 * AXIS Rate of Interest: 9
 */
public class Test {

    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("SBI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("SBI Rate of Interest: " + a.getRateOfInterest());
    }

}
