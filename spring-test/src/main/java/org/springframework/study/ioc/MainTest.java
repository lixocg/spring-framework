package org.springframework.study.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanConfig.class);


        String[] names = applicationContext.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }

    }
}
