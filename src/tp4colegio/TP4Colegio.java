/*
Se pide:
En el método main de
una clase de nombre Colegio:
1. Crear las materias:
-a. Ingles I de primer año.
-b. Matemáticas de primer año.
-c. Laboratorio 1 de primer año

2. Crear 2 alumnos.
-a. López Martin con legajo 1001.
-b. Martínez Brenda con legajo 1002.

3. Inscribir a López en las 3 materias.

4. Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.

5. Visualizar la cantidad de materias a las que está inscripto cada alumno.
 */
package tp4colegio;

/**
 *
 * @author Ranma
 */
public class TP4Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear las materias:
        Materia inglesI = new Materia(001, "Inglés I", 1);
        Materia matematicas = new Materia(002, "Matemáticas", 1);
        Materia laboratorio1 = new Materia(003, "Laboratorio 1", 1);

        // 2. Crear 2 alumnos.
        Alumno lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(1002, "Martinez", "Brenda");

        // 3. Inscribir a López en las 3 materias.
        lopez.agregarMateria(inglesI);
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(laboratorio1);

        // 4.
        martinez.agregarMateria(inglesI);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(laboratorio1);
        martinez.agregarMateria(laboratorio1);  
        // MEMO modificar metodo agregarmaterias en alumno para evitar que se
        // se anote masd e una vez a la misma mateia

        // 5. Visualizar la cantidad de materias a las que está inscripto cada alumno.
        System.out.println("El alumno " + lopez.getApellido() + " " + lopez.getNombre() + " está inscripto en " + lopez.cantidadMaterias() + " materias.");
        System.out.println("El alumno " + martinez.getApellido() + " " + martinez.getNombre() + " está inscripto en " + martinez.cantidadMaterias() + " materias.");
    }
}