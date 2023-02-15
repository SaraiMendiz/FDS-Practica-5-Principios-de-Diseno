
package fds5;

public class IVAReducido implements IVA{
    private final double porcentaje = 0.08;
    
    @Override
    public double calcularIVA(double importe){
        return importe * porcentaje;
    }
}
