package com.atguigu.thread;

public class MyThread {

    public static void main(String[] args){

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().toString());
            System.out.println(1);
        }

        new Thread(()->{
            System.out.println(Thread.currentThread().toString());
        }).start();

    }

    private void print(){
        System.out.println("线程1启动");
    }


}
