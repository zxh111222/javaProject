package day20240510.final_demo;

public class Test {

    public static void main(String[] args) {

        // Class Variables(Static Fileds)
        FinalVariable.id = "1234560";

        FinalVariable finalVariable = new FinalVariable();
        // Instance Variables(Non-Static Fileds)
        finalVariable.myName = "zzz";
        // Local Variables
        finalVariable.method1();
        //Parameters
        finalVariable.method2(100);

    }

}
