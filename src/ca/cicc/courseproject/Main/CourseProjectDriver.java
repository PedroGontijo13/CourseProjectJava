package ca.cicc.courseproject.Main;

import ca.cicc.courseproject.Main.Problem1.problem1;
import ca.cicc.courseproject.Main.Problem2.problem2;

import java.io.FileNotFoundException;

public class CourseProjectDriver {
    public static void main(String[] args) throws FileNotFoundException {
        //problem1 p1 = new problem1();
        //p1.invoke();
        problem2 p2 = new problem2();
        p2.Menu();
    }
}
