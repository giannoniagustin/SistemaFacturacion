/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import Productos.Producto;

/**
 *
 * @author Gianno
 */
public class Item extends ElementoItem{
    int cantidad;
    Producto producto;

    @Override
    public double getTotal() {
       return cantidad*producto.getPrecio();
    }
    
}
