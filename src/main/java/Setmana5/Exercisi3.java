package Setmana5;
/**Amina Ibrahim Gasca*/

/**
 *
 * @author ruben
 */
public class Exercisi3 {
    
    public static void main(String[] args){
        int temperatura = 40;
        int edad = 40;
        int dosisParacetamol = 0;
        int kilos = 20;
        
        if (temperatura < 38){
            System.out.println("El paciente está bien");
            
        }else{
            if (temperatura < 39){
                System.out.println("Un baño ayudaría a bajar la temperatura");
                
            }else{
                if (edad < 3){
                    System.out.println(" Consulte al médico");
                    
                }else{
                    //indicamos la medicación necesaria
                    if (edad < 12){
                        dosisParacetamol = (15 * kilos);
                    }
                    if (edad >= 12){
                        dosisParacetamol = 500;
                    }
                    System.out.println("Es necesario administrar "+dosisParacetamol+"mg de paracetamol");
                    
                    if (temperatura >= 40){
                        System.out.println("Es necesario el ingreso en el hospital");
                    }
                }
            }
        }
    }
}
