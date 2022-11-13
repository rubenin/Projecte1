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
public class Exercisi10_2 {
    
    public static final int NUM_MIN = 5;
    public static final int NUM_MAX = 10;
    public static int INTENTS = 3;
    
    public static void main (String[]args){
        Scanner lector = new Scanner (System.in);
        int valorUsuari = 0, senars = 0;
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
        System.out.println("Has arribat als tres intents. Fi de la prova.");
        //Comença el apartat 2: 
        System.out.println("Senars fins a "+valorUsuari);
        //Creem el bucle per a obtenir tots els valors fins al valor del usuari
        for (int i = 0; i < valorUsuari; i++){
            if (i%2!=0){
                System.out.println(i);
                //Sumem el valor a la variable senars
                senars += i;
            }
        }
        //Mostrem la suma dels senars
        System.out.println("La suma dels senars menors de "+valorUsuari+" es: "+senars);
    }
}
