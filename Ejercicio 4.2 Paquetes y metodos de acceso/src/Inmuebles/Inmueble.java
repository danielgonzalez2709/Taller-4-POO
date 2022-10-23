package Inmuebles;

public class Inmueble {
    protected int identificadorInmobiliario;
    protected int área; // Atributo que identifica el área de un inmueble
    protected String dirección;
    protected double precioVenta;
    Inmueble(int identificadorInmobiliario, int área, String dirección) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.área = área;
        this.dirección = dirección;
    }

    double calcularPrecioVenta(double valorArea) {
        precioVenta = área * valorArea;
        return precioVenta;
    }

    void imprimir() {
        System.out.println("Identificador inmobiliario = " +
                identificadorInmobiliario);
        System.out.println("Area = " + área);
        System.out.println("Dirección = " + dirección);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}







