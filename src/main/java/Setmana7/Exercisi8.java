/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setmana7;
import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Exercisi8 {
    public static final int TOTAL = 100;
    public static final int MINIMO = 0;
    public static final int MAXIMO = 20;
    
    public static void main (String [] args){
        //Definim tipus de dades
        int numPrim = 0, num = 0;
        Scanner scan = new Scanner (System.in);
        boolean tipusCorrecte;
        boolean numBueno = false;
        
        while(!numBueno){
            System.out.print("Entra el número base: ");
            tipusCorrecte = scan.hasNextInt();//per analitzar tipus de dada
            if (tipusCorrecte){//si és un número sencer
                numPrim = scan.nextInt();
                if ((numPrim>MINIMO)&&(numPrim<=MAXIMO)){
                    numBueno = true;
                }
            }else{
                    scan.nextLine();
            }
        }
        //El programa muestra el total
        while (num<=TOTAL){
            if(num*numPrim <= TOTAL){
                System.out.println(num*numPrim);
            }
num++;
        }
    }
}
