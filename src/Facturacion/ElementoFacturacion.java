/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import Impuestos.Gravamen;

/**
 *
 * @author Gianno
 */
public abstract class ElementoFacturacion {
    
    private Gravamen impuesto;
    public abstract  double getTotal();
}
