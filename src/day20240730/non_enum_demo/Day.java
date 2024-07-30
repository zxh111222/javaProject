package day20240730.non_enum_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/30 15:03
 */
public class Day {
    public static final Day MONDAY = new Day("MONDAY");
    public static final Day TUESDAY = new Day("TUESDAY");
    public static final Day WEDNESDAY = new Day("WEDNESDAY");
    public static final Day THURSDAY = new Day("THURSDAY");
    public static final Day FRIDAY = new Day("FRIDAY");
    public static final Day SATURDAY = new Day("SATURDAY");
    public static final Day SUNDAY = new Day("SUNDAY");

    private String name;

    private Day(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
