package ca.cicc.courseproject.Main.Problem1;

import java.util.Arrays;

public class peak extends places{
    peak(int[] nV, int n1Castles) {
        super(nV, n1Castles);
    }

    /*Set the number of castles of the class
        @param nCastles -> number of castles
     */
    public void setCastles(int nCastles) {
        this.nCastles = nCastles;
    }

    public int getCastles() {
        return this.nCastles;
    }

    /*Verify if the number is the peak between 2 numbers
        @param n -> first number
        @param peak -> number to be checked
        @param n2 -> next number
     */
    public boolean verifyPeak(int n, int peak, int n2) {
        if(peak >= n && peak >= n2) {
            return true;
        }
        return false;
    }

    /*Find the peak or the peak's of an array and create a new array with them
        @param n[] -> array that contains a list of integers
        @param nSize -> number that represents the size of the array
     */
    @Override
    public int[] findNumbers(int[] n, int nSize) {
        int controller = 0;
        int[] newN = new int[nSize];
        for(int i = 0; i < nSize; i++) {
            //Verify if we can already take the elements from array to don't do one exception
            if(i >= 1 && i <= nSize - 2) {
                int temp = n[i - 1];
                int temp2 = n[i + 1];
                if (verifyPeak(temp, n[i], temp2)) {
                    newN[controller] = n[i];
                    controller++;
                }
            }
        }
        return newN;
    }
    /*Find the number of castles that can be construed
        @param n[] -> array that contains a list of integers
     */
    @Override
    public int castlesNumbers(int n[]) {
        int result = 0;
        //See all elements of array
        for(int i = 0; i < n.length; i++) {
            //Check if the element of array is the same and check if it's different from zero
            if(n[i] != 0 && n[i] != n[i + 1]) {
                result++;
            }
        }
        return result;
    }

    public void Test() {
        System.out.println(Arrays.toString(this.n));
        int[] n2 = findNumbers(this.n, this.n.length);
        setCastles(castlesNumbers(n2));
        System.out.println("In this array we can construct " + getCastles() + " castles in the peak");
    }
}
