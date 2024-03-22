package day20240321.access_control_v2.package2;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-22  13:15
 * @Description: TODO
 */
public class SubOrderTest extends SubOrder{
    public void test(){
        SubOrder subOrder = new SubOrder();

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
