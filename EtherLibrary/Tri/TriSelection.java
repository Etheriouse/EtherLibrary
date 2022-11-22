package EtherLibrary.Tri;

public class TriSelection {

    public static int[] triSelection(int t[]) {
        int n = t.length;
        for(int i = 0; i<n; i+=1) {
            int indexMin=i;
            for(int j=i+1;j<n;j+=1) {
                if(t[j]<t[indexMin]) {
                    indexMin=j;
                }
            }

            int temps = t[i];
            t[i] = t[indexMin];
            t[indexMin] = temps;
        }

        return t;
    }
}
