package ca.cicc.courseproject.Main.Problem2;

import java.util.ArrayList;

public class Judge {
    private ArrayList<Transformer> autobots;
    private ArrayList<Transformer> deceptions;

    Judge() {
        this.autobots = new ArrayList<>();
        this.deceptions = new ArrayList<>();
    }

    public void addIntoListDecption(Transformer deception) {
        autobots.add(deception);
    }
    public void addIntoListAutobot(Transformer autobot) {
        deceptions.add(autobot);
    }

    public void SeeListAutoBots() {
        System.out.println("Autobots: ");
        for(Transformer a : autobots) {
            System.out.println(a.getNameOfRobot() + " " + a.getTeam());
        }
    }
    public void SeeListDecpitions() {
        System.out.println("Decpitions: ");
        for(Transformer a : deceptions) {
            System.out.println(a.getNameOfRobot() + " " + a.getTeam());
        }
    }
    public Judge(ArrayList<Transformer> autobots, ArrayList<Transformer> deceptions) {
        this.autobots = autobots;
        this.deceptions = deceptions;
    }

    public void printInformationOfResult(){
        Battle b = new Battle();
        int battles = b.goToBattleAndCountBattles(autobots, deceptions);
        String theWinnerTeam = b.getTheWinnerTeamName();
        ArrayList<Transformer> theWinnerTeamList = b.getTheWinnerTeamList();
        System.out.println("The number of battles: " + battles);
        String winners = "";

        for(int i = 0; i < theWinnerTeamList.size(); i++){
            winners += theWinnerTeamList.get(i).getNameOfRobot() + " ";
        }

        System.out.println("(" + theWinnerTeam + "): " + winners);

    }
}
