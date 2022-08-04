package ca.cicc.courseproject.Main.Problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class problem2 {
    public String[] SplitArray(String x) {
        //Remove the spaces from the array
        x = x.replace(" ", "");
        //Separate each attribute in one array
        String[] y = x.split(",");
        return y;
    }
    //Verify if the robot is an autobot or decption and create
    public Object createRobot(String[] y) {
        if(y[1] == "a" || y[1] == "A") {
            Transformes.Autobot autobot = new Transformes.Autobot(y[0], y[1], Integer.parseInt(y[2]), Integer.parseInt(y[3]), Integer.parseInt(y[4]), Integer.parseInt(y[5]), Integer.parseInt(y[6]), Integer.parseInt(y[7]), Integer.parseInt(y[8]), Integer.parseInt(y[9]));
            System.out.println(autobot.GetName() + " " + autobot.GetType());
            return autobot;
        } else {
            Transformes.Deception deception = new Transformes.Deception(y[0], y[1], Integer.parseInt(y[2]), Integer.parseInt(y[3]), Integer.parseInt(y[4]), Integer.parseInt(y[5]), Integer.parseInt(y[6]), Integer.parseInt(y[7]), Integer.parseInt(y[8]), Integer.parseInt(y[9]));
            System.out.println(deception.GetName() + " " + deception.GetType() + " created!");
            return deception;
        }
    }
    public void DecptionList(Transformes.Deception deception) {

    }
    public void InputGroupRobot() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Group of robots: ");
            String x = scanner.nextLine();
            String[] y = SplitArray(x);
            createRobot(y);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Menu() {
        System.out.println("1 - Create a robot");
        System.out.println("2 - go to battle");
        System.out.println("3 - See robots");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose option: ");
        int option = scanner.nextInt();
        if(option == 1) {
            InputGroupRobot();
        }
    }
}
