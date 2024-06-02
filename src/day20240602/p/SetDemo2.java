package day20240602.p;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/6/2 11:41
 */
@SuppressWarnings({"all"})
public class SetDemo2 {
    public static void main(String[] args) {
        // 问题：Set 是如何判断即将加入的元素跟之前的重复了？
        Set<CustomObj> customObjs = new HashSet<>();

        customObjs.add(new CustomObj("X", 1));
        customObjs.add(new CustomObj("Y", 2));
        customObjs.add(new CustomObj("Z", 3));

        customObjs.add(new CustomObj("Y", 2));

        System.out.println(customObjs.size());
        System.out.println(customObjs);

        // 如何让 customObjs.size() = 3
        // 思考：重写 CustomObj equals 方法
    }
}

class CustomObj {
    String name;
    int value;

    public CustomObj(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomObj{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        CustomObj customObj = (CustomObj) o;
        return value == customObj.value && Objects.equals(name, customObj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
