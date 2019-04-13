package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(coach.getDailyWorkout()
                + "\n" + coach.getDailyFortune()
                + "\n" + coach.getEmailAddress()
                + "\n" + coach.getTeam());

        context.close();
    }
}
