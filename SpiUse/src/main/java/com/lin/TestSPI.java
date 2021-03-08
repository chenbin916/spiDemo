package com.lin;

import com.cbin.study.java.spi.Developer;

import java.util.ServiceLoader;

public class TestSPI {




    public static void main(String[] arg) {

        ServiceLoader<Developer> serviceloader = ServiceLoader.load(Developer.class);
        TestSPI devClient = new TestSPI();

        Developer dev = devClient.getDeveloper( serviceloader);

        System.out.println(dev.getDevelopLanguage());

    }
    private Developer getDeveloper(ServiceLoader<Developer> serviceloader) {

        Developer lastdev = null;

        for (Developer dev : serviceloader) {

            System.out.println("out." + dev.getDevelopLanguage());

            lastdev = dev;

        }
        if(lastdev==null)
            System.out.println("why...");
        return lastdev;

    }
}
