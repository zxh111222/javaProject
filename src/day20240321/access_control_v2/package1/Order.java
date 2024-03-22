package day20240321.access_control_v2.package1;

/**
 * @Author: XinhaoZheng
 * @CreateTime: 2024-03-21  23:54
 * @Description: TODO
 */
public class Order {

    // Fields
    private int orderPrivate;
    int orderDefault;
    protected  int orderProtected;
    public int orderPublic;

    // Methods
    private void methodPrivate(){

    }
    void methodDefault(){

    }
    protected void methodProtected(){

    }
    public void methodPublic(){

    }

    public void test(){
        orderPrivate = 3;
        orderDefault = 2;
        orderProtected = 4;
        orderPublic = 1;

        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();

    }

}
