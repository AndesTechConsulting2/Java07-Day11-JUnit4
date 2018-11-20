package org.andestech.learning.rfb18.g2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AppRunner {

    public static void main( String[] args )
    {

        Result res = JUnitCore.runClasses(AppTest.class, AppTest2.class);

        for( Failure f: res.getFailures()){

            System.out.println(f.toString());
        }

       if(res.wasSuccessful()) System.out.println("!!! OK");

    }

}
