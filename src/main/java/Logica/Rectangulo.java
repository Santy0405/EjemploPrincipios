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
public class Rectangulo extends FigurasGeometricas{
    
    @Override
    public void calcularArea(){
        this.area = valor*valor2;
    }
    
    @Override
    public void calcularPerimetro(){
        this.perimetro = valor*2+valor2*2;
    }
}
