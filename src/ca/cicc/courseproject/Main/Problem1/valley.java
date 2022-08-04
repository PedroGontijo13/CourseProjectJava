package ca.cicc.courseproject.Main.Problem1;

import java.util.Arrays;

public class valley extends places{
    valley(int[] nV, int n1Castels) {
        super(nV, n1Castels);
    }

    public int[] getArray() {
        return this.n;
    }

    /*Set the number of castles of the class
        @param nCastles -> number of castles
     */
    public void setCastles(int nCastles) {
        this.nCastles = nCastles;
    }

    /*Verify if the number is the peak between 2 numbers
       @param n -> first number
       @param peak -> number to be checked
       @param n2 -> next number
    */
    public boolean verifyValley(int n, int peak, int n2) {
        if(peak < n && peak < n2) {
            return true;
        }
        return false;
    }

    /*Find the valley or the peak's of a array
        @param n[] -> array that contains a list of integers
        @param nSize -> number that represents the size of the array
     */
    @Override
    public int[] findNumbers(int[] n, int nSize) {
        int controller = 0;
        int[] newN = new int[nSize];
        for(int i = 0; i < nSize; i++) {
            //Verify if we can already take the elements from array to dont do one exception
            if(i > 0 && i <= nSize - 2) {
                int temp = n[i - 1];
                int temp2 = n[i + 1];
                if (verifyValley(temp, n[i], temp2)) {
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
    public int castlesNumbers(int[] n) {
        int result = 0;
        for(int i = 0; i < n.length; i++) {
            if(n[i] != 0) {
                result++;
            }
        }
        return result;
    }

    public void Test() {
        int[] n2 = findNumbers(this.n, this.n.length);
        setCastles(castlesNumbers(n2));
        System.out.println("In this array we can construct " + castlesNumbers(n2) + " castles in the valley");
    }
}
