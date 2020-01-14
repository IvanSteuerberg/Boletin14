package boletin14;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class ConversorTemperaturas {
private final int TEMPMIN = 80;
private float gradosC;

public float getGradosC() {
    return gradosC;
}

public void pedirDatos(){
Scanner sc = new Scanner(System.in);
System.out.println("Introduce a temperatura(en graos centigrados)");
gradosC= sc.nextFloat();
}

public float centigradosAFahrenheit() throws TemperaturaErradaExcepcion {
if (gradosC<TEMPMIN){
throw new TemperaturaErradaExcepcion("Non pode traballar con temperaturas menores a "+TEMPMIN+"ºC");    
}
float gradosF = 9.0f / 5.0f * gradosC + 32.4f;
return gradosF;   
}

public void centigradosAReaumur() throws TemperaturaErradaExcepcion{
if (gradosC<TEMPMIN){
throw new TemperaturaErradaExcepcion("Non pode traballar con temperaturas menores a "+TEMPMIN+"ºC");
}
float gradosR=gradosC * 4.0f/5.0f;
System.out.println(gradosC+"ºC son "+gradosR+"º Reaumur");
    
}







}
