package EtherLibrary.Tri;

public class TriQuickShort {

    public static int out = 0;

    public static int[] triPivot(int t[]) {
        if(t.length <=1 || function.checkSame(t)) {
            return t;
        }

        int k = t[0];
        int len = 0;
        for(int i = 1; i<t.length; i+=1) {
            if(t[i]<=k) {
                len+=1;
            }
        }

        int t1[] = new int[len];
        int t2[] = new int[t.length-len-1];

        int x = 0, y = 0;
        for(int i = 1; i<t.length; i+=1) {
            if(t[i]<=k && t1.length != 0) {
                t1[y] = t[i];
                y+=1;
            }

            if(t[i]>k && t2.length != 0) {
                t2[x] = t[i];
                x+=1;
            }
        }
        return function.concact_int(triPivot(t1), k, triPivot(t2));
    }

    public class function {


        public static boolean checkSame(int t[]) {
            int x = t[0];
            for(int i = 0; i<t.length; i+=1) {
                if(x!=t[i]) {
                    return false;
                }
            }
            return true;
        }

        public static int[] concact_int(int[] t1, int c, int[] t2) {
            int[] t3 = new int[t1.length+t2.length+1];
            for(int i = 0; i<t3.length; i+=1) {
                if(i<t1.length) {
                    t3[i] = t1[i];
                } else if (i == t1.length) {
                    t3[i] = c;
                } else {
                    t3[i] = t2[i-t1.length-1];
                }
            }
            return t3;
        }

    }

}
