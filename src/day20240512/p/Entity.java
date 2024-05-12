package day20240512.p;

public abstract class Entity {

    public abstract double toNumber();

    public int compare(Entity e1, Entity e2) {
        return (int) (e1.toNumber() - e2.toNumber());
    }
}
