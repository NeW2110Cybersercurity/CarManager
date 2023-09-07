/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;

/**
 *
 * @author Admin
 */
public class Guitar {
    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar(String serialNumber, double price, String builder, String model, String backWood, String topWood) 
        {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    public Guitar()
    {
        this.serialNumber = null;
        this.price = 0;
        this.builder = null;
        this.model = null;
        this.backWood = null;
        this.topWood = null;
    }
    public void setserialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }
    public void setPrice(double Price)
    {
        this.price = price;
    }
    public void setBuilder(String builder)
    {
        this.builder = builder;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setbackWood(String backWood)
    {
        this.backWood = backWood;
    }
    public void settopWood(String topWood)
    {
        this.topWood = topWood;
    }
    public  String getserialNumber()
    {
        return serialNumber;
    }
    public double getPrice()
    {
        return price;
    }
    public String getBuilder()
    {
        return builder;
    }
    public String getModel()
    {
        return model;
    }
    public String backWood()
    {
        return backWood;
    }
    public String topWood()
    {
        return topWood;
    }
    public void createSound() {
        System.out.println("Creating a melodious sound...");
    }
    
}
