package model;

public class Docente extends Persona{
    @Override
    public boolean registrarAsistencia(String codIdentificador, String fechaAsistencia, String horaAsistencia, Boolean valorAsistencia) {
        System.out.println("Aplicar logica  para la asistencia del docente");
        return true;
    }
}
