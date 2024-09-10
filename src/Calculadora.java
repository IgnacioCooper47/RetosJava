import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a la Calculadora de Java!");
        Scanner consola = new Scanner(System.in);
        while (true){
            try{
                mostrarMenu();
                var operacion = Integer.parseInt(consola.nextLine());
                if (operacion >= 1 && operacion <= 4){
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Saliendo...");
                    break;
                } else {
                    System.out.println("Opcion incorrecta" + operacion);
                }
                System.out.println();
            }
            catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }//fin try
        }//fin while
    }//fin main

    private static void mostrarMenu(){
        System.out.println("""
               *** Calculadora ***
               1- Suma
               2- Resta
               3- Multiplicacion
               4- Division
               5- Salir
               """);
        System.out.println("¿Que operación deseas realizar?: ");
    }//fin mostrar menu

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("Ingrese el primer numero: ");
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        switch (operacion){
            case 1:
                System.out.println("El resultado de la suma es: ");
                System.out.println(operando1 + operando2);
            break;

            case 2:
                System.out.println("El resultado de la resta es: ");
                System.out.println(operando1 - operando2);
            break;

            case 3:
                System.out.println("El resultado de la multiplicacion es: ");
                System.out.println(operando1 * operando2);
            break;

            case 4:
                System.out.println("El resultado de la division es: ");
                System.out.println(operando1 / operando2);
            break;

            default:
                System.out.println("Opcion no valida");
            break;
        }
    }

} //fin clase calculadora...
