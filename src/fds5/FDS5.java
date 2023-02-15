
package fds5;

import java.util.Scanner;

public class FDS5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IVA iva = null;
        Deduccion deduccion = null;
        int opcion1, opcion2;
        
        System.out.println("=================================================================================================");
        System.out.println("                      Factura con IVA Normal y Deducción Normal");
        System.out.println("=================================================================================================");     
        FacturaFactorizada factura1 = new FacturaFactorizada(new DeduccionNormal(), new IVANormal());
        System.out.println("Introduzca importe de la factura: ");
        factura1.setImporteFactura(sc.nextDouble());
        System.out.println("Introduzaca porcentaje de la Deducción Normal: ");
        factura1.setPorcentajeDeduccion(sc.nextDouble());
        System.out.println("Importe total de la factura: "+factura1.calcularTotal());
        System.out.println("Importe del IVA Normal: "+factura1.getImporteIVA()+"\nImporte de la Deducción Normal: "+factura1.getImporteDeduccion());
        System.out.println("=================================================================================================");
        System.out.println("                      Factura con IVA Reducido y Deducción Bonificada");
        System.out.println("=================================================================================================");
        FacturaFactorizada factura2 = new FacturaFactorizada(new DeduccionBonificada(), new IVAReducido());
        System.out.println("Introduzca importe de la factura: ");
        factura2.setImporteFactura(sc.nextDouble());
        System.out.println("Introduzaca porcentaje de la Deducción Bonificada: ");
        factura2.setPorcentajeDeduccion(sc.nextDouble());
        System.out.println("Importe total de la factura: "+factura2.calcularTotal());
        System.out.println("Importe del IVA Reducida: "+factura2.getImporteIVA()+"\nImporte de la Deducción Bonificada: "+factura2.getImporteDeduccion());
        System.out.println("=================================================================================================");
        System.out.println("                      Factura con IVA y Deducción por selección");
        System.out.println("=================================================================================================");
        do{
            System.out.println("¿Qué tipo de IVA quiere aplicar?");
            System.out.println("0º- Salir");
            System.out.println("1º- IVA Normal");
            System.out.println("2º- IVA Reducido");
            opcion1 = sc.nextInt();
            System.out.println("¿Qué tipo de Deducción quiere aplicar?");
            System.out.println("0º- Salir");
            System.out.println("1º- Deducción Normal");
            System.out.println("2º- Deducción Bonificada");
            opcion2 = sc.nextInt();
            switch (opcion1){
                case 0: break;
                case 1: iva = new IVANormal();
                    break;
                case 2: iva = new IVAReducido();
                    break;
                default: System.out.println("Número introducido incorrecto");
            }
            switch(opcion2){
                case 0: break;
                case 1: deduccion = new DeduccionNormal();
                    break;
                case 2: deduccion = new DeduccionBonificada();
                    break;
                default: System.out.println("Número introducido incorrecto");
            }
            if(opcion1 != 0 && opcion2 != 0){
                FacturaFactorizada factura3 = new FacturaFactorizada(deduccion,iva);
                System.out.println("Introduzca importe de la factura: ");
                factura3.setImporteFactura(sc.nextDouble());
                System.out.println("Importe total de la factura: "+factura3.calcularTotal());
                System.out.println("Importe del IVA Reducida: "+factura3.getImporteIVA()+"\nImporte de la Deducción Bonificada: "+factura3.getImporteDeduccion());
                System.out.println("=================================================================================================");
            }
        }while(opcion1 != 0 && opcion2 != 0);
        
    }
    
}
