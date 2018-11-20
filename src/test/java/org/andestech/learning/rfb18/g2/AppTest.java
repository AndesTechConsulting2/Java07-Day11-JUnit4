package org.andestech.learning.rfb18.g2;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class AppTest 
{

    @Test()
    public void meth01Test()
    {
        System.out.println("meth:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals(1,2-1);
    }


    @Test
    @Category({IRegressTest.class})
    public void meth02Test()
    {
        System.out.println("meth:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotEquals(0,2-1);
    }
    @Test

    public void meth03Test()
    {
        System.out.println("meth:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertNotEquals(1,2-1);
    }
}
