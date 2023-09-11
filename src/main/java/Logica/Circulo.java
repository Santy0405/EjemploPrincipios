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
public class Circulo extends FigurasGeometricas{
    
    @Override
    public void calcularArea(){
        double diametro = valor*2;
        this.area = Math.pow(valor,2) * Math.PI;
    }
    
    @Override
    public void calcularPerimetro(){
        this.perimetro = 2*Math.PI*valor;
    }
}
