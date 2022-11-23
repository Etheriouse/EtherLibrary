package EtherLibrary.Tri;

public class TriFusion {

    public class function {

        public static int[] fusionTableau(int t1[], int t2[]) {
            int k = 0;
            int i = 0, j = 0;
            int t3[] = new int[t1.length+t2.length];
            while(i<t1.length && j<t2.length) {
                if(t1[i]<=t2[j]) {
                    t3[k] = t1[i];
                    i+=1;
                } else {
                    t3[k] = t2[j];
                    j+=1;
                }
                k+=1;
            }
            while(i<t1.length) {
                t3[k] = t1[i];
                i+=1;
                k+=1;
            }
            while(j<t2.length) {
                t3[k] = t2[j];
                j+=1;
                k+=1;
            }
            return t3;
        }
    
    }

    public static int[] triFusion(int tableau[]) {
        int tableauGauche[] = new int[tableau.length/2];
        int tableauDroite[] = new int[tableau.length-tableauGauche.length];

        for(int i = 0; i<tableau.length; i+=1) {
            if(i<tableauGauche.length) {
                tableauGauche[i] = tableau[i];
            } else {
                tableauDroite[i-tableauGauche.length] = tableau[i];
            }
        }

        if(tableauGauche.length<=1 && tableauDroite.length<=1) {
            return function.fusionTableau(tableauGauche, tableauDroite);
        }

        return function.fusionTableau(triFusion(tableauDroite), triFusion(tableauGauche));
    }
}