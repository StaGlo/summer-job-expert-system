package main;

public enum Questions {
	NEED_MONEY("Do you need to make money?"),
    HAVE_MONEY("Do you have a bit of money to spend?"),
    STAY_LOCAL("Do you want to stay in Hamilton?"),
    USE_BRAIN("Do you want to use your brain?"),
    ARTISTIC_SKILL("Do you have artistic talent?"),
    OUTDOORSY("Do you want to work outside?"),
    HARD_LABOR("Are you okay with hard physical labor?"),
    SHOWER_INFREQUENT("Are you okay with showering infrequently?"),
    FOOD_WORK("Do you want to work with food/drink?"),
    ANIMAL_LOVER("Do you like animals?"),
    TELL_WHAT_TO_DO("Are you good at telling people what to do?"),
    OK_TRAVELING("Are you fine with traveling?"),
    FEAR_NEEDLES("Are you afraid of needles?");

    private final String question;

    Questions(String question) {
        this.question = question;
    }

    public String getFullQuestion() {
        return this.question;
    }
}