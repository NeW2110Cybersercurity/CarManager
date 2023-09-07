/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;
    
    public void setColour(String Colour)
    {
        this.Colour = Colour;
    }
    public void setEnginePower(int EnginePower)
    {
        this.EnginePower = EnginePower;
    }
    public void setConvertible(boolean Convertible)
    {
        this.Convertible = Convertible;
    }
    public void setParkingBrake(boolean ParkingBrake)
    {
        this.ParkingBrake = ParkingBrake;
    }
    public String getColour()
    {
        return Colour;
    }
    public int getEnginePower()
    {
        return EnginePower;
    }
    public boolean getConvertible()
    {
        return Convertible;
    }
    public boolean getParkingBrake()
    {
        return ParkingBrake;
    }
    public Car()
    {
        this.Colour =  null;
        this.Convertible = false;
        this.ParkingBrake = false;
        this.EnginePower = 0;
    }
    public Car(String Colour,int EnginePower,boolean Convertible,boolean ParkingBrake)
    {
        this.Colour = Colour ;
        this.Convertible =Convertible;
        this.EnginePower = EnginePower;
        this.ParkingBrake = ParkingBrake;
    }
    public void pressStartButton() {
        System.out.println("Car engine started!");
    }

    public void pressAcceleratorButton() {
        System.out.println("Car accelerating...");
    }
    public void output() {
        // Method to output car information
        System.out.println("Car Details:");
        System.out.println("Colour: " + Colour);
        System.out.println("Engine Power: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("Parking Brake: " + ParkingBrake);
    }
}
