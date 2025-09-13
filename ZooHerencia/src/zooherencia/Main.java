package zooherencia;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Collar collarRojo = new Collar("Rojo");
        Perro perro = new Perro("Rocky", collarRojo);
        Gato gato = new Gato("Misu");

        Consultorio consultorio = new Consultorio("Sala 1");
        Veterinaria vet = new Veterinaria(consultorio);

        // Veterinaria atiende
        vet.atender(perro);
        vet.atender(gato);

        // Uso de genéricos
        Caja<Animal> cajaAnimal = new Caja<>();
        cajaAnimal.guardar(gato);
        System.out.println("En la caja hay: " + cajaAnimal.obtener().nombre);

        // Casting
        Animal a = new Perro("Toby", new Collar("Azul"));
        if (a instanceof Perro) {
            Perro p = (Perro) a;
            p.moverCola(); // método propio de Perro
            System.out.println("El collar de " + p.nombre + " es " + p.getCollar().getColor());
        }
    }
}