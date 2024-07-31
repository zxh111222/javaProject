package day20240730.enum_demo;

public enum Season {
    SPRING("春天", "鸟语花香"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER; // 冬天调用无参构造器

    private String name;
    private String characteristic; // 特点

    // 构造器私有化 -> 这样外界就不能直接创建对象，防止直接 new
    Season(String name, String characteristic) {
        this.name = name;
        this.characteristic = characteristic;
    }

     Season() {

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
