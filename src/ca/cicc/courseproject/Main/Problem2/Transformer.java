package ca.cicc.courseproject.Main.Problem2;

public class Transformer extends Robot {

    private String nameOfRobot;
    private String team;

    public Transformer(String nameOfRobot, String team, Integer strength, Integer intelligence, Integer speed, Integer endurance, Integer rank, Integer courage, Integer firepower, Integer skill) {
        super(strength, intelligence, speed, endurance, rank, courage, firepower, skill);
        this.nameOfRobot = nameOfRobot;
        this.team = team;
    }

    public void setNameOfRobot(String nameOfRobot) {
        this.nameOfRobot = nameOfRobot;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNameOfRobot() {
        return nameOfRobot;
    }

    public String getTeam() {
        return team;
    }

    public void getInformationOfTransformer(){
        System.out.println("Transformer name is " + this.getNameOfRobot() + "\n" + "Transformer type is " + this.getTeam());
    }

    @Override
    public int getOverAllRating(){
        return this.getStrength() + this.getIntelligence() + this.getSpeed() + this.getEndurance() + this.getFirepower();
    }
}
