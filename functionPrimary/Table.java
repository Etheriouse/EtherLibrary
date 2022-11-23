package EtherLibrary.functionPrimary;

public class Table {

    public class Str {

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
            //(tableau de clée ou de valeur, clé ou valeur qu'on cherche a checker, la class)
            return (recherche(t, cle, table) != -1);
        }
    
        public static TableStringString initTable() {
            TableStringString t = new TableStringString();
            t.cle = new String[2];
            t.valeur = new String[2];
            t.nombreAssoc = 0;
            return t;
        }
    
        public static void addTbl(String cle, String valeur, TableStringString table) {
            if(table.cle.length<=table.nombreAssoc) {
                table.cle = Tab.UpsizeStr(table.cle);
                table.valeur = Tab.UpsizeStr(table.valeur);
            }
            try {
                table.cle[table.nombreAssoc] = cle;
                table.valeur[table.nombreAssoc] = valeur;
                table.nombreAssoc+=1;
            } catch(Exception e) {
                error._msg("Error; int incompatible with String");
            }
        }
    
        public static void deleteTbl(String cle, String valeur, TableStringString table) {
            
            try {
                int index_modif = recherche(table.cle, cle, table); // return the index of the element and that key
                table.cle[index_modif] = "";
                table.valeur[index_modif] = "";
                for(int i = index_modif; i<table.nombreAssoc-1; i+=1) {
                    System.out.println(table.nombreAssoc-1 + " " + index_modif + " " + i);
                    table.cle[i] = table.cle[i+1];
                    table.valeur[i] = table.valeur[i+1];
                }
                table.nombreAssoc-=1;
            } catch(Exception e) {
                error._msg("Error, key or value unknown");
            }
                
        }
    
        public static void affTblstr(TableStringString table) {
            System.out.println("Cle ; Valeur");
            for(int i = 0; i<table.nombreAssoc; i+=1) {
                System.out.println(table.cle[i] + " ; " + table.valeur[i]);
            }
        }

    }

    public class Int {

        public static class TableIntInt {
            public int cle[];
            public int valeur[];
            public int nombreAssoc;
        }
    
        public static int recherche(int[] t, int cherche, TableIntInt table) {
            int index = -1;
            for(int i = 0; i<table.nombreAssoc;i+=1) {
                if(t[i] == cherche) {
                    index = i;
                }
            }
            return index;
        }
    
        public static boolean estTrouver(int t[], int cle, TableIntInt table) { 
            //(tableau de clée ou de valeur, clé ou valeur qu'on cherche a checker, la class)
            return (recherche(t, cle, table) != -1);
        }
    
        public static TableIntInt initTable() {
            TableIntInt t = new TableIntInt();
            t.cle = new int[2];
            t.valeur = new int[2];
            t.nombreAssoc = 0;
            return t;
        }
    
        public static void addTbl(int cle, int valeur, TableIntInt table) {
            if(table.cle.length<=table.nombreAssoc) {
                table.cle = Tab.UpsizeInt(table.cle);
                table.valeur = Tab.UpsizeInt(table.valeur);
            }
            try {
                table.cle[table.nombreAssoc] = cle;
                table.valeur[table.nombreAssoc] = valeur;
                table.nombreAssoc+=1;
            } catch(Exception e) {
                error._msg("Error; int incompatible with String");
            }
        }
    
        public static void deleteTbl(int cle, int valeur, TableIntInt table) {
            
            try {
                int index_modif = recherche(table.cle, cle, table); // return the index of the element and that key
                table.cle[index_modif] = 0;
                table.valeur[index_modif] = 0;
                for(int i = index_modif; i<table.nombreAssoc-1; i+=1) {
                    System.out.println(table.nombreAssoc-1 + " " + index_modif + " " + i);
                    table.cle[i] = table.cle[i+1];
                    table.valeur[i] = table.valeur[i+1];
                }
                table.nombreAssoc-=1;
            } catch(Exception e) {
                error._msg("Error, key or value unknown");
            }
                
        }
    
        public static void affTblint(TableIntInt table) {
            System.out.println("Cle ; Valeur");
            for(int i = 0; i<table.nombreAssoc; i+=1) {
                System.out.println(table.cle[i] + " ; " + table.valeur[i]);
            }
        }

    }
    
    public class Long {

        public static class TableLongLong {
            public long cle[];
            public long valeur[];
            public int nombreAssoc;
        }
    
        public static int recherche(long[] t, long cherche, TableLongLong table) {
            int index = -1;
            for(int i = 0; i<table.nombreAssoc;i+=1) {
                if(t[i] == cherche) {
                    index = i;
                }
            }
            return index;
        }
    
        public static boolean estTrouver(long t[], long cle, TableLongLong table) { 
            //(tableau de clée ou de valeur, clé ou valeur qu'on cherche a checker, la class)
            return (recherche(t, cle, table) != -1);
        }
    
        public static TableLongLong initTable() {
            TableLongLong t = new TableLongLong();
            t.cle = new long[2];
            t.valeur = new long[2];
            t.nombreAssoc = 0;
            return t;
        }
    
        public static void addTbl(long cle, long valeur, TableLongLong table) {
            if(table.cle.length<=table.nombreAssoc) {
                table.cle = Tab.UpsizeLong(table.cle);
                table.valeur = Tab.UpsizeLong(table.valeur);
            }
            try {
                table.cle[table.nombreAssoc] = cle;
                table.valeur[table.nombreAssoc] = valeur;
                table.nombreAssoc+=1;
            } catch(Exception e) {
                error._msg("Error; int incompatible with String");
            }
        }
    
        public static void deleteTbl(long cle, long valeur, TableLongLong table) {
            
            try {
                int index_modif = recherche(table.cle, cle, table); // return the index of the element and that key
                table.cle[index_modif] = 0;
                table.valeur[index_modif] = 0;
                for(int i = index_modif; i<table.nombreAssoc-1; i+=1) {
                    System.out.println(table.nombreAssoc-1 + " " + index_modif + " " + i);
                    table.cle[i] = table.cle[i+1];
                    table.valeur[i] = table.valeur[i+1];
                }
                table.nombreAssoc-=1;
            } catch(Exception e) {
                error._msg("Error, key or value unknown");
            }
                
        }
    
        public static void affTbllong(TableLongLong table) {
            System.out.println("Cle ; Valeur");
            for(int i = 0; i<table.nombreAssoc; i+=1) {
                System.out.println(table.cle[i] + " ; " + table.valeur[i]);
            }
        }

    }
    
        /*
         * char	| Caractère	; 2	valeur du jeu de caractères Unicode (65000 caractères possibles)
         * byte	| Entier très court	; 1	-128 à 127
         * short | Entier court	; 2	-32768 à 32767
         * int	| Entier ;4	-2 147 483 648 à 2 147 483 647
         * long	| Entier long ; 8	-9223372036854775808 à 9223372036854775807
         * float | flottant (réel) ; 4	-1.4*10-45 à 3.4*10^38
         * double | flottant double ; 8	4.9*10-324 à 1.7*10^308
         * boolean | booléen ; 1	0 ou 1 (en réalité, toute autre valeur que 0 est considérée égale à 1) 
         */

}