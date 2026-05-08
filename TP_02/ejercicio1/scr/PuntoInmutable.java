package TP_02.ejercicio1.scr;

public final class PuntoInmutable {
 
    private final double x;
    private final double y;

    public dobule  PuntoInmutable(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "PuntoInmutable{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public PuntoInmutable trasladar(double dx, double dy) {
        return new PuntoInmutable(x + dx, y + dy);
    }
    public PuntoInmutable escalar(double factor){
        return new PuntoInmutable(x * factor, y * factor);
    }
    public PuntoInmutable reflejarEjeX(){
        return new PuntoInmutable(x, -y);
    }
    public PuntoInmutable reflejarEjeY(){
        return new PuntoInmutable(-x, y);
    }
    public double distanciaAlOrigen(){
        return java.lang.Math.sqrt(x*x + y*y);
    }
    public double distanciaA(PuntoInmutable otro){
        double dx = x - otro.x;
        double dy = y - otro.y;
        return java.lang.Math.sqrt(dx*dx + dy*dy);
    }
}
public class Main {
    public static void main(String[] args) {
        PuntoInmutable p1 = new PuntoInmutable(3.0, 4.0);
        System.out.println("Punto original: " + p1);

        PuntoInmutable p2 = p1.trasladar(1, -1);
        System.out.println("Punto trasladado: " + p2);

        PuntoInmutable p3 = p1.escalar(2);
        System.out.println("Punto escalado: " + p3);

        PuntoInmutable p4 = p1.reflejarEjeX();
        System.out.println("Punto reflejado en eje X: " + p4);

        PuntoInmutable p5 = p1.reflejarEjeY();
        System.out.println("Punto reflejado en eje Y: " + p5);

        double distanciaOrigen = p1.distanciaAlOrigen();
        System.out.println("Distancia al origen: " + distanciaOrigen);

        double distanciaEntrePuntos = p1.distanciaA(p2);
        System.out.println("Distancia entre p1 y p2: " + distanciaEntrePuntos);
    }
}
