package day20240321.access_control.package1;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-22  13:05
 * @Description: TODO
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderPublic = 2;
        order.orderDefault = 1;
//        order.orderPrivate = 3;

        //调用方法
        order.methodPublic();
        order.methodDefault();
//        order.methodPrivate();
    }
}
