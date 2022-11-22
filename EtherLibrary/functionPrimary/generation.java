package EtherLibrary.functionPrimary;

import java.util.*;

public class generation {

    static Random random = new Random();
    
    public static int[] tabLongNr(int n, int maxNumberInTab) {
        int t[] = new int[random.nextInt(n)];
        for(int i = 0; i<t.length; i+=1) {
            t[i] = random.nextInt(maxNumberInTab);
        }
        return t;
    }

    public static int[] tabLongN(int n, int maxNumberInTab) {
        int t[] = new int[n];
        for(int i = 0; i<t.length; i+=1) {
            t[i] = random.nextInt(maxNumberInTab);
        }
        return t;
    }

    public static int[] tabLongN_void(int n) {
        int t[] = new int[random.nextInt(n)];
        return t; 
    }
}
