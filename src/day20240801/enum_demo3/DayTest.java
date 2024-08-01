package day20240801.enum_demo3;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/30 14:19
 */
public class DayTest {
    public static void main(String[] args) {
        System.out.println(Day.THURSDAY);


        for (Day day : Day.values()){
            day.desc();
        }


    }
}
