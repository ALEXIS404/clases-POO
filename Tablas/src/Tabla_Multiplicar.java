import java.util.Scanner;


public class Tabla_Multiplicar {
    Scanner tbla  = new Scanner(System.in);
    int tabla;
    int r=1;

    public  Tabla_Multiplicar(){
        System.out.println("ingrese el numero de la tabla a multiplicar: ");

        tabla=tbla.nextInt();

        for (int i=1; i<=10;i++){
            r=tabla*i;
            System.out.println(tabla + " x " + i + " = " + r);

        }

    }
}







