package ca.cicc.courseproject.Main.Problem1;

import java.util.Arrays;

public class peak implements place{
    /*Find the peak or the peak's of a array
    @param n -> array that contains a list of integers
    @param nSize -> number that represents the size of the array
     */
    @Override
    public int[] findNumbers(int[] n, int nSize) {
        int controller = 0;
        int[] newN = new int[nSize];
        if(nSize == 1) {
            //Return the first number if the array just have one integer
            newN[0] = n[0];
            return newN;
        } else {
            for(int i = 1; i < nSize; i++) {
                if(n[i] >= n[i - 1] && n[i] >= n[i + 1]) {
                    newN[controller] = n[i];
                    controller++;
                }
            }
        }
        return newN;
    }
    //Return the number of castels that can be construed
    public int castelsNumber(int n[]) {
        int result = 0;
        for(int i = 0; i < n.length; i++) {
            if(n[i] != 0) {
                result++;
            }
        }
        return result;
    }

    public void Test() {
        int[] n = new int[]{2,5,7,8,6,7,5};
        System.out.println(Arrays.toString((findNumbers(n, n.length))));
        int[] n2 = findNumbers(n, n.length);
        System.out.println("In this array we can construct " + castelsNumber(n2) + " castels");
    }
}
