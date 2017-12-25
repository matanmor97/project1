package com.example.matan.project1.entities;

/**
 * Created by matan on 14/11/2017.
 */

public class Car {
    private int branchNUmber;
    public void setBranchNUmber (int branchNUmber){this.branchNUmber = branchNUmber;}
    public int getBranchNUmber  (){return this.branchNUmber;}

    private CarModel carModel;
    public void setCarModel (CarModel carModel){this.carModel = carModel;}
    public CarModel getCarModel (){return this.carModel;}


    private int kilometers;
    public void setKilometers (int kilometers){this.kilometers = kilometers;}
    public int getKilometers (){return this.kilometers;}

    private int carNumber;
    public void setCarNumber (int carNumber){this.carNumber = carNumber;}
    public int getCarNumber (){return this.carNumber;}


}
