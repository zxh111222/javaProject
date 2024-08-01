package day20240801.enum_demo3;


public enum Day implements ForEnumDemo {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public void desc() {
        System.out.println("Day@desc");
    }
}
