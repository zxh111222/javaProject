## 阅读时间
- ![img3.png](img/img3.png)
### 资料
- 中文资料: https://www.ruanyifeng.com/blog/2013/04/processes_and_threads.html
- 英文资料: https://docs.oracle.com/javase/tutorial/essential/concurrency/procthread.html

### 注意点  
- 尽信书不如无书
- 看资料的时候，可以加个问号，持怀疑的态度
- 评论区容易出人才，特别是技术文章，如果有评论，别忘了去看它
  - ![img1.png](img/img1.png)
- 英文资料的时候，注意软件翻译的准确性

## 直观感受`进程`和`线程`
![img2.png](img/img2.png)

## Thread Introduction  
![img.png](img/img.png)

## 如何启动一条新的执行路径？  
![img_1.png](img/img_1.png)
![img_2.png](img/img_2.png)

## 给线程指定名字  
![img_3.png](img/img_3.png)  

## Thread - 调用 `run()` 和 `start()` 的差别
![img_4.png](img/img_4.png)

## Thread - 思考 `extends Thread` VS `implements Runnable`

## Thread - `原始的写法` VS `匿名的 Runnable 子类` VS `lambda 表达式`  
![img4.png](img/img4.png)

## 小总结
- `线程` 简单理解: 它就是一条执行路径
- 如何开辟执行路径: 见 `如何启动一条新的执行路径？`
- 在这条新开辟的执行路径上要做什么任务: 包在 `run` 方法里面

## 方法提取  
![img5.png](img/img5.png)

## Thread - 通过控制台的输出直观感受 - 线程状态 - `不确定`
![img_5.png](img/img_5.png)


## Thread - 通过阅读源码的方式，看线程的状态 `Thread.State`
![img_6.png](img/img_6.png)

## Thread 常用方法
- Thread.sleep
![img_7.png](img/img_7.png)
- join
![img_8.png](img/img_8.png)
- Thread.yield
![img_9.png](img/img_9.png)
- setPriority
![img_10.png](img/img_10.png)
- isAlive
![img_11.png](img/img_11.png)

## synchronized  
## 直接写在方法声明中  
![img_12.png](img/img_12.png)
## 锁在更精确的位置上  
![img_13.png](img/img_13.png)

--------------
- ![img_14.png](img/img_14.png)
- ![img_15.png](img/img_15.png)
- 上两张图的 this 和 xxx.class 可以替换成下图的实现方式  
- ![img_16.png](img/img_16.png)

## 死锁 Deadlock  
- ![img_17.png](img/img_17.png)
- ![img_18.png](img/img_18.png)

## TicketWindows 模拟车站买票的场景
- 版本1 - ArrayList
![img_19.png](img/img_19.png)
![img_20.png](img/img_20.png)

- 版本2 - Vector
![img_21.png](img/img_21.png)
![img_22.png](img/img_22.png)

- 版本3 - Vector + Thread.sleep
![img_23.png](img/img_23.png)

- 版本4 - synchronized
![img_24.png](img/img_24.png)

- 版本5 - ConcurrentLinkedQueue
![img_25.png](img/img_25.png)









