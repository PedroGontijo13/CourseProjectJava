package ca.cicc.courseproject.Main.Problem2;

public class Transformes {
    String name;
    String Letter;
    int Strength;
    int Intelligence;
    int Speed;
    int Endurance;
    int Rank;
    int Courage;
    int Firepower;
    int Skill;
    int overallRating;

    Transformes(String name, String Letter, int Strength, int Intelligence, int Speed, int Endurance, int Rank, int Courage, int Firepower, int Skill) {
        this.name = name;
        this.Letter = Letter;
        this.Strength = Strength;
        this.Intelligence = Intelligence;
        this.Speed = Speed;
        this.Endurance = Endurance;
        this.Rank = Rank;
        this.Courage = Courage;
        this.Firepower = Firepower;
        this.Skill = Skill;
        this.overallRating = getOverallRating();
    }

    public Transformes() {

    }

    //Calculate the overall rating
    public int getOverallRating() {
        return (this.Strength + this.Intelligence + this.Speed + this.Endurance + this.Firepower);
    }
    
    //Set the overall rating
    public void setOverallRating() {
        this.overallRating = getOverallRating();
    }

    public String GetName() {
        return this.name;
    }

    public String GetType() {
        return this.Letter;
    }

    static class Deception extends Transformes {
        Deception(String name, String Letter, int Strength, int Intelligence, int Speed, int Endurance, int Rank, int Courage, int Firepower, int Skill) {
            super(name, Letter, Strength, Intelligence, Speed, Endurance, Rank, Courage, Firepower, Skill);
        }
    }
    static class Autobot extends Transformes {
        Autobot(String name, String Letter, int Strength, int Intelligence, int Speed, int Endurance, int Rank, int Courage, int Firepower, int Skill) {
            super(name, Letter, Strength, Intelligence, Speed, Endurance, Rank, Courage, Firepower, Skill);
        }
    }
}
