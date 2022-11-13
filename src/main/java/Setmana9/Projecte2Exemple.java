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
public class Projecte2Exemple {
    
    public static final int MINIM_DNI = 1;
    public static final int MAXIM_DNI = 999999999;
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
    public static final String ASX_NOM = "Administració de sistemes informátics";
    public static final String DAW_NOM = "Desenvolupament d'aplicacions web";
    public static final int GAD = 211;
    public static final int AFI = 221;
    public static final int ADI = 222;
    public static final String GAD_NOM = "Gestió administrativa";
    public static final String AFI_NOM = "Administració i finances";
    public static final String ADI_NOM = "Asistència a la direcció";
    public static final int MINIM_NOTA = 0;
    public static final int MAXIM_NOTA = 10;
    public static final int MAX_INTENTS = 3;
    
    public static void main(String[] args){
        
        //Definim tipus de dades
        int dni = 0, familia = 0, cicle = 0, i = 0;
        float nota = 0f;
        String nomCicle = "";
        Scanner scan = new Scanner(System.in);
        boolean dadaCorrecta = true;
        
        do{
            //llegim i mirem si és correcta
            System.out.print ("Entra el DNI: ");
            dadaCorrecta = scan.hasNextInt();//per analitzar tipus de dada
            if (dadaCorrecta){//si és un número sencer
                //Llegim dades
                dni = scan.nextInt();
                //Avaluem si és vàlida
                if ((dni < MINIM_DNI)||(dni > MAXIM_DNI)){
                    dadaCorrecta = false;
                }
            }
            i++;
        }while ((!dadaCorrecta)&&(i<MAX_INTENTS));
        
        if (dadaCorrecta){
            i = 0;//per a cada dada inicialitzem el comptador d'intents a 0
            //Entrem Cicle
            System.out.print ("\n\tinformática i comunicacions (1)\n" +
                              "\t administració i gestió (2) \n" +
                              "\telectricitat i electrónica (3) \n" +
                              "\tsanitat (4) \n" +
                              "\tserveis socioculturals i a la comunitat (5) \n");
            
            do {
                System.out.print("\nEntra la familia professional: ");
                dadaCorrecta = scan.hasNextInt();
                if (dadaCorrecta){
                    familia = scan.nextInt();
                    if((familia < MINIM_FAMILIA)||(familia > MAXIM_FAMILIA)){
                        dadaCorrecta = false;
                    }else{//si arriben aquí es que la dada familia és correcta
                        i = 0; //Inicialitzem el comptador d'intents a 0
                        switch (familia){
                            case FAMILIA_INFORMATICA:
                                System.out.print("\n\tSist. m. i xarxes (111) \n"+
                                                 "\tDesenv. d'aplicacions multiplataforma (121) \n"+
                                                 "\tAdministració de sistemes informàtics (122) \n"+
                                                 "\tDesenvolupament d'aplicacions web (123) \n");
                                break;
                                //Resta de families per definir
                        }
                        do{
                            System.out.print("\nEntra el cicle: ");
                            dadaCorrecta = scan.hasNextInt ();
                            if (dadaCorrecta){
                                cicle = scan.nextInt();
                                switch (familia){
                            }
                        }
                    }
                }
            }
        }
    }
    
    
}
