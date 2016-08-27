/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

/**
 *
 * @author Gianno
 */
public class Factura extends ElementoFactura {
    ConjuntoItem lineas;

    @Override
    public double getTotal() {
        
       return  lineas.getTotal();
    }
    
}
