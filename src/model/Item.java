/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Leonardo
 */
public class Item {
    
   private String itemBox;

    public String getItem() {
        return itemBox;
    }

    public void setItem(String item) {
        this.itemBox = itemBox;
    }

    @Override
    public String toString() {
        return "Item{" + "item=" + itemBox + '}';
    }
   
   
}
