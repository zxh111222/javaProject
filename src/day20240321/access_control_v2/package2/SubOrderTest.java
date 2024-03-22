package day20240321.access_control_v2.package2;

import day20240321.access_control_v2.package1.Order;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-22  13:15
 * @Description: TODO
 */
public class SubOrderTest extends SubOrder {
    public void test(){
        SubOrder subOrder = new SubOrder();
//        SubOrderTest subOrder = new SubOrderTest();

/*
  SubOrderTest继承于SubOrder，而SubOrder继承于Order，
  目前这个类SubOrderTest与Order不在同一个包下，
  这里创造了一个SubOrder类对象subOrder，是SubOrderTest父类的对象，
  在现在这个类中只能使用subOrder中公有的（Public）属性和方法。
 */


        subOrder.orderPublic = 2;
//        subOrder.orderDefault = 3;
//        subOrder.orderProtected = 0;
//        subOrder.orderPrivate = 1;

        subOrder.methodPublic();
//        subOrder.methodDefault();
//        subOrder.methodProtected();
//        subOrder.methodPrivate();
    }
}
