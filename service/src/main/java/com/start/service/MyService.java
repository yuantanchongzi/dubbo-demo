package com.start.service;

import com.start.interfance.MyInterfance;

/**
 * @Author: Francis
 * @Description:
 * @TIME: Created on 2018/8/17
 * @Modified by:
 */

public class MyService implements MyInterfance{
    public MyService(){
        System.out.println("MyService construct go");
    }

    public String getId(){
        System.out.println("get_id is run"+"\n"+"\n"+"\n");
        return "getted..id";
    }
}
