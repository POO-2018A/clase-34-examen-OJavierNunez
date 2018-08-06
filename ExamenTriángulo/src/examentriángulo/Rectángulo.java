/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentriángulo;

/**
 *
 * @author ESFOT
 */
public class Rectángulo extends ClaseTriángulo implements InterfazMetodos {
    private double a;
    private double b;
    
    public Rectángulo(String nombre,double a, double b) {
        super(nombre);
        this.a=a;
        this.b=b;
    }

    @Override
    public double obtenerArea() {
        double area;
        area = (b*a)/2;
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        double c;
        double d;
        double h;
        //Calculo del Lado C
        d= Math.pow(a, 2)+Math.pow(b, 2);
        c = Math.sqrt(d);
        //Calculo de la altura
        h= ((Math.sqrt(3)*a)/2);
        perimetro= a+b+c*h;
        return perimetro;
    }
    
}
