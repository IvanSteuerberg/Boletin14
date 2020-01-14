package boletin14;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Boletin14 {

    public static void main(String[] args) {
 ConversorTemperaturas obx = new ConversorTemperaturas();
 obx.pedirDatos();
 try{
 System.out.println(obx.getGradosC()+"ºC son "+obx.centigradosAFahrenheit()+" F");
 }catch (TemperaturaErradaExcepcion ex){
 System.out.println("Erro. "+ex.getMessage());    
 }       
 try{
 obx.centigradosAReaumur();
 }catch (TemperaturaErradaExcepcion ex){
     System.out.println("Erro. "+ex.getMessage());    
 } 
    
    
    
}
    
}
