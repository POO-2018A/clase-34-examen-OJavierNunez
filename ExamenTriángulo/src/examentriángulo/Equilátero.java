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
public class Equilátero extends ClaseTriángulo  implements InterfazMetodos {
    private double a;
    public Equilátero(String nombre, double a) {
        super(nombre);
        this.a=a;
    }

    @Override
    public double obtenerArea() {
        double area;
        area = ((Math.sqrt(3)*a)/2)*Math.pow(a, 2);
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        double h;
        h= ((Math.sqrt(3)*a)/2);
        perimetro= 3*a*h;
        return perimetro;
    }
    
}
