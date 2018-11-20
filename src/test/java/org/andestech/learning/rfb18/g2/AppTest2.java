package org.andestech.learning.rfb18.g2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import org.junit.runner.JUnitCore;


public class AppTest2
{

    @Test
    public void meth04Test()
    {
        System.out.println("meth:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }


    @Test
    @Category({IRegressTest.class})
    public void meth05Test()
    {
        System.out.println("meth:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }
    @Test

    public void meth06Test()
    {
        System.out.println("meth:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertFalse(false);
    }
}
