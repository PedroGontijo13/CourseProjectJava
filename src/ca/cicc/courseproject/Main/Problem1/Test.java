package ca.cicc.courseproject.Main.Problem1;

public class Test {
    public void Test() {
        int[] n = new int[]{2,6,6,6,3,7,5,8,9,8};
        peak p = new peak(n, n.length);
        p.Test();
        valley v = new valley(n, n.length);
        v.Test();
    }
}
