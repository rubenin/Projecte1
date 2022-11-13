package Setmana6;

import java.util.Scanner;

/**
 *
 * @author rgonzalez
 */
public class Exercisi1 {
    
    public static void main (String[] args) {
        int edad;
        int ciclo = 0;
        int curso = 0;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Edad del alumno/a: ");
        edad = lector.nextInt();
        
        if (edad < 3){
            System.out.println("El alumno es demasiado pequeño");
        }else if (edad < 6){
            ciclo = 0;
        }else if (edad < 7){
            curso = 1;
            ciclo = 1;
        }else if (edad < 8){
            curso = 2;
            ciclo = 1;
        }else if (edad < 9){
            curso = 3;
            ciclo = 2;
        }else if (edad < 10){
            curso = 4;
            ciclo = 2;
        }else if (edad < 11){
            curso = 5;
            ciclo = 3;
        }else if (edad < 12){
            curso = 6;
            ciclo = 3;
        }else{
            
            System.out.println("El alumno/a es demasiado grande");
        }
        
        switch (ciclo){
            case 0 -> System.out.println("Educación infantil.");
        }
    }
}
