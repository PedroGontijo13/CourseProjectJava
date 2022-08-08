package ca.cicc.courseproject.Main.Problem2;

import java.util.ArrayList;

public class Battle implements Rules{
    private ArrayList<Transformer> winnerOfAutobots;
    private ArrayList<Transformer> winnerOfDeceptions;

    public Battle() {
        this.winnerOfAutobots = new ArrayList<Transformer>();
        this.winnerOfDeceptions = new ArrayList<Transformer>();
    }

    @Override
    public int compareToCourageAndStrength(Transformer autobot, Transformer deception){
        if(autobot.getCourage() - deception.getCourage() >= 4 && autobot.getStrength() - deception.getStrength() >= 3){
            winnerOfAutobots.add(autobot);
            return 1;
        } else if(deception.getCourage() - autobot.getCourage() >= 4 && deception.getStrength() - autobot.getStrength() >= 3){
            winnerOfDeceptions.add(deception);
            return 1;
        } else{
            return 0;
        }
    }

    @Override
    public int compareToSkill(Transformer autobot, Transformer deception){
        if(autobot.getSkill() - deception.getSkill() >= 3){
            winnerOfAutobots.add(autobot);
            return 1;
        } else if(deception.getSkill() - autobot.getSkill() >= 3){
            winnerOfDeceptions.add(deception);
            return 1;
        } else{
            return 0;
        }
    }

    @Override
    public int compareToOverAllRating(Transformer autobot, Transformer deception){
        if(autobot.getOverAllRating() > deception.getOverAllRating()){
            winnerOfAutobots.add(autobot);
            return 1;
        } else if(deception.getOverAllRating() > autobot.getOverAllRating()){
            winnerOfDeceptions.add(deception);
            return 1;
        } else{
            return 0;
        }
    }

    @Override
    public int specialRules(Transformer autobot, Transformer deception){
        if((autobot.getNameOfRobot() == "Optimus Prime" && deception.getNameOfRobot() == "Optimus Prime") || (autobot.getNameOfRobot() == "Optimus Prime" && deception.getNameOfRobot() == "Predaking") || (autobot.getNameOfRobot() == "Predaking" && deception.getNameOfRobot() == "Optimus Prime") || (autobot.getNameOfRobot() == "Predaking" && deception.getNameOfRobot() == "Predaking")){
            return 2;
        } else if(autobot.getNameOfRobot() == "Optimus Prime" || autobot.getNameOfRobot() == "Predaking"){
            winnerOfAutobots.add(autobot);
            return 1;
        } else if(deception.getNameOfRobot() == "Optimus Prime" || deception.getNameOfRobot() == "Predaking"){
            winnerOfDeceptions.add(deception);
            return 1;
        } else{
            return 0;
        }
    }

    static int tempBattles = 0;

    public int goToBattleAndCountBattles(ArrayList<Transformer> autobots, ArrayList<Transformer> deceptions){
        if(autobots.size() >= deceptions.size()) tempBattles = deceptions.size();
        else tempBattles = autobots.size();

        int countBattles = 1;

        for(int i = 0; i < tempBattles; i++){
            Transformer autobot = autobots.get(i);
            Transformer deception = deceptions.get(i);

            if(this.specialRules(autobot, deception) == 2){
                countBattles += 1;
                break;
            } else if(this.specialRules(autobot, deception) == 1){
                countBattles += 1;
                //continue;
            } else if(this.compareToCourageAndStrength(autobot, deception) == 1){
                countBattles += 1;
                //continue;
            } else if(this.compareToSkill(autobot, deception) == 1){
                countBattles += 1;
                //continue;
            } else if(this.compareToOverAllRating(autobot, deception) == 1){
                countBattles += 1;
                //continue;
            } else{
                countBattles += 1;
                //continue;
            }
        }
        return countBattles;
    }
    public String getTheWinnerTeamName(){
        if(winnerOfAutobots.size() > winnerOfDeceptions.size()) return "Autobots";
        else return "Deceptions";
    }

    public String getTheloserTeamName(){
        if(winnerOfAutobots.size() > winnerOfDeceptions.size()) return "Deceptions";
        else return "Autobots";
    }

    public ArrayList<Transformer> getTheWinnerTeamList(){
        if(winnerOfAutobots.size() > winnerOfDeceptions.size()) return winnerOfAutobots;
        else return winnerOfDeceptions;
    }

    public ArrayList<Transformer> getTheSurvivingMemberList(){
        if(winnerOfAutobots.size() > winnerOfDeceptions.size()) return winnerOfDeceptions;
        else return winnerOfAutobots;
    }

    public ArrayList<Transformer> getWinnerOfAutobots() {
        return winnerOfAutobots;
    }

    public ArrayList<Transformer> getWinnerOfDeceptions() {
        return winnerOfDeceptions;
    }
}

