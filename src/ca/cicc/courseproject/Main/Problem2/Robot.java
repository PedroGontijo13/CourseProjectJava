package ca.cicc.courseproject.Main.Problem2;

public abstract class Robot {
    private Integer strength;
    private Integer intelligence;
    private Integer speed;
    private Integer endurance;
    private Integer rank;
    private Integer courage;
    private Integer firepower;
    private Integer skill;

    public Robot(Integer strength, Integer intelligence, Integer speed, Integer endurance, Integer rank, Integer courage, Integer firepower, Integer skill) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.endurance = endurance;
        this.rank = rank;
        this.courage = courage;
        this.firepower = firepower;
        this.skill = skill;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public void setCourage(Integer courage) {
        this.courage = courage;
    }

    public void setFirepower(Integer firepower) {
        this.firepower = firepower;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public Integer getRank() {
        return rank;
    }

    public Integer getCourage() {
        return courage;
    }

    public Integer getFirepower() {
        return firepower;
    }

    public Integer getSkill() {
        return skill;
    }

    abstract int getOverAllRating();
}
