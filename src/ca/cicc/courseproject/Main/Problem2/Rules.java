package ca.cicc.courseproject.Main.Problem2;

public interface Rules {
    public int compareToCourageAndStrength(Transformer autobot, Transformer deception);
    public int compareToSkill(Transformer autobot, Transformer deception);
    public int compareToOverAllRating(Transformer autobot, Transformer deception);
    public int specialRules(Transformer autobot, Transformer deception);
}
