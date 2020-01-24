/**
 *
 * @author ALEXIS404
 */
public class Main {

    public static void main (String [] args){


        System.out.println("METODO TABLAS");
        System.out.println("");
        Tabla_Multiplicar tabla = new Tabla_Multiplicar();
        System.out.println(  tabla.tabla);

        System.out.println("");
        System.out.println("");

        System.out.println("METODO APLICA A BECA");
        Estudiante est = new Estudiante();
        System.out.println(est.aplica_a_beca());
        System.out.println(est.numeroCarrera());

        System.out.println("METODO PROMEDIO DE NOTAS");
        System.out.println("");
        System.out.println("");

        Notas nota = new Notas();
        System.out.println(nota.getpromedio());

        System.out.println("METODO OPERACIONES ARITMETICAS");
        System.out.println("");
        System.out.println("");

        Operaciones_Aritmeticas a = new Operaciones_Aritmeticas();
        System.out.println(a.Operaciones_Aritmeticas());



    }
}