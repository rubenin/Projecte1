/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setmana9;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Projecte2ExempleAmp2 {

    public static final int MINIM_DNI = 1;
    public static final int MAXIM_DNI = 99999999;
    public static final int MINIM_FAMILIA = 1;
    public static final int MAXIM_FAMILIA = 4;
    public static final int FAMILIA_INFORMATICA = 1;
    public static final int FAMILIA_ADMINISTRACIO = 2;
    public static final int MINIM_CICLE = 100;
    public static final int MAXIM_CICLE = 400;
    public static final int SMX = 111;
    public static final int DAM = 121;
    public static final int ASX = 122;
    public static final int DAW = 123;
    public static final String SMX_NOM = "Sistemes microinformàtics i xarxes";
    public static final String DAM_NOM = "Desenv. d'aplicacions multiplataforma";
    public static final String ASX_NOM = "Administració de sistemes informàtics";
    public static final String DAW_NOM = "Desenvolupament d'aplicacions web";
    public static final int GAD = 211;
    public static final int AFI = 221;
    public static final int ADI = 222;
    public static final String GAD_NOM = "Gestió administrativa";
    public static final String AFI_NOM = "Administració i finances";
    public static final String ADI_NOM = "Assitència a la direcció";
    public static final int MINIM_NOTA = 0;
    public static final int MAXIM_NOTA = 10;

    public static void main(String[] args) {
        //Definim tipus de dades
        int dni = 0, familia = 0, cicle = 0, alumnesEntrats = 0, seguir = 0;
        float nota = 0f;
        String nomCicle = "";
        Scanner scan = new Scanner(System.in);
        boolean dadaCorrecta = true, introduirMes;

        do {
            introduirMes = false; //per defecte, no volem introduir més 
            //(si no ens indiquen el contrari)
            //Llegim i mirem si és correcta
            System.out.print("Entra el DNI: ");
            dadaCorrecta = scan.hasNextInt();//per analitzar tipus de dada 
            if (dadaCorrecta) { // si és un número sencer 
                //Llegim dades
                dni = scan.nextInt();
                //Avaluem si és vàlida
                if ((dni < MINIM_DNI) || (dni > MAXIM_DNI)) {
                    dadaCorrecta = false;
                }
            }
            if (dadaCorrecta) {
                //Entrem Cicle
                System.out.print("\n\tinformàtica i comunicacions (1)\n"
                        + "\tadministració i gestió (2)\n"
                        + "\telectricitat i electrònica (3)\n"
                        + "\tsanitat (4)\n"
                        + "\tserveis socioculturals i a la comunitat (4)\n"
                        + "Entra la familia professional:");
                dadaCorrecta = scan.hasNextInt();
                if (dadaCorrecta) {
                    familia = scan.nextInt();
                    if ((familia < MINIM_FAMILIA) || (familia > MAXIM_FAMILIA)) {
                        dadaCorrecta = false;
                    } else {//Si aribem aquí es que la dada familia és correcta
                        switch (familia) {
                            case FAMILIA_INFORMATICA:
                                System.out.print("\n\tSist. m. i xarxes (111)\n"
                                        + "\tDesenv. d'aplicacions multiplataforma (121)\n"
                                        + "\tAdministració de sistemes informàtics (122)\n"
                                        + "\tDesenvolupament d'aplicacions web (123)\n"
                                        + "Entra el cicle:");
                                break;
                            case FAMILIA_ADMINISTRACIO:
                                System.out.print("\n\tGestió administrativa (211)\n"
                                        + "\tAdministració i finances (221)\n"
                                        + "\tAssitència a la direcció (222)\n"
                                        + "Entra el cicle:");
                                break;
                            //Resta de families per definir
                        }
                        dadaCorrecta = scan.hasNextInt();
                        if (dadaCorrecta) {
                            cicle = scan.nextInt();
                            switch (familia) {
                                case FAMILIA_INFORMATICA:
                                    switch (cicle) {
                                        case SMX:
                                        case DAM:
                                        case ASX:
                                        case DAW:
                                            break; //Si codi és correcte no fem res
                                        default:
                                            dadaCorrecta = false;
                                    }
                                    break;
                                case FAMILIA_ADMINISTRACIO:
                                    switch (cicle) {
                                        case GAD:
                                        case AFI:
                                        case ADI:
                                            break; //Si codi és correcte no fem res
                                        default:
                                            dadaCorrecta = false;
                                    }
                                    break;
                                //Resta de families per definir
                            }
                        }
                    }
                }
            }
            if (dadaCorrecta) { //si fins al moment tot correcte, anem a llegir nota
                System.out.print("Entra la nota mitjana: ");
                dadaCorrecta = scan.hasNextFloat();//per analitzar tipus de dada 
                if (dadaCorrecta) { // si és un número real 
                    nota = scan.nextFloat();
                    if ((nota < MINIM_NOTA) || (nota > MAXIM_NOTA)) {
                        dadaCorrecta = false;
                    }
                }
            }
            if (dadaCorrecta) {
                //Obtinc nom del cicle
                switch (cicle) {
                    case SMX:
                        nomCicle = SMX_NOM;
                        break;
                    case DAM:
                        nomCicle = DAM_NOM;
                        break;
                    case ASX:
                        nomCicle = ASX_NOM;
                        break;
                    case DAW:
                        nomCicle = DAW_NOM;
                        break;
                    case GAD:
                        nomCicle = GAD_NOM;
                        break;
                    case AFI:
                        nomCicle = AFI_NOM;
                        break;
                    case ADI:
                        nomCicle = ADI_NOM;
                        break;
                    //Resta de families per definir
                }
                System.out.println("DNI nota Cicle");
                System.out.println(dni + " " + nota + " " + nomCicle);
                alumnesEntrats++; //comptador número alumnes
            } else {
                System.out.println("dades incorrectes");
            }
            //Avaluem si vol introduir més alumnes
            System.out.println("es vol introduir mes alumnes?");
            dadaCorrecta = scan.hasNextInt();
            if (dadaCorrecta) { // si és un número sencer 
                seguir = scan.nextInt();
                if (seguir == 1) {
                    introduirMes = true;
                }
            } else {
                System.out.println("dada incorrecta");
            }
        } while (introduirMes);
        //Mostrem dades introduides
        System.out.println("S'han inscrit " + alumnesEntrats + " nous alumnes");
    }
}
