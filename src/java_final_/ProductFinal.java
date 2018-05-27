/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_final_;

/**
 *
 * @author Anubhav
 */
public class ProductFinal {
    private int id;
    private String name;
    private int quantity;
    private String type;
    private byte[] picture;
    public ProductFinal(int pid, String pname, int pquantity, String ptype,byte[] pimg)
    {
        this.id=pid;
        this.name=pname;
        this.quantity=pquantity;
        this.type=ptype;
        this.picture=pimg;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getType(){
        return type;
    }
    public byte[] getImage(){
        return picture;
    }
}
