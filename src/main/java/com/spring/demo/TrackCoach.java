package com.spring.demo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "\n<<< <<< <<< Spend 30 minutes on running training. >>> >>> >>>";
    }

    public String getDailyFortune() {
        return "<<< <<< <<< Just do IT! >>> >>> >>>" + fortuneService.getFortune();
    }

    public void doMyStartupStuff() {
        System.out.println("Track Coach - Inside method doMyStartupStuff");
    }

    public void doMyCleanupStuff() {
        System.out.println("Track Coach - Inside method doMyCleanupStuff");
    }
}
