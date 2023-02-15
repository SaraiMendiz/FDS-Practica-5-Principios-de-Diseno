
package fds5;

public class DeduccionBonificada implements Deduccion{
    private double porcentajeDeduccion;
    
    @Override
    public void setPorcentajeDeduccion(double porcentaje){
        this.porcentajeDeduccion = porcentaje * 2;
    }
    @Override
    public double calcularDeduccion(double importe){
        return (importe * porcentajeDeduccion) / 100;
    }
    
}
