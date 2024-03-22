package day20240321.access_control_v2.package2;

import day20240321.access_control_v2.package1.Order;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-22  13:10
 * @Description: TODO
 */
public class SubOrder extends Order {
    public void test() {
        SubOrder subOrder = new SubOrder();

        subOrder.orderProtected = 0;

        subOrder.methodProtected();
    }
}
