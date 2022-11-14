package Setmana5;

/**Marcos Fernandez Correa*/



/**
 *
 * @author ruben
 */
public class Exercisi2 {
    
    public static final float TOTAL_ENTREGAS = 15F;
    public static void main (String[] args){
        
        //Inicializamos variables
        float notaPrueba = 7F;
        float numeroEntregas = 10F;
        float notaEntregas = 4F;
        float notaFinal;
        float notaPracticas = 4F;
        
        boolean noSeguidaAC = false;
        
        //Calculo de notas
        if(notaPrueba < 7){
            System.out.println("No puede participar en la prueba final");
        }else if (numeroEntregas < ((TOTAL_ENTREGAS/100)*70)){
            System.out.println("Está suspendido por no haber seguido la Evaluación continua");
            noSeguidaAC = true;
        }else if (numeroEntregas < (TOTAL_ENTREGAS/100)){
            notaEntregas = 10;
        }else if (numeroEntregas < ((TOTAL_ENTREGAS/100)*90)){
            notaEntregas = 8;
        }else if (numeroEntregas < ((TOTAL_ENTREGAS/100)*80)){
            notaEntregas = 6;
        }else if (numeroEntregas < ((TOTAL_ENTREGAS/100)*70)){
            notaEntregas = 4;
        }
        
        notaFinal = ((notaPrueba*20)/100)+((notaEntregas*10)/100)+((notaPracticas*70)/100);
        
        //Calculo de la nota final
        if (notaFinal >= 5){
            System.out.println("Su nota final es: "+notaFinal);
        }else if (notaFinal < 5){
            if (noSeguidaAC == true){
                System.out.println("Su nota final es: "+notaFinal+". Es necesario seguir la Evaluación Continua");
            }else{
                System.out.println(" Su nota final es: "+notaFinal+" Tiene que hacer los ejercicios para la PAF2");
            }
        }
    }
}
