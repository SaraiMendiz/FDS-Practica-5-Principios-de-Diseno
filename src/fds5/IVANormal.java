/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fds5;

/**
 *
 * @author sarai
 */
public class IVANormal implements IVA{
    private final double porcentaje = 0.16;
    
   @Override
   public double calcularIVA(double importe){
        return importe * porcentaje;
    }
}
