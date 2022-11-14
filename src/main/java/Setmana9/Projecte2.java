package Setmana9;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Projecte2 {

    //Definim totes les constants
    public static final int MINIM_ID = 111;
    public static final int MAXIM_ID = 999;
    public static final int MINIM_EDAT = 14;
    public static final int MAXIM_EDAT = 120;
    public static final int MINIM_TIPUS = 0;
    public static final int MAXIM_TIPUS = 3;
    public static final int MINIM_IMPORT = 0;
    public static final int MAXIM_IMPORT = 1000;
    public static final int MINIM_TELEFON = 111111111;
    public static final int MAXIM_TELEFON = 999999999;
    public static final int LLI = 0;
    public static final int PEN = 1;
    public static final int JOV = 2;
    public static final int SOC = 3;
    public static final String LLI_NOM = "Venta LLiure";
    public static final String PEN_NOM = "Pensionista";
    public static final String JOV_NOM = "Carnet Jove";
    public static final String SOC_NOM = "Soci";
    public static final int MAX_INTENTS = 3;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Definim variables
        int id = 0;
        int edat = 0;
        int tipus = 0;
        int importe = 0;
        int telefon = 0;
        int i = 0;
        int clientsEntrats = 0;
        int seguir = 0;
        String tipusVenda = "";
        Scanner scan = new Scanner(System.in);
        boolean dadaCorrecta = true, introduirMes;

        do {
            introduirMes = false;
            do {
                //Comencem demanant l'id
                System.out.print("Entra el ID: ");
                dadaCorrecta = scan.hasNextInt(); //per analitzar tipus de dada
                if (dadaCorrecta) { //si es un número sencer
                    //LLegim dades
                    id = scan.nextInt();
                    //Avaluem si és válida
                    if ((id < MINIM_ID) || (id > MAXIM_ID)) {
                        dadaCorrecta = false;
                    }
                }
                i++;
            } while ((!dadaCorrecta) && (i < MAX_INTENTS));

            if (dadaCorrecta) {
                i = 0;//Inicialitzem comptador

                do {
                    //Pedim edat, llegim i mirem si és correcta
                    System.out.print("Entra la edat: ");
                    dadaCorrecta = scan.hasNextInt();

                    if (dadaCorrecta) {
                        //Llegim dades
                        edat = scan.nextInt();
                        //Avaluem si és válida
                        if ((edat < MINIM_EDAT) || (edat > MAXIM_EDAT)) {
                            dadaCorrecta = false;
                        }
                    }
                    i++;
                } while ((!dadaCorrecta) && (i < MAX_INTENTS));
            }
            if (dadaCorrecta) {
                i = 0; // Inicialitzem el comptador
                do {

                    //Entrem tipus de venda
                    System.out.print("\tVenda lliure (0)\n"
                            + "\tPensionista (1)\n"
                            + "\tCarnet jove (2)\n"
                            + "\tSoci (3)\n\n"
                            + "Entra el tipus de venda:");
                    dadaCorrecta = scan.hasNextInt();
                    if (dadaCorrecta) {
                        tipus = scan.nextInt();
                        if ((tipus < MINIM_TIPUS) || (tipus > MAXIM_TIPUS)) {
                            dadaCorrecta = false;
                        }
                    }
                    i++;
                } while ((!dadaCorrecta) && (i < MAX_INTENTS));
            }
            if (dadaCorrecta) {//Si fins al moment tot es correcte, pedim l'import
                i = 0;
                do {
                    System.out.print("Entra l'import: ");
                    dadaCorrecta = scan.hasNextInt();
                    if (dadaCorrecta) {//si es un número real  
                        importe = scan.nextInt();
                        if ((importe < MINIM_IMPORT) || (importe > MAXIM_IMPORT)) {
                            dadaCorrecta = false;
                        }
                    }
                    i++;
                } while ((!dadaCorrecta) && (i < MAX_INTENTS));
            }
            if (dadaCorrecta) {
                i = 0;
                //Llegim el telefon
                do {
                    System.out.print("Entra el telefon: ");
                    dadaCorrecta = scan.hasNextInt();
                    if (dadaCorrecta) {
                        telefon = scan.nextInt();
                        if ((telefon < MINIM_TELEFON) || (telefon > MAXIM_TELEFON)) {
                            dadaCorrecta = false;
                        }
                    }
                    i++;
                } while ((!dadaCorrecta) && (i < MAX_INTENTS));
            }
            if (dadaCorrecta) {
                //Obtin tipus de venda
                switch (tipus) {
                    case LLI:
                        tipusVenda = LLI_NOM;
                        break;
                    case PEN:
                        tipusVenda = PEN_NOM;
                        break;
                    case JOV:
                        tipusVenda = JOV_NOM;
                        break;
                    case SOC:
                        tipusVenda = SOC_NOM;
                        break;
                }
                //Mostrem el resultat per pantalla
                System.out.println("ID  ||  Edat    ||  Tipus de venda  ||  Import  ||  Telefon");
                System.out.println(id + " ||  " + edat + "      ||  " + tipusVenda + "     ||  " + importe + "      ||  " + telefon);
                clientsEntrats++;

            } else {//En cas de que hagi errors, donará error de dades
                System.out.println("Error de dades");
            }
            //Avaluem si vol introduir més clients
            System.out.println("es vol introduir més clients?");
            dadaCorrecta = scan.hasNextInt();
            if (dadaCorrecta) {
                seguir = scan.nextInt();
                if (seguir == 1) {
                    introduirMes = true;
                }
            } else {
                System.out.println("Dada incorrecta");
            }
        } while (introduirMes);
        //Mostrem dades introduides
        System.out.println("S'han inscrit " + clientsEntrats + " nous clients");
    }
}
