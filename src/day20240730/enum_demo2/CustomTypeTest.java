package day20240730.enum_demo2;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/30 16:48
 */
public class CustomTypeTest {
    public static void main(String[] args) {
        System.out.println(CustomType.JAVA);
        System.out.println(CustomType.PYTHON);

        CustomType[] values = CustomType.values();
        for (CustomType value : values) {
            System.out.println(value);
        }

        System.out.println("=== === ===");

        System.out.println(CustomType.valueOf("JAVA"));
        System.out.println(CustomType.valueOf("java"));

        System.out.println("=== === ===");

    }
}
