import java.util.Scanner;

public class Notas {
    Scanner a = new Scanner(System.in);
    int nota1, nota2, nota3, promedio, suma;

    public int getpromedio() {
        System.out.println("Ingrese la primera nota:");
        nota1 = a.nextInt();
        System.out.println("Ingrese la segunda nota:");
        nota2 = a.nextInt();
        System.out.println("Ingrese la tercera nota:");
        nota3 = a.nextInt();
        suma = (nota1 + nota2 + nota3);
        promedio = (suma / 3);
        if (promedio >= 75) {
            System.out.println("Estudiante Aprobado");
        } else {
            System.out.println("Estudiante reprobado");
        }
            return promedio;
        }


    }