package org.springframework.study.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Person {
    @Autowired
    Cat cat;

    @Resource
    Dog dog;

    public Person(){
        System.out.println("person create....");
    }
}
