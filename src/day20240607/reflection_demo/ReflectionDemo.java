package day20240607.reflection_demo;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/8 18:00
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        new L();
        System.out.println("--- --- ---");
        new O();

        new V();
        new V();

        new E();
        new E();
    }
}
class L {

}

class O {

}

class V {
    static {
        System.out.println("static block in V");
    }
}

class E {
    {
        System.out.println("non-static block in E");
    }
}