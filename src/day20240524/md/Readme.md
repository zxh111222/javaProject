### 快速回顾上次课在什么情况下引出包装类之一：Integer
- 泛型中的类型，必需是引用数据类型；快速引出了 Integer
    - ![img.png](img.png)

## 包装类 Wrapper class
### 初见
- ![img_1.png](img_1.png)

### the Java platform provides wrapper classes for each of the primitive data types.
- ![img_2.png](img_2.png)
- ![img_3.png](img_3.png)

### 自己写一个 MyInteger 类，模拟 Integer 的核心逻辑
- ![img_4.png](img_4.png)

### MyInteger 的有感 vs Integer 的无感
- ![img_5.png](img_5.png)

### 主动 `new Integer` vs `Integer.valueOf` 及面试题
- ![img_6.png](img_6.png)

### `Integer.valueOf` 会用缓存进行优化：IntegerCache
- ![img_7.png](img_7.png)
- ![img_8.png](img_8.png)

### Autoboxing and Unboxing
- ![img_9.png](img_9.png)

## 动手时间：不同方式的字符串拼接耗时对比
- String `+`
- StringBuffer `append`
- StringBuilder `append`

## 课后思考
- ![img_10.png](img_10.png)