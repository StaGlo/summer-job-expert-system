package main;

public enum Questions {
	NEED_MONEY("Do you need to make money?"),
    HAVE_MONEY("Do you have a bit of money to spend?"),
    STAY_HAMILTON("Do you want to stay in Hamilton?"),
    //!
    USE_BRAIN("Do you want to use your brain?"),
    WORK_OFFICE("Do you want to work in an office/lab?"),
    ARTISTIC_SKILL("Do you have artistic talent?"),
    //!
    OUTDOORSY("Do you want to work outside?"),
    HARD_LABOR("Are you okay with hard physical labor?"),
    SHOWER_INFREQUENT("Are you okay with showering infrequently?"),
    FOOD_WORK("Do you want to work with food/drink?"),
    ANIMAL_LOVER("Do you like animals?"),
    OK_TRAVELLING("Are you fine with traveling?"),
    FEAR_NEEDLES("Are you afraid of needles?"),
    CAMPER("Do you like camping?"),
    WORK_MCMASTER("Do you want to work at McMaster?"),
    OWN_BOSS("Do you want to be your own boss?"),
    GOOD_IT("Are you decent with computers?"),
    PROGRAMMER("Are you good at coding?"),
    SCIENTIST("Are you good at science?"),
    ACADEMICS("Are you good at academics?"),
    TEACHER("Are you good at teaching?"),
    ARTIST("Are you artistic?"),
    BOSSY("Are you good at telling people what to do?"),
    BULKY("Are you bulky?"),
    SOCIAL("Do you have good people skill?"),
    OK_GREASY("Do you mind getting a bit greasy?"),
    LIKE_BURGERS("Do you like burgers?"),
    KNOW_DRINKS("Do you know the difference between a Manhattan and an old-fashioned?"),
    SWIMMER("Are you a good swimmer?");
    
    private final String question;

    Questions(String question) {
        this.question = question;
    }

    public String getFullQuestion() {
        return this.question;
    }
}