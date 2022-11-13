package Setmana3;
import java.util.Scanner;

/**
 *
 * @author rgonzalez
 */
public class Exercisi3_2 {
    
    public static final float LONGITUD = 300.3f;
    public static void main (String[] args) {
        //Definimos medidas
        float ancho1,ancho2,profundidad1,profundidad2;
        float ancho3,aux;
        int area1,area2,volumen1,volumen2,area3,volumen3;
        
        //Inicializamos lector
        Scanner lector = new Scanner(System.in);
        
        //Pedimos medidas al usuario
        System.out.print("¿Cuál es el ancho 1?");
        ancho1 = lector.nextFloat();
        System.out.print("¿Cuál es la profundidad 1?");
        profundidad1 = lector.nextFloat();
        System.out.println("----------- TR. Profundidad1 valor: "+profundidad1);
        
        System.out.print("¿Cuál es el ancho 2?");
        ancho2 = lector.nextFloat();
        System.out.print("¿Cuál es la profundidad 2?");
        profundidad2 = lector.nextFloat();
        System.out.println("----------- TR. Profundidad1 valor: "+profundidad2);
        
        //Calculamos áreas
        area1 = (int)(LONGITUD * ancho1);
        area2 = (int)(LONGITUD * ancho2);
        
        //Calculamos volúmenes
        volumen1 = (int)(area1 * profundidad1);
        volumen2 = (int)(area2 * profundidad2);
        
        //Mostramos datos
        System.out.println("Piscina 1. Anchura: "+ancho1+" longitud: "+LONGITUD+" área: "+area1+" Volumen: "+volumen1);
        System.out.println("Piscina2. Anchura: "+ancho2+" longitud: "+LONGITUD+" área: "+area2+" Volumen: "+volumen2);
        
        //Calculamos nuevas medidas
        ancho3 = ancho1+ancho2;
        
        //Calculamos nuevas áreas
        area3 = (int)(LONGITUD * ancho3);
        volumen3 = volumen1 + volumen2;
        System.out.println("Nueva área: anchura:"+ancho3+" longitud:"+LONGITUD+" área: "+area3+" Volumen: "+volumen3);
        
        //intercambiamos valores
        aux = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = aux;
        System.out.println("-----------TR. Profundidad valor: "+profundidad1);
        System.out.println("-----------TR. Profundidad valor: "+profundidad2);
        
        //Calculamos nuevos volúmenes
        volumen1 = (int)(area1 * profundidad1);
        System.out.println("Nuevo volumen de piscina 1:");
        System.out.println("ancho: "+ancho1+" longitud: "+LONGITUD+" produndidad: "+profundidad1+" volumen: "+volumen1);
        
        volumen2 = (int)(area2 * profundidad2);
        System.out.println("Nuevo volumen de piscina 2:");
        System.out.println("ancho: "+ancho2+" longitud "+LONGITUD+" profundidad: "+profundidad2+" volumen: "+volumen2);
    }  
}
