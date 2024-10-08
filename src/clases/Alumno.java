/*
Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista HashSet de
materias en las que está inscripto; para ello tiene un método agregarMateria que permite
inscribir al Alumno en una materia determinada (implementar de manera tal que no deje
inscribir un alumno en dos materias iguales.) y otro método cantidadMaterias que devuelve la
cantidad de materias a las que está inscripto el alumno.

 */
package clases;

/**
 *
 * @author Ranma
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Alumno {
    //Atributos
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    //Constructor
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    // Getters y Setters
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     //Metodo agregarMateria
    public boolean agregarMateria(Materia materia) {
        boolean aux;
          if (materias.contains(materia)) {
            aux=false;
        } else {
            materias.add(materia);
            aux=true;
        }
          return aux;
    }
     //Metodo cantidadMaterias
    public int cantidadMaterias() {
        return materias.size();
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }
    
//Metodos hashCode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.legajo == other.legajo;
    }

     //Metodo toString
    
    @Override
    public String toString() {
        return " " + apellido + ", " + nombre + " ";
    }

 
}