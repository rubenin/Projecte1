/**
 * 
 * @author rgonzalez
 */
package Setmana4;
import java.util.Scanner;
public class Exercisi5_b {
    
    public static final int NUMERO_MIN = 1;
    public static final int NUMERO_MAX = 499;
    public static final int RESPUESTA_NO = 0;
    public static final int RESPUESTA_SI = 1;
    public static final int PUNTOS_TIENEHERMANOS = 40;
    public static final int PUNTOS_VIVECERCA = 30;
    public static final int PUNTOS_TRABAJANCERCA = 20;
    public static final int PUNTOS_DISCAPACIDAD = 10;
    public static final int PUNTOS_NUMEROSA = 15;
    public static final int PUNTOS_EXALUMNOS = 5;
    
    public static void main(String[] args) {
        //Solicitamos datos
        int numero, tieneHermanos, viveCerca, trabajanCerca, Discapacidad, Numerosa, Exalumnos;
        int puntos = 0;
        boolean correcto;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Numero de registro: ");
        correcto = scan.hasNextInt();
        if (correcto){
            
            numero = scan.nextInt();
            if ((numero<NUMERO_MIN)||(numero>NUMERO_MAX)){
                correcto = false;
                System.out.println(" Numero de registro erroneo");
            }else{
                System.out.print("Tiene hermanos en el centro (0:no/1:si)?: ");
                correcto = scan.hasNextInt();
                if (correcto){
                tieneHermanos = scan.nextInt(); 
                //Avaluem si és válida. si teGerma es 0 o 1
                if ((tieneHermanos < RESPUESTA_NO)||(tieneHermanos > RESPUESTA_SI)){
                    correcto = false;
                    System.out.println("No es correcto");
                }else{
                System.out.print("Vive cerca (0:no/1:si?: ");
                correcto = scan.hasNextInt();
                if (correcto){
                    viveCerca = scan.nextInt();
                    if ((viveCerca < RESPUESTA_NO)||(viveCerca > RESPUESTA_SI)){
                        correcto = false;
                        System.out.println("No es correcto");
                    }else{
                        System.out.print("Trabajan cerca sus padres (0:no/1:si):?");
                        correcto = scan.hasNextInt();
                        if (correcto){
                            trabajanCerca = scan.nextInt();
                            if ((trabajanCerca < RESPUESTA_NO)||(trabajanCerca > RESPUESTA_SI)){
                                correcto = false;
                                System.out.println("Entrada incorrecta");
                            }else{
                                System.out.print("Tiene alguna discapacidad(0:no/1:si)?: ");
                                correcto = scan.hasNextInt();
                                if (correcto){
                                    Discapacidad = scan.nextInt();
                                    if((Discapacidad < RESPUESTA_NO) || (Discapacidad > RESPUESTA_SI)){
                                        correcto = false;
                                        System.out.println("No es correcto");
                                    }else{
                                        System.out.print("Familia numerosa (0:no/1:si)?: ");
                                        correcto = scan.hasNextInt();
                                        if (correcto){
                                            Numerosa = scan.nextInt();
                                            if((Numerosa < RESPUESTA_NO)||(Numerosa > RESPUESTA_SI)){
                                                correcto = false;
                                                System.out.println("No es correcto");
                                            }else{
                                                System.out.print("familiares exalumnos (0:no/1:si)?: ");
                                                correcto = scan.hasNextInt();
                                                if (correcto){
                                                    Exalumnos = scan.nextInt();
                                                    if ((Exalumnos < RESPUESTA_NO)||(Exalumnos > RESPUESTA_SI)) {
                                                        correcto = false;
                                                        System.out.println("no es correcto");
                                                            }else{
                                                                //Hacemos la suma
                                                                if(tieneHermanos == 1){
                                                                    puntos = PUNTOS_TIENEHERMANOS;
                                                                }
                                                                if (viveCerca == 1){
                                                                    puntos += PUNTOS_VIVECERCA;
                                                                }else{
                                                                if (trabajanCerca == 1){
                                                                        puntos += PUNTOS_TRABAJANCERCA;
                                                                    }
                                                                }
                                                                if (Discapacidad == 1){
                                                                    puntos += PUNTOS_DISCAPACIDAD;
                                                                }
                                                                if (Numerosa == 1){
                                                                    puntos += PUNTOS_NUMEROSA;
                                                                }
                                                                if (Exalumnos == 1){
                                                                    puntos = puntos + PUNTOS_EXALUMNOS;
                                                                }
                                                                //Calculamos el total
                                                                System.out.println("El alumno tiene: "+puntos);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }   
                        }
                    }        
                }
            }
        }
    }
}