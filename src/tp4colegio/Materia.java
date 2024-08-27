/*
La Materia tiene un idMateria, un nombre de la materia y año al que pertenece,
tiene además un constructor que inicializa sus propiedades y métodos get y set para
cada uno de sus atributos.
 */
package tp4colegio;

import java.util.Objects;

/**
 *
 * @author Ranma
 */

public class Materia {
    private int idMateria;
    private String nombre;
    private int año;
//equal hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idMateria;
        hash = 23 * hash + Objects.hashCode(this.nombre);
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
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    //Constuctor
    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }

    // Getters y Setters
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAnio(int año) {
        this.año = año;
    }


}
