package com.example.matan.project1.entities;

/**
 * Created by matan on 14/11/2017.
 */

public class CarModel {

    public enum Gearbox{
        AUTOMATIC,
        MANUA
    }
    private String modelCode;
    public void setModelCode (String modelCode){this.modelCode = modelCode;}
    public String getModelCode (){return this.modelCode;}

    private String companyName;
    public void setCompanyName (String companyName){this.companyName = companyName;}
    public String getCompanyName (){return this.companyName;}

    private String modelName;
    public void setModelName (String modelName){this.modelName = modelCode;}
    public String getModelName (){return this.modelName;}

    private String engineCapacity;
    public void setEngineCapacity (String engineCapacity){this.engineCapacity = modelCode;}
    public String getEngineCapacity (){return this.engineCapacity;}

    private Gearbox gearbox;
    public void setGearbox (Gearbox gearbox){this.gearbox = gearbox;}
    public Gearbox getGearbox  (){return this.gearbox;}

    private int seats;
    public void setSeats (int seats){this.seats = seats;}
    public int getSeats (){return this.seats;}


}
