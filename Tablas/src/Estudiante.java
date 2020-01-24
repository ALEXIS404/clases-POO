import java.util.Scanner;

public class Estudiante<Opciones> {
    Scanner est = new Scanner(System.in);
    String nombre, apellido, carrera, carnet;
    String aplica = "Aplica a una beca";
    int edad, hermanos;
    int Opciones = 4;
    String Carreras;
    float salario;

    public int aplica_a_beca() {
        System.out.println("Ingresa tu Nombre: ");
        nombre = est.next();
        System.out.println("Ingresa tu Apellido: ");
        apellido = est.next();
        System.out.println("Ingresa tu edad: ");
        edad = est.nextInt();
        System.out.println("Nº Carnet");
        carnet = est.next();
        System.out.println("Cuantos hermanos tienes: ");
        hermanos = est.nextInt();
        System.out.println("Cual es tu ingreso economico: ");
        salario = est.nextFloat();

        if (hermanos <= 3 && salario <= 100 && edad >= 15 && edad <= 30) {
            aplica = "Aplica a una beca";
        } else {
            aplica = "No aplica";
        }


        return 0;
    }

  public String numeroCarrera() {
      System.out.println("ingresa el numero de la carrera: ");
      Opciones = Integer.parseInt(est.next());

      switch (Opciones){
          case 1: Carreras =  "Ing de Sistemas";
              break;

          case 2: Carreras =  "ing Electronica";
              break;

          case 3: Carreras =  "Lic en Ingles";
              break;

          case 4: Carreras =  "Ingenieria Civil";
              break;
      }
      System.out.println(Carreras);
      return null;
  }
}

