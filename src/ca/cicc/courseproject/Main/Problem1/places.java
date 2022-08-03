package ca.cicc.courseproject.Main.Problem1;

public class places implements place{
    public int[] n;
    public int nCastles;

    places(int[] nV, int n1Castels) {
        this.n = nV;
        this.nCastles = n1Castels;
    }

    @Override
    public int[] findNumbers(int[] n, int nSize) {
        return new int[0];
    }

    @Override
    public int CastelsNumbers(int[] n) {
        return 0;
    }
}
