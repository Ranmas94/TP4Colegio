/*
La Materia tiene un idMateria, un nombre de la materia y año al que pertenece,
tiene además un constructor que inicializa sus propiedades y métodos get y set para
cada uno de sus atributos.
 */
package tp4colegio;

/**
 *
 * @author Ranma
 */

public class Materia {
    private int idMateria;
    private String nombre;
    private int año;

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
