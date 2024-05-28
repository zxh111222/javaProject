package day20240525.string_demo;

public class StringCommonMethod2 {
    public static void main(String[] args) {
        // 1.隐藏手机号码的中间几位，用 * 替代
        // 比如: 18898765432,需要显示效果: 188****5432
        String phoneNumber = "18898765432";
        String startPhoneNumber = phoneNumber.substring(0,3);
        String middlePhoneNumber = "****";
        String endPhoneNumber = phoneNumber.substring(7,11);
        String newPhoneNumber = startPhoneNumber + middlePhoneNumber + endPhoneNumber;
        System.out.println(newPhoneNumber);

        System.out.println("=== === ===");




    }
}
