// 1. Crea una clase Persona con las siguientes variables: La edad, el nombre, el telefono.
//
// 2. Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase.
//
// 3. Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono,
// el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//
// 4. Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y
// con una variable salario que solo tenga la clase Trabajador.

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(23);
        cliente.setNombre("Juan");
        cliente.setTelefono(312312);
        cliente.setCredito(312123);

        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        trabajador.setEdad(21);
        trabajador.setNombre("Lucho");
        trabajador.setTelefono(23123);
        trabajador.setSalario(1235);

        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

 class Persona {
     int edad;
     String nombre;
     int telefono;

 }

class Cliente extends Persona {
     private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

}

class Trabajador extends Persona {
    private int salario;
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}