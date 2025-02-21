import model.Alumno;
import model.Curso;

public class Main {
    public static void main(String[] args) {

        Curso objCurso = new Curso();
        objCurso.setIdcurso(1);
        System.out.println(objCurso.getCredcursos());

        Curso objCurso2 = new Curso(2);
        System.out.println(objCurso2.getIdcurso());

        Alumno objAlumno = new Alumno();
        objAlumno.setNombre("Luis");
        objAlumno.setApellido("Salvat");
        objAlumno.setDni("45265743");
        objAlumno.setEdad(32);
        objAlumno.setId(1);

    }
}