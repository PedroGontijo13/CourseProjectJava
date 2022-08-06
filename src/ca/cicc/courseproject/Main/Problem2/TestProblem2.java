package ca.cicc.courseproject.Main.Problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestProblem2 {
    static Judge judge = new Judge();

    //Remove commas and spaces
    public static String[] SplitArray(String x) {
        //Remove the spaces from the array
        x = x.replace(" ", "");
        //Separate each attribute in one array
        String[] y = x.split(",");
        return y;
    }
    public static void InputGroupRobot(String s) {
        try {
            String[] numbers = s.split("[*]");;
            for(int i = 0; i < numbers.length; i++) {
                String[] y = SplitArray(numbers[i]);
                createRobot(y);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Verify if the robot is an autobot or decption and create
    public static Object createRobot(String[] y) {
        if(y[1] == "a" || y[1] == "A") {
            Transformer autobot = new Transformer(y[0], y[1], Integer.parseInt(y[2]), Integer.parseInt(y[3]), Integer.parseInt(y[4]), Integer.parseInt(y[5]), Integer.parseInt(y[6]), Integer.parseInt(y[7]), Integer.parseInt(y[8]), Integer.parseInt(y[9]));
            judge.addIntoListAutobot(autobot);
            return autobot;
        } else {
            Transformer deception = new Transformer(y[0], y[1], Integer.parseInt(y[2]), Integer.parseInt(y[3]), Integer.parseInt(y[4]), Integer.parseInt(y[5]), Integer.parseInt(y[6]), Integer.parseInt(y[7]), Integer.parseInt(y[8]), Integer.parseInt(y[9]));
            System.out.println(deception.getNameOfRobot() + " " + deception.getTeam() + " created!");
            judge.addIntoListDecption(deception);
            return deception;
        }
    }

    public static void ReadFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\pedro\\Desktop\\CourseProjectJava-master\\CourseProjectJava-master\\wmad202-courseProject2\\src\\ca\\ciccc\\wmad\\project2\\problem2\\transformers.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            InputGroupRobot(s);
        }
    }

    public static void test() throws FileNotFoundException {
        ReadFile();
        judge.printInformationOfResult();
        /*
        Transformer e = new Transformer("e","a",4,5,5,3,2,9,9,1);
        Transformer q = new Transformer("q","d",1,2,3,4,5,2,7,8);
        Transformer i = new Transformer("i","a",5,8,10,1,34,9,45,7);
        Transformer f = new Transformer("f","d",8,3,2,1,9,3,87,9);
        ArrayList<Transformer> autobots = new ArrayList<Transformer>();
        ArrayList<Transformer> deceptions = new ArrayList<Transformer>();
        autobots.add(e);
        autobots.add(i);
        deceptions.add(q);
        deceptions.add(f);
        Judge j = new Judge(autobots, deceptions);
        j.printInformationOfResult();*/
    }
}
