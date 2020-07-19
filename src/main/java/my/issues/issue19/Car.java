package issue19;

import java.util.Scanner;

public class Car{

private int registrationNumber;
private int engineNumber;
private String model;
private String color;
private int year;

   public Car (int newRegistrationNumber, int newEngineNumber, String newModel, String newColor, int newYear){
      registrationNumber = newRegistrationNumber;
      engineNumber = newEngineNumber;
      model = newModel;   
      color = newColor;
      year = newYear;    
   }//end Car
   
   public int getRegistrationNumber(){
      return registrationNumber;
   }//end getRegistrationNumber
   
   public int getEngineNumber(){
      return engineNumber;
   }//end getEngineNumber
   
    public String getModel(){
      return model;
   }//end getModel
   
    public String getColor(){
      return color;
   }//end getColor
   
    public int getYear(){
      return year;
   }//end getYear
    
}//end Car