package course.bootcamp;
/*
 * @author luis mateo nieto vargas
 */
import java.util.Scanner;
public class Bootcamp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //if, else if, else
        double numeroIf;
        System.out.print("\nDigite un numero a evaluar\n==>");
        numeroIf =sc.nextDouble();
        if(numeroIf >0){
            System.out.println(numeroIf+" es positivo ya que es mayor a 0. ");
        }else if(numeroIf ==0){
            System.out.println(numeroIf+" es igual a 0");
        }else{
            System.out.println(numeroIf+" es negativo ya que es menor a 0");
        }
        //-------------------------------
        //While and Do While
        
        int numeroWhile=0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        
        System.out.println("Do While.");
        int numeroDoWhile =3;
        do {            
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroWhile < 3);
        
        //For
        for (int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println(numeroFor);
        }
        
        //Switch
        String estacion = "primavera";
        switch (estacion) {
            case "primavera":
                System.out.println("Estacion de Primavera.");
                break;
                
            case "verano":
                System.out.println("Estacion de Verano.");
                break;
            case "otoño":
                System.out.println("Estacion de Otoño.");
                break;
            case "invierno":
                System.out.println("Estacion de Invierno.");
                break;
            default:
                System.out.println("No digito una estación");
        }
    }
    
}
