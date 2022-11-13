package Setmana5;
/**arnau masmitja giralt*/
import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Exercisi1 {
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("¿Cuál es la edad del alumn@?_");
        
        int edad = lector.nextInt();
        lector.nextLine();
        int ciclo = 0;
        int curso = 0;
        
        if (edad < 3){
            System.out.println("El alumn@ es demasiado pequeñ@");
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
            System.out.println("El alumn@ es demasiado grande");
        }
        
        if ((edad >= 3)&&(edad <= 12)){
            switch (ciclo){
                case 0:
                System.out.println("El alumn@ es de Educación infantil");
                break;
                case 1:
                    System.out.println("El alumn@ es de Educación Primaria, ciclo inicial");
                    break;
                case 2: 
                    System.out.println(" El alumn@ es de Educación Primaria, ciclo Medio");
                    break;
                case 3:
                    System.out.println("El alumn@ es de Educación Primaria. Ciclo Superior");
                }
            System.out.println("El curso es: "+curso+".");
        }
    }
}
