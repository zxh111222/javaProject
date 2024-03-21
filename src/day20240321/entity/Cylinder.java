package day20240321.entity;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-21  21:08
 * @Description: TODO
 */
public class Cylinder extends Circle{

    private double length;

    public Cylinder(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return getLength() * findArea();
    }

}
