
package fds5;

public class DeduccionNormal implements Deduccion{
    private double porcentajeDeduccion;
    @Override
    public void setPorcentajeDeduccion(double porcentaje){
        this.porcentajeDeduccion = porcentaje;
    }
    @Override
    public double calcularDeduccion(double importe){
        return (importe * porcentajeDeduccion) / 100;
    }
}
