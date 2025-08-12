
/**
 *
 * @author Faber Rodriguez, Maycol Arevalo, Daniel Montaño
 */
package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora{
    static double valorActual = 0;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            
            System.out.println("=== Calculadora ===");
            System.out.print("Ingrese el valor inicial: ");
            valorActual = sc.nextDouble();
            
            do {
                mostrarMenu();
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> suma(sc);
                    case 2 -> resta(sc);
                    case 3 -> multiplicacion(sc);
                    case 4 -> division(sc);
                    case 5 -> trigonometria(sc, "sen");
                    case 6 -> trigonometria(sc, "cos");
                    case 7 -> trigonometria(sc, "tan");
                    case 8 -> raizEnesima(sc);
                    case 9 -> potenciaEnesima(sc);
                    case 10 -> factorial();
                    case 11 -> fibonacci(sc);
                    case 12 -> mcm(sc);
                    case 13 -> mcd(sc);
                    case 14 -> calcularIVA(sc);
                    case 15 -> reiniciar(sc);
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opcion invalida.");
                }
                if (opcion >= 1 && opcion <= 14)
                    System.out.println("Resultado actual: " + valorActual + "\n");
            } while (opcion != 0);
        }
    }

    static  void mostrarMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Seno");
        System.out.println("6. Coseno");
        System.out.println("7. Tangente");
        System.out.println("8. Raiz enesima");
        System.out.println("9. Potencia enesima");
        System.out.println("10. Factorial");
        System.out.println("11. Fibonacci (n-esimo)");
        System.out.println("12. Minimo Comun Multiplo");
        System.out.println("13. Maximo Comun Divisor");
        System.out.println("14. Calcular IVA");
        System.out.println("15. Reiniciar valor");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    static void suma(Scanner sc) {
        System.out.print("Ingrese numero a sumar: ");
        valorActual += sc.nextDouble();
    }

    static void resta(Scanner sc) {
        System.out.print("Ingrese numero a restar: ");
        valorActual -= sc.nextDouble();
    }

    static void multiplicacion(Scanner sc) {
        System.out.print("Ingrese numero a multiplicar: ");
        valorActual *= sc.nextDouble();
    }

    static void division(Scanner sc) {
        System.out.print("Ingrese divisor: ");
        double divisor = sc.nextDouble();
        if (divisor == 0) {
            System.out.println(" Error: Division por cero no permitida.");
            return;
        }
        valorActual /= divisor;
    }

    static void trigonometria(Scanner sc, String tipo) {
        double rad = Math.toRadians(valorActual);
        valorActual = switch (tipo) {
            case "sen" -> Math.sin(rad);
            case "cos" -> Math.cos(rad);
            case "tan" -> {
                if (Math.cos(rad) == 0) {
                    System.out.println(" Error: tangente indefinida.");
                    yield valorActual;
                } else yield Math.tan(rad);
            }
            default -> valorActual;
        };
    }

    static void raizEnesima(Scanner sc) {
        System.out.print("Ingrese el indice de la raiz: ");
        double indice = sc.nextDouble();
        if (indice == 0) {
            System.out.println(" Error: indice no puede ser 0.");
            return;
        }
        if (valorActual < 0 && indice % 2 == 0) {
            System.out.println(" Error: resultado imaginario para raices pares de negativos.");
            return;
        }
        valorActual = Math.pow(valorActual, 1.0 / indice);
    }

    static void potenciaEnesima(Scanner sc) {
        System.out.print("Ingrese el exponente: ");
        double exponente = sc.nextDouble();
        valorActual = Math.pow(valorActual, exponente);
    }

    static void factorial() {
        if (valorActual < 0 || valorActual != Math.floor(valorActual)) {
            System.out.println(" Error: el factorial solo se aplica a enteros no negativos.");
            return;
        }
        long resultado = 1;
        for (int i = 2; i <= (int) valorActual; i++) {
            resultado *= i;
        }
        valorActual = resultado;
    }

    static void fibonacci(Scanner sc) {
        System.out.print("Ingrese el numero n: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println(" Error: el numero debe ser no negativo.");
            return;
        }
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        valorActual = a;
    }

    static void mcd(Scanner sc) {
        System.out.print("Ingrese otro numero entero: ");
        int otro = sc.nextInt();
        int a = (int) valorActual, b = otro;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        valorActual = a;
    }

    static void mcm(Scanner sc) {
        System.out.print("Ingrese otro numero entero: ");
        int otro = sc.nextInt();
        int a = (int) valorActual, b = otro;
        int mcd = a;
        int n = b;
        while (n != 0) {
            int temp = n;
            n = mcd % n;
            mcd = temp;
        }
        int mcm = Math.abs(a * b) / mcd;
        valorActual = mcm;
    }

    static void calcularIVA(Scanner sc) {
        System.out.print("Ingrese el porcentaje de IVA: ");
        double porcentaje = sc.nextDouble();
        double iva = valorActual * porcentaje / 100;
        System.out.println("IVA: " + iva);
        valorActual += iva;
    }

    static void reiniciar(Scanner sc) {
        System.out.print("Ingrese el nuevo valor inicial: ");
        valorActual = sc.nextDouble();
    }
}