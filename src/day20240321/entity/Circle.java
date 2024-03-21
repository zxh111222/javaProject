package day20240321.entity;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-21  21:09
 * @Description: TODO
 */
public class Circle {

    private double radius;

    public Circle(){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * Math.pow(radius,2);
    }

}
