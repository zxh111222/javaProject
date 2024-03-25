# OOAD + 多态 + instanceof + abstract + final  

---  

## OOAD  面向对象的分析和设计  

## Practice：一个人养了一只 Pet
![practice1.png](img%2Fpractice1.png)

## 多态的前提:  

![img_1.png](img%2Fimg_1.png)

## 多态的适用性：  

![img_2.png](img%2Fimg_2.png)

## 多态的利:  极大的减少了代码的冗余，不需要定义多个重载的方法  

![Polymorphism.png](img%2FPolymorphism.png)

## 多态的弊：  创建了子类的对象，也加载了子类特有的属性和方法但是由于声明为父类的引用，没办法直接调用之类特有的属性和方法———空间占用了，“精度”反而还丢失了

## instanceof关键字:将实例与类型进行比较  
  
![instanceof.png](img%2Finstanceof.png)

## abstract关键字 :
### 1.不是 abstract 抽象类，其中的方法不能用 abstract 抽象
### 2.抽象方法不用写方法体
  
![abstract.png](img%2Fabstract.png)

## final关键字 (禁止子类调用此方法) 

![final-1.png](img%2Ffinal-1.png)
![final-2.png](img%2Ffinal-2.png)

