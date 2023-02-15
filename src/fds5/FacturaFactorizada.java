
package fds5;

import java.time.LocalDateTime;

public class FacturaFactorizada {
    private String codigo;
    private LocalDateTime fechaEmision;
    private double importeFactura;
    private double importeIVA;
    private double importeDeduccion;
    private double importeTotal;
    private double porcentajeDeduccion;

  
    private Deduccion deduccion;
    private IVA iva;
    
    public FacturaFactorizada(Deduccion deduccion, IVA iva){
        this.deduccion = deduccion;
        this.iva = iva;
    }
    
    public double calcularTotal(){
        deduccion.setPorcentajeDeduccion(porcentajeDeduccion);
        importeIVA = iva.calcularIVA(importeFactura);
        importeDeduccion = deduccion.calcularDeduccion(importeFactura);
        return importeFactura - importeDeduccion + importeIVA;
    }
  public void setPorcentajeDeduccion(double porcentajeDeduccion) {
        this.porcentajeDeduccion = porcentajeDeduccion;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setImporteFactura(double importeFactura) {
        this.importeFactura = importeFactura;
    }

    public void setImporteIVA(double importeIVA) {
        this.importeIVA = importeIVA;
    }

    public void setImporteDeduccion(double importeDeduccion) {
        this.importeDeduccion = importeDeduccion;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public void setDeduccion(Deduccion deduccion) {
        this.deduccion = deduccion;
    }
    public double getImporteIVA(){
        return importeIVA;
    }
    public double getImporteDeduccion(){
        return importeDeduccion;
    }
}
