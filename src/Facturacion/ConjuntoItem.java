/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import java.util.Vector;

/**
 *
 * @author Gianno
 */
public class ConjuntoItem  extends ElementoItem{
    Vector<Item> items;

    @Override
    public double getTotal() {
        double subTotal=0;
        for(int i =0;i < items.size();i++)
        {
         subTotal+=items.elementAt(i).getTotal();
        
        }
        return subTotal;
    }
    
}
