/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import Clientes.Cliente;
import java.util.Vector;

/**
 *
 * @author Gianno
 */
public class ConjuntoFactura extends ElementoFactura{
    Vector<Factura> facturas;

    @Override
    public double getTotal() {
        double subTotal=0;
        
        for (int i=0;i < facturas.size();i++){
        
        subTotal+=facturas.elementAt(i).getTotal();
        }
        return subTotal;
    }
    
}
