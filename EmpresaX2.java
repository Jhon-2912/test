
package empresax2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaX2 {
//continuasion y mejora del tranajo Empresa X
  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
  short Continuar;
  Continuar =0;
  String name;
  String lastname;
  double PriceHours;
  int Hours;
  Empleado empleado;
  //declaracion de lista tipo empleado
  ArrayList<Empleado> listEmpleado = new ArrayList<>();
        do{
            System.out.println("Dame tu nombre");
            name = read.next();
            System.out.println("dame el apellido");
            lastname = read.next();
            System.out.println("dame el valor de la hora ");
            PriceHours = read.nextDouble();
            System.out.println("dame la cantidad de horas");
            Hours = read.nextInt();
            empleado = new Empleado(name,lastname);
            empleado.Calcularsalario(PriceHours, Hours);
            System.out.println(empleado);
            listEmpleado.add(empleado);
            System.out.println("Desea agragar otro empleado coloque 0 sino otro numero");
            Continuar = read.nextShort();
  }  
  while(Continuar = 0);
        //una ves ingresados todos los datos nesesarios se deve calcular el salario
    empleado.CalcularPromedio(listEmpleado);
    }
    
    
}
