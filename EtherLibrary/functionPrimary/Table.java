package EtherLibrary.functionPrimary;

public class Table {

    public static int maxTable = 2000;

    public static class TableStringString {
        public String cle[];
        public String valeur[];
        public int nombreAssoc;
    }

    public static int recherche(String[] t, String cherche, TableStringString table) {
        int index = -1;
        for(int i = 0; i<table.nombreAssoc;i+=1) {
            if(t[i].compareTo(cherche) == 0) {
                index = i;
            }
        }
        return index;
    }

    public static boolean estTrouver(String t[], String cle, TableStringString table) {
        return (recherche(t, cle, table) != -1);
    }

    public static TableStringString initTable() {
        TableStringString t = new TableStringString();
        t.cle = new String[maxTable];
        t.valeur = new String[maxTable];
        t.nombreAssoc = 0;
        return t;
    }

    public static void addTbl(String cle, String valeur, TableStringString table) {
        if(table.nombreAssoc == maxTable) {
            System.out.println("! Erreur ! Taille de la table maximum depasser;");
        } else {
            table.cle[table.nombreAssoc] = cle;
            table.valeur[table.nombreAssoc] = valeur;
            table.nombreAssoc+=1;
        }
    }

    public static void deleteTbl(String cle, String valeur, TableStringString table) {
        int index_modif = recherche(table.cle, cle, table);
        if(!estTrouver(table.cle, cle, table)) {
            System.out.println("! Erreur ! , cle inconnu, valeur inconnu;");
        } else if(table.nombreAssoc == 1) {
            table.cle[0] = "null";
            table.valeur[0] = "null";
        } else if(table.nombreAssoc == 2) {
            table.cle[index_modif] = "";
            table.valeur[index_modif] = "";
            if(index_modif==0) {
                table.cle[index_modif] = table.cle[index_modif+1];
                table.valeur[index_modif] = table.valeur[index_modif+1];
            } else {

            }
            table.nombreAssoc-=1;
        } else {
            table.cle[index_modif] = "";
            table.valeur[index_modif] = "";
            for(int i = index_modif; i<table.nombreAssoc; i+=1) {
                table.cle[i] = table.cle[i+1];
                table.valeur[i] = table.valeur[i+1];
            }
            table.nombreAssoc-=1;
        }
    }

    public static void affTbl(TableStringString table) {
        System.out.println("Cle ; Valeur");
        for(int i = 0; i<table.nombreAssoc; i+=1) {
            System.out.println(table.cle[i] + " ; " + table.valeur[i]);
        }
    }
    
}
