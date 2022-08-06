package ca.cicc.courseproject.Main.Problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public void ToArray(String s) throws FileNotFoundException {
        String[] numbers = s.split(",");
        int[] ArrayNumbers = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            ArrayNumbers[i] = Integer.parseInt(numbers[i]);
        }
        peak p = new peak(ArrayNumbers, ArrayNumbers.length);
        p.Test();
        valley v = new valley(ArrayNumbers, ArrayNumbers.length);
        v.Test();
    }
    public void ReadFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\CourseProject\\src\\ca\\cicc\\courseproject\\Main\\Problem1\\castles.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            s = s.replace("[", "");
            s = s.replace("]", "");
            ToArray(s);
        }
    }
    public void Test() throws FileNotFoundException {
        ReadFile();
    }
}
