public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        int numeroIf = -3;

        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }
        //Ejercicio 2
        int numeroWhile = 1; // Inicializamos la variable en 0

        while (numeroWhile < 4) { // La condición del bucle while
            System.out.println("El valor de numeroWhile es: " + numeroWhile); // Mostramos el valor actual de numeroWhile
            numeroWhile++; // Incrementamos el valor de numeroWhile en 1 en cada iteración
        }
        //Ejercicio 3
        int numeroDoWhile = 0;

        do {System.out.println("El valor de numeroDoWhile es: " + numeroDoWhile);
            numeroDoWhile++;

        } while (numeroDoWhile < 1); // Condición del bucle do-while

        //Ejercicio 4

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1){
            System.out.println(numeroFor);

        } String estacion = "VERANO"; // Variable que nos brinda la estacion del año

        switch (estacion) {
            case "INVIERNO":
                System.out.println("Es invierno.");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera.");
                break;
            case "VERANO":
                System.out.println("Es verano.");
                break;
            case "OTOÑO":
                System.out.println("Es otoño.");
                break;
            default:
                System.out.println("El valor de la variable no corresponde a una estación.");
                break;
        }
    }
}