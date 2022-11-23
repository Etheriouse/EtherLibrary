package EtherLibrary.Tri;

import EtherLibrary.functionPrimary.*;;

public class TriInsertion {

    public static int[] triIsertion(int list[]) {
        int len = list.length;

        for(int i = 1; i<len; i+=1) {
            int index = list[i];
            int y = i-1;

            while(y >= 0 && list[y] > index) {
                list[y+1] = list[y];
                y-=1;
            }

            list[y+1] = index;
        
        }
        return list;
    }

    public static int[] test(int t[]) {
        int m = t.length;
        for(int i = m-1; i>=0 ;i--) {
            int c = 0;
            for(int j = 0; j< m; j++) {
                if(c<t[j]) {
                    c = t[i];
                    t[i] = t[j];
                    t[j] = c;
                }
            }
            m-=1;
            Tab.Int(t);
        }
        return t;
    }

    public static void main(String[] args) {
        int t[] = {5, 6, 7, 2, 1, 0, 9};
        test(t);
    }
}
