class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    // Constructor
    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método para imprimir la información de la persona
    public void imprimirInformacion() {
        System.out.println(nombre + " :");
        System.out.println("Calculando su IMC....");

        double imc = calcularIMC();
        System.out.println("Su índice de masa muscular es: " + imc);

        if (imc < 18.5) {
            System.out.println("Usted se encuentra bajo de peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Usted tiene un peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Usted tiene sobrepeso.");
        } else {
            System.out.println("Usted se encuentra con obesidad.");
        }

        System.out.println("Su edad es: " + edad);
        if (esMayorDeEdad()) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }

        System.out.println("Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]");
        System.out.println();
    }
}

public class TestPersona {
    public static void main(String[] args) {
        // Crear 5 instancias de la clase Persona
        Persona persona1 = new Persona("Juan Perez", 18, 200.0, 1.8);
        Persona persona2 = new Persona("Ana Gomez", 25, 65.0, 1.65);
        Persona persona3 = new Persona("Carlos Sanchez", 30, 80.0, 1.75);
        Persona persona4 = new Persona("Lucia Martinez", 16, 50.0, 1.60);
        Persona persona5 = new Persona("Mario Lopez", 40, 90.0, 1.85);

        // Imprimir la información de cada persona
        persona1.imprimirInformacion();
        persona2.imprimirInformacion();
        persona3.imprimirInformacion();
        persona4.imprimirInformacion();
        persona5.imprimirInformacion();
    }
}
