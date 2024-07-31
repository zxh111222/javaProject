## 一、如何看代码？

### 看别人的代码：

1. 如果这个类有 main 方法，从 main 方法开始看

2. 如果没有 main 方法，可以先不看，他肯定是别人在使用它，你可以等在其他代码发现调用到它的时候，再看那块逻辑  

补：不要从第一个字母开始看，也不用一下就先关注到 import 区域，看 git 变化记录的时候，经常都是先看到 import 区域，它是“果”不是“因”，只是它正好顺序排到前面而已。  
  
其实，看书也一样  
![img.png](img%2Fimg.png)

## 二、 隐私保护问题  

![img1.png](img%2Fimg1.png)

## 三、打破 “一听就会，一打就废 ”  

![img2.png](img%2Fimg2.png)

## 四、新知识 ——— 枚举类型
 
### 创建枚举类型：  

![img3.png](img%2Fimg3.png)

### 发现：在 enum 定义的东西，类型竟然是它本身  

![img4.png](img%2Fimg4.png)  

### 回答下图中的问题：All enums implicitly extend java.lang.Enum.    

![img5.png](img%2Fimg5.png)

![img6.png](img%2Fimg6.png)

### enum 的本质：如果一个类/类型，只有确定的那么几个对象，这种场景就是 enum 发挥的地方  



