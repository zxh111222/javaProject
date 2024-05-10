package day20240510.final_demo;

public class FinalVariable {


    // Instance Variables(Non-Static Fileds)
    public String myName = "zxh";

    // Class Variables(Static Fileds)
    public static String id = "123456789";

    // Local Variables
    public void method1() {
        int number = 100;
        number = 500;
        System.out.println(number);
    }

    //Parameters
    public void method2(final int number) {
        number = 200;
        System.out.println(number);
    }



}



