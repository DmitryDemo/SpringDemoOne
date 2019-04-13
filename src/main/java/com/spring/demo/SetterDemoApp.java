package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

        Coach coach1 = context.getBean("cricketCoach", CricketCoach.class);
        Coach coach2 = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println("\n<<< <<< <<<Is coach1 is the same as coach 2? " + (coach1 == coach2));
        System.out.println("\n<<< <<< <<<Coach1 memory path is " + coach1);
        System.out.println("\n<<< <<< <<<Coach2 memory path is " + coach2);

        context.close();
    }
}
