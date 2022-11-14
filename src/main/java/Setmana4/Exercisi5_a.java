package Setmana4;

/**
 *
 * @author rgonzalez
 */

import java.util.Scanner;

public class Exercisi5_a {
    
    public static final int PUNTOS_TIENEHERMANOS = 40;
    public static final int PUNTOS_VIVECERCA = 30;
    public static final int PUNTOS_TRABAJANCERCA = 20;
    public static final int PUNTOS_DISCAPACIDAD = 10;
    public static final int PUNTOS_NUMEROSA = 15;
    public static final int PUNTOS_EXALUMNOS = 5;
    
    
    public static void main(String[] args) {
        //Definimos datos
        int numero;
        int tieneHermanos, viveCerca, trabajanCerca, Discapacidad, Numerosa, exalumnos;
        int puntos=0;
        Scanner scan = new Scanner(System.in);
        
        //Solicitamos datos
        System.out.print("Número de registro del niño: ");
        numero = scan.nextInt();
        System.out.print("¿Tiene hermanos en el centro (0:no/1:si)?: ");
        tieneHermanos = scan.nextInt();
        System.out.print("Viven cerca (0:no/1:si)?: ");
        viveCerca = scan.nextInt();
        System.out.print("trabajan cerca sus padres (0:no/1:si)?: ");
        trabajanCerca = scan.nextInt();
        System.out.print("Tiene alguna discapacidad (0:no/1:si)?: ");
        Discapacidad = scan.nextInt();
        System.out.print("Familia numerosa(0:no/1:si)?: ");
        Numerosa = scan.nextInt();
        System.out.print("Familiares exalumnos (0:no/1:si)?:");
        exalumnos = scan.nextInt();
        
        //Hacemos la suma
        if (tieneHermanos == 1){
            puntos = PUNTOS_TIENEHERMANOS;
        }
        if(viveCerca == 1){
            puntos += PUNTOS_VIVECERCA; //Equivel a punts = punts+30;
        }else{
            if (trabajanCerca == 1){
                puntos += PUNTOS_TRABAJANCERCA; //Equivel a punts = punts +0;
            }
        }
        if (Discapacidad == 1){
            puntos += PUNTOS_DISCAPACIDAD;
        }
        if (Numerosa == 1){
            puntos += PUNTOS_NUMEROSA;
        }
        if (exalumnos == 1){
            puntos = puntos + PUNTOS_EXALUMNOS;
        }
        //Calculamos el total 
        System.out.println("El alumno tiene : " +puntos);
    }
}
