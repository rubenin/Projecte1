/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setmana8;

import java.util.Scanner;
/**
 *
 * @author ruben
 */
public class Exercisi10_1 {
    
    public static final int NUM_MIN = 5;
    public static final int NUM_MAX = 10;
    public static int INTENTS = 3;
    
    public static void main (String[]args){
        Scanner lector = new Scanner (System.in);
        int valorUsuari = 0, intents = 0;
        boolean valorNOk = true;
        
        //Solicitem el nombre
        do{
            System.out.print("Introdueix un nombre enter entre 0 i 10: ");
            valorUsuari = lector.nextInt();
            lector.nextLine();
            //comprobem si el nombre es correcte
            if((valorUsuari >= NUM_MIN)&&(valorUsuari <= NUM_MAX)){
                System.out.println("Es correcte. El teu nombre es: "+valorUsuari);
                valorNOk = false;
                //si fos incorrecte sumem un intent
            }else{
                INTENTS++;
                System.out.println("Es incorrecte.");
            }
        }
        //si arribem als 3 intents finalitzem.
        while (valorNOk && INTENTS < 3);
        System.out.println("Has arribat als tres intents. Fi de la prova");
    }
}
