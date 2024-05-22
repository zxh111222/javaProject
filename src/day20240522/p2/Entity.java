package day20240522.p2;

public class Entity {
    public String classRoom;
    public String fan;



    public Entity(String classRoom, String fan) {
        this.classRoom = classRoom;
        this.fan = fan;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }
}
