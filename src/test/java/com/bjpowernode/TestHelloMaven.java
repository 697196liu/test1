package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testAdd(){
        System.out.println("======测试add方法=========");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(20,30);
        //判断是否正确
        Assert.assertEquals(50,res);
    }

}
