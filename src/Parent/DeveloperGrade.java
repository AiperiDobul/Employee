package Parent;

public enum DeveloperGrade {
    Junior("I am Junior Developer"),
    Middle("I am Middle Developer"),
    Senior("I am Senior Developer"),
    Teamlead("I am Teamlead");

    private String phrase;

    DeveloperGrade(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public String printPhrase(){
        return phrase;
    }
}
