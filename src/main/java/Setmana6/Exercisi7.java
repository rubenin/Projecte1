package Setmana6;

import java.util.Scanner;
/**
 *
 * @author ruben
 */
public class Exercisi7 {
    
    public static final int CAT1 = 1;
    public static final int CAT2 = 2;
    public static final int CAT3 = 3;
    public static final int CAT4 = 4;
    public static final int CAT5 = 5;
    public static final int CAT6 = 6;
    public static final int IVA_GNAL = 21;
    public static final int IVA_RED = 8;
    public static final int IVA_SRED = 4;
    public static final int LIMIT_PRECIO1 = 101;
    public static final int LIMIT_PRECIO2 = 501;
    public static final int COSTT_PRECIO1 = 3;
    public static final int COSTT_PRECIO2 = 20;
    public static final int COSTT_PRECIO3 = 50;
    
    public static void main(String[] args) {
        //Definim variables
        int opcion = 0;
        int unidades, categoria, iva, coste;
        float precio, precioFinal, precioSIva;
        Scanner scan = new Scanner(System.in);
                
        boolean correcto;
        
        //Mostramos las opciones
        System.out.println("1 - Calcular precio final");
        System.out.println("2 - Mostrar cual IVA se aplica");
        System.out.println("3 - Coste del envío");
        System.out.print("Selecciona una opción: ");
        
        correcto = scan.hasNextInt();
        if (correcto){
            opcion = scan.nextInt();
                //Pedimos datos al usuario
                System.out.print("Precio base: ");
                precio = scan.nextFloat();
                System.out.print("Numero de unidades: ");
                unidades = scan.nextInt();
                System.out.print("Categoria: ");
                categoria = scan.nextInt();
                
                //Mostramos el IVA a aplicar
                switch(categoria){
                    case CAT1: case CAT2:
                        iva = IVA_SRED;
                        break;
                    case CAT3: case CAT4:
                        iva = IVA_RED;
                        break;
                    case CAT5: case CAT6:
                        iva = IVA_GNAL;
                        break;
                    default:
                        iva = IVA_GNAL;
                }
                //Calculo del total del articulo
                precioFinal = (precio+precio+iva/100)+unidades;
                System.out.println("El precio final es: "+precioFinal);
            }else{
                if (opcion ==2){
                    //Seleccionamos la opcion
                    System.out.print("Categoria: ");
                    categoria = scan.nextInt();
                    
                    //Mostrem quan es l'IVA
                    switch(categoria){
                        case CAT1: case CAT2:
                            iva = IVA_SRED;
                            break;
                        case CAT3: case CAT4:
                            iva = IVA_RED;
                            break;
                        case CAT5: case CAT6:
                            iva = IVA_GNAL;
                            break;
                        default:
                            iva = IVA_GNAL;
                    }
                    //Calculamos y moostramos los resultados
                    System.out.println("L'IVA aplicat és: "+iva);
                }else{
                    if (opcion ==3){
                        //Introducimos los datos del usuario
                        System.out.print("Precio base: ");
                        precio = scan.nextFloat();
                        System.out.print("Numero de unidades: ");
                        unidades = scan.nextInt();
                        //Calculamos el importe sin IVA
                        precioSIva = precio + unidades;
                        //Calculamos el coste del envio
                        if(precioSIva<LIMIT_PRECIO1){
                            coste = COSTT_PRECIO1;
                        }else{
                            if(precioSIva<LIMIT_PRECIO2){
                                coste = COSTT_PRECIO2;
                            }else{
                                coste = COSTT_PRECIO3;
                            }
                        }
                        System.out.println("El coste del envío asciende a: "+coste);
                    }else{
                        System.out.println("Error. Selecciona 1, 2 ó 3.");
                    }
                }
            }
        }
    }

