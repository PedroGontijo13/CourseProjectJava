package ca.cicc.courseproject.Main;

import ca.cicc.courseproject.Main.Problem1.problem1;
import ca.cicc.courseproject.Main.Problem2.TestProblem2;

import java.io.FileNotFoundException;

public class CourseProjectDriver {
    public static void main(String[] args) throws FileNotFoundException {
        problem1 p1 = new problem1();
        p1.invoke();
        TestProblem2 t = new TestProblem2();
        t.test();
    }
}
