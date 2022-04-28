public class Main {
    public static void main (String[] args) {
        suma(10,20,30);

        Coche miAudi = new Coche();
        miAudi.AgregarPuerta();

        System.out.println(miAudi.puertas);
    }

    public static int suma (int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
        return resultado;
    }
}
    class Coche {
    public int puertas = 4;

    public void AgregarPuerta() {
        this.puertas++;
    }
}