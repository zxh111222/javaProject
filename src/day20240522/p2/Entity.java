package day20240522.p2;

public class Entity {
    public String classRoom;
    public String fan;

    public Entity() {
    }

    public Entity(String classRoom, String fan) {
        this.classRoom = classRoom;
        this.fan = fan;
    }

    public void set(String classRoom, String fan) {
        this.classRoom = classRoom;
        this.fan = fan;
    }

    public void get(String classRoom){
        this.fan = fan;
    }

}
