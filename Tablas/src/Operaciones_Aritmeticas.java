import java.util.Scanner;

public class Operaciones_Aritmeticas {
    int num1, num2, suma, resta, multiplicacion, division, seleccionar;
    Scanner a = new Scanner(System.in);

    public int Operaciones_Aritmeticas() {
        System.out.println("Ingresa el primer valor: ");
        num1 = a.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        num2 = a.nextInt();
        System.out.println("Si desea sumar presiona 1 \npara restar 2 \n" + "si desea multiplicar preciona 3 \npara dividir preciona 4");
        seleccionar = a.nextInt();
        if (seleccionar == 1) {
            System.out.println("El valor obtenido de la suma es: " + " = " + (num1 + num2));
        } else if (seleccionar == 2) {
            System.out.println("El valor obtenido de la resta es: " + " = " + (num1 - num2));
        } else if (seleccionar == 3) {
            System.out.println("La multiplicacion de ambos numeros es= " + (num1 * num2));
        } else if (seleccionar == 4) {
            division = num1 / num2;
            System.out.println("La division entre ambos numeros es= " + division);
        } else { //se mostrara un mensaje por pantalla cuando seleccione un numero diferente a los que tiene por defecto
            System.out.println("no se ha seleccionado ninguna operacion valida ");

        }

return  0;

    }
}




