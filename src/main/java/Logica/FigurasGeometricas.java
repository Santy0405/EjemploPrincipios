/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author 57320
 */
public class FigurasGeometricas {
    
    protected int valor;
    protected int valor2;
    protected double area;
    protected double perimetro;
   

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
      public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
     public void calcularArea(){};
     public void calcularPerimetro(){};
    
}
