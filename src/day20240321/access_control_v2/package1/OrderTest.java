package day20240321.access_control_v2.package1;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-21  23:57
 * @Description: TODO
 */
public class OrderTest {

    public static void main(String[] args) {
        SubOrder order = new SubOrder();

        //调用属性
        order.orderPublic = 2;
        order.orderDefault = 3;
        order.orderProtected = 0;
//        order.orderPrivate = 1;

        //调用方法
        order.methodPublic();
        order.methodDefault();
        order.methodProtected();
//        order.methodPrivate();


    }



}
