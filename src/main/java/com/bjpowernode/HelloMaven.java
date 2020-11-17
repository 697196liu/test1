package com.bjpowernode;

public class HelloMaven {
    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int i=0;
        HelloMaven hello = new HelloMaven();
        int res = hello.add(20,30);
        System.out.println("20+30="+res);
    }
}
