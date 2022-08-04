package ca.cicc.courseproject.Main.Problem2;

import java.util.Scanner;

public class problem2 {
    public String[] SplitArray(String x) {
        x = x.replace(" ", "");
        String[] y = x.split(",");
        for(int i = 0; i < y.length; i++) {
            System.out.println(i + ":" + y[i]);
        }
        return y;
    }
    public void InputGroup() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Group of robots: ");
            String x = scanner.nextLine();
            String[] y = SplitArray(x);
            Transformes transformes = new Transformes(y[0], y[1], Integer.parseInt(y[2]), Integer.parseInt(y[3]), Integer.parseInt(y[4]), Integer.parseInt(y[5]), Integer.parseInt(y[6]), Integer.parseInt(y[7]), Integer.parseInt(y[8]), Integer.parseInt(y[9]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
