package com.spring.demo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "\n<<< <<< <<< Spend 30 minutes on baseball training. >>> >>> >>>";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
