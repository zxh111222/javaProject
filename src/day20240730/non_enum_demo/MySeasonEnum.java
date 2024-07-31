package day20240730.non_enum_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/7/31 20:24
 */
public class MySeasonEnum {
    private String name;
    private String characteristic; // 特点

    public static final MySeasonEnum SPRING = new MySeasonEnum("春天", "鸟语花香");
    public static final MySeasonEnum SUMMER = new MySeasonEnum("夏天", "烈日炎炎");
    public static final MySeasonEnum AUTUMN = new MySeasonEnum("秋天", "秋高气爽");
    public static final MySeasonEnum WINTER = new MySeasonEnum("冬天", "鹅毛大雪");


    // 构造器私有化 -> 这样外界就不能直接创建对象，防止直接 new
    private MySeasonEnum(String name, String characteristic) {
        this.name = name;
        this.characteristic = characteristic;
    }


    // 只提供 get 方法 不提供 set 方法 -> 只读不写
    public String getName() {
        return name;
    }
    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String toString() {
        return "Season='" + name + '\'' +
                ", characteristic='" + characteristic + '\'';
    }
}
