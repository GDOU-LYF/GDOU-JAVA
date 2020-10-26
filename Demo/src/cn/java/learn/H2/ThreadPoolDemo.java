package cn.java.learn.H2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        //1 创建线程池对象。
        MyRunnable r=new MyRunnable();
        //2 创建Runnable接口子类对象。(task)
        service.submit(r);//3 提交Runnable接口子类对象
        service.submit(r);
        service.submit(r);
        service.shutdown();//4 关闭线程池方法--一般不执行
    }
}
