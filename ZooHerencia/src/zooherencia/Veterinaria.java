package zooherencia;

public class Veterinaria {
    private Consultorio consultorio;

    public Veterinaria(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void atender(Animal a) {
        System.out.println("Atendiendo a " + a.nombre + " en consultorio " + consultorio.getUbicacion());
        a.sonido();
    }
}