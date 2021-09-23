/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.Clases;

/**
 *
 * @author rjcha
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private String Cargo;

    public Persona(String n, String a, String c) {
        this.Nombre = n;
        this.Apellido = a;
        this.Cargo = c;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCargo() {
        return Cargo;
    }

}
