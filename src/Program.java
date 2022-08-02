public class Program {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan Perez");
        cliente1.setEdad(45);
        cliente1.setTelefono("95863789");
        cliente1.setCredito(55000);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Luis Ponce");
        trabajador1.setEdad(40);
        trabajador1.setTelefono("97823654");
        trabajador1.setSalario(4500);

        System.out.println("El cliente " + cliente1.getNombre() + " con " + cliente1.getEdad() + " años de edad, con telefono " + cliente1.getTelefono() + ", tiene un credito de " + cliente1.getCredito() +" dolares");

        System.out.println("El trabajador " + trabajador1.getNombre() + " con " + trabajador1.getEdad() + " años de edad, con telefono " + trabajador1.getTelefono() + ", tiene un salario mensual de " + trabajador1.getSalario()+" dolares");
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
