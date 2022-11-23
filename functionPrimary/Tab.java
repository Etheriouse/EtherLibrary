package EtherLibrary.functionPrimary;

public class Tab {

    public static void Int(int[] a) {
        for(int i = 0; i<a.length; i+=1) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void Str(String[] a) {
        for(int i = 0; i<a.length; i+=1) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void Dou(double[] a) {
        for(int i = 0; i<a.length; i+=1) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void Int2(int[][] a) {
        for(int i = 0; i<a.length; i+=1) {
            for(int y = 0; y<a[0].length; y+=1) {
                System.out.print(a[i][y] + " ");
            }
            System.out.println();
        }
    }

    public static void Str2(String[][] a) {
        for(int i = 0; i<a.length; i+=1) {
            for(int y = 0; y<a[0].length; y+=1) {
                System.out.print(a[i][y] + " ");
            }
            System.out.println();
        }
    }

    public static void Dou2(double[][] a) {
        for(int i = 0; i<a.length; i+=1) {
            for(int y = 0; y<a[0].length; y+=1) {
                System.out.print(a[i][y] + " ");
            }
            System.out.println();
        }
    }

    public static int[] UpsizeInt(int t[]) {
        int tc[] = new int[t.length*2];
        for (int i = 0; i < t.length; i+=1) {
            tc[i] = t[i];
        }
        return tc;

    }

    public static String[] UpsizeStr(String t[]) {
        String tc[] = new String[t.length*2];
        for(int i = 0; i<t.length; i+=1) {
            tc[i] = t[i];
        }
        return tc;
    }

    public static long[] UpsizeLong(long t[]) {
        long tc[] = new long[t.length*2];
        for(int i = 0; i<t.length; i+=1) {
            tc[i] = t[i];
        }
        return tc;
    }
}