/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresax2;

import java.util.ArrayList;

/**
 *
 * @author alexg
 */
public class Empleado {
    // atributos
    private String Nombre;
    private String Apellidos;
    private long Salario;
    //metodo constructor 
    

    public Empleado(String Nombre, String Apellidos) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Salario = 0;
    }
    //3 metodos de acceso a get y set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public long getSalario() {
        return Salario;
    }

    public void setSalario(long Salario) {
        this.Salario = Salario;
    }
    
public long Calcularsalario(double PriceHours, int Hours){
            this.Salario = (long)(PriceHours*Hours);
        return this.Salario;
}
public void CalcularPromedio (ArrayList<Empleado> lista){
    double PromedioSalario = 0;
    for (Empleado e:lista){
        PromedioSalario= PromedioSalario+e.Salario;
        System.out.println(e);
    }
    System.out.println("******************");
    System.out.println("Promedio de slario: "+PromedioSalario/lista.size());
}
//Metodo to Strin
    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Salario=" + Salario + '}';
    }
    }
    

