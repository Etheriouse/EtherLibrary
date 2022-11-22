package EtherLibrary.Tri;

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
}
