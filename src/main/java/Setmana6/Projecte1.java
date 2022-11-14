package Setmana6;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Projecte1 {
    //Definim totes les constants
    public static final int MINIM_ID = 111;
    public static final int MAXIM_ID =  999;
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
   
    public static void main(String[] args) {
        //Definim variables
        int id = 0;
        int edat = 0;
        int tipus = 0;
        int importe = 0;
        int telefon = 0;
        String tipusVenda = "";
        Scanner scan = new Scanner(System.in);
        boolean dadaCorrecta = true;
       
        //Comencem demanant l'id
        System.out.print("Entra el ID: ");
        dadaCorrecta = scan.hasNextInt(); //per analitzar tipus de dada
        if (dadaCorrecta) { //si es un número sencer
            //LLegim dades
            id = scan.nextInt();
            //Avaluem si és válida
            if ((id < MINIM_ID)||(id > MAXIM_ID)){
                dadaCorrecta = false;
            }
        }
        if (dadaCorrecta){
            //Pedim edat, llegim i mirem si és correcta
            System.out.print("Entra la edat: ");
            dadaCorrecta = scan.hasNextInt();
            if (dadaCorrecta) {
                //Llegim dades
                edat = scan.nextInt();
                //Avaluem si és válida
                if ((edat < MINIM_EDAT)||(edat > MAXIM_EDAT)){
                    dadaCorrecta = false;
                }
            }
        }
        if (dadaCorrecta){
            //Entrem tipus de venda
            System.out.print("\tVenda lliure (0)\n" +
                            "\tPensionista (1)\n" +
                            "\tCarnet jove (2)\n" +
                            "\tSoci (3)\n\n" +
                            "Entra el tipus de venda:");
            dadaCorrecta = scan.hasNextInt();
            if (dadaCorrecta){
                tipus = scan.nextInt();
                if ((tipus < MINIM_TIPUS)||(tipus > MAXIM_TIPUS)){
                    dadaCorrecta = false;
                }
            }
        }
        if (dadaCorrecta){//Si fins al moment tot es correcte, pedim l'import
            System.out.print("Entra l'import: ");
            dadaCorrecta = scan.hasNextInt();
            if (dadaCorrecta){//si es un número real  
                importe = scan.nextInt();
                if ((importe < MINIM_IMPORT)||(importe > MAXIM_IMPORT)){
                    dadaCorrecta = false;
                }
            }
        }
        if (dadaCorrecta) {//Llegim el telefon
            System.out.print("Entra el telefon: ");
            dadaCorrecta = scan.hasNextInt();
                if (dadaCorrecta){
                    telefon = scan.nextInt();
                    if ((telefon < MINIM_TELEFON)||(telefon > MAXIM_TELEFON)){
                        dadaCorrecta = false;
                    }
                }
            }
            if (dadaCorrecta) {
                //Obtin tipus de venda
                switch (tipus){
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
                System.out.println(id+" ||  "+edat+"      ||  "+tipusVenda+"     ||  "+importe+"      ||  "+telefon);
                }else{//En cas de que hagi errors, donará error de dades
                System.out.println("Error de dades");
                }
    }
}


     



 
        
  
