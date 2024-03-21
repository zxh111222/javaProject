package day20240321.access_control.package1;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-21  23:56
 * @Description: TODO
 */
public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderPublic = 2;
        order.orderDefault = 3;
//        order.orderPrivate = 1;

        //调用方法
        order.methodPublic();
        order.methodDefault();
//        order.methodPrivate();

    }

}
