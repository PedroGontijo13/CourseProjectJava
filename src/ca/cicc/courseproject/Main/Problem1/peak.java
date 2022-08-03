package ca.cicc.courseproject.Main.Problem1;

import java.util.Arrays;

public class peak extends places{
    /*Find the peak or the peak's of a array and create a new array with them
        @param n[] -> array that contains a list of integers
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
    /*Find the number of castels that can be construed
        @param n[] -> array that contains a list of integers
     */
    @Override
    public int CastelsNumbers(int n[]) {
        int result = 1;

        //See all elements of array
        for(int i = 0; i < n.length; i++) {
            //Check if the element of array is the same and check if its diferent than zero
            if(n[i] != 0 && n[i] != n[result + 1]) {
                result++;
            }
        }
        return result;
    }

    public void Test() {
        //int[] n = new int[]{2,5,7,8,6,7,5};
        int[] n = new int[]{2,6,6,6,3,7,5,8,9,8};
        System.out.println(Arrays.toString((findNumbers(n, n.length))));
        int[] n2 = findNumbers(n, n.length);
        System.out.println("In this array we can construct " + CastelsNumbers(n2) + " castels");
    }
}
