package ca.cicc.courseproject.Main.Problem2;

import java.util.ArrayList;

public class Battle {
    ArrayList<Transformes.Deception> al = new ArrayList<>();
    ArrayList<Transformes.Autobot> alAuto = new ArrayList<>();

    public void addIntoListDecption(Transformes.Deception deception) {
        al.add(deception);
    }
    public void addIntoListAutobot(Transformes.Autobot autobot) {
        alAuto.add(autobot);
    }

    public void SeeListAutoBots() {
        System.out.println("Autobots: ");
        for(Transformes.Autobot a : alAuto) {
            System.out.println(a);
        }
    }
}
