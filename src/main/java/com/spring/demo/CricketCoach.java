package com.spring.demo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("Cricket coach constructor.");
    }

    public String getDailyWorkout() {
        return "\n<<< <<< <<< This is Cricket coach workout. >>> >>> >>>";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setDailyFortune(FortuneService fortune) {
        System.out.println("Cricket coach: inside setter method - setDailyFortune.");
        fortuneService = fortune;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket coach: inside setter method - setEmailAddress.");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Cricket coach: inside setter method - setTeam.");
        this.team = team;
    }
}
