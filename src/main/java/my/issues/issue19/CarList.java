package issue19;

import java.util.Scanner;
public class CarList {
    
    Scanner input = new Scanner(System.in);
    
    //declaration of variables
    private Car [] car;
    private int count;
    private int num;
    private String ovw;
    
    //Declaration of array/contiguous list
    public CarList(int size)
    {
        car = new Car [size];
        count = 0;
        num = car.length;
    }
    
    //Addition of object into the list
    public void add(int registrationNumber, int engineNumber, String model, String color,int year, int pos)
    {
        if(isEmpty())
        {
            addData(registrationNumber, engineNumber, model, color, year, 0);
            count++;
            System.out.println("added to first");
        }    
        else 
            if(pos >= 0 && pos <= num -1)
            {
                if (car[pos] != null)
                {
                    System.out.println("This location is occupied! Shift the content"
                        + "? (y/n)");
                    ovw = input.next();
                    if(ovw.equalsIgnoreCase("y"))
                        {
                            for (int i = count; i > pos; i--)
                            {
                                car [i] = car [i - 1];
                            }
                            
                            addData(registrationNumber, engineNumber, model, color, year, pos);
                            count++;  
                        }
                    
                    else
                    {
                        System.out.println("Select another position");
                    }
                        
                }
                else 
                {
                    addData(registrationNumber, engineNumber, model, color, year, pos);
                    count++;
                }
            }
            else
                {
                    System.out.println("Error");
                }

    }
    
    //Deletion of object in the list
    public void delete(int target)
    { 
        if (isEmpty())
        {
            System.out.println("The list is EMPTY!");
        }
        
        else 
            if(target >= 0 && target <= num -1)
            {
                 for (int i = target; i+1 < count; i++)
                 {
                     car [i] = car [i + 1];
                 }
                 count--;
                 System.out.println( "DELETED" );
            }
            else
            {
                System.out.println("Error");
            }   
    }
    
    public void displayData()
    {
        for (int c = 0; c < count; c++){
            System.out.println("--------------------------------------");
		while (car[c] == null){
                c++;}
            System.out.println("Registration Number = " + car[c].getRegistrationNumber());
            System.out.println("Engine Number = " + car[c].getEngineNumber());
            System.out.println("Model = " + car[c].getModel());
            System.out.println("Color = " + car[c].getColor());
            System.out.println("Year = " + car[c].getYear());
            System.out.println("--------------------------------------\n");
        }
    }
    
    public boolean isEmpty( ) 
    {	
        if(count == 0)
            return true;
        else 
            return false;
        
    }
    
    public boolean isFull()
    {
        if (count == (car.length))
            return true;
        else 
            return false;
    }
    
   public void addData(int registrationNumber, int engineNumber, String model, String color,int year, int pos)        
        {
            Scanner input = new Scanner(System.in);
            
            System.out.println("\n-------------------------------");
            System.out.print("Please enter car Registration Number :");
            registrationNumber = input.nextInt();
            System.out.print("Please enter car Engine Number :");
            engineNumber = input.nextInt();
            System.out.print("Please enter car Model :");
            model = input.next()+input.nextLine();
            System.out.print("Please enter car Color :");
            color = input.next()+input.nextLine();
            System.out.print("Please enter car Year :");
            year = input.nextInt();
            car [pos] = new Car (registrationNumber, engineNumber, model, color, year);
            System.out.println("-------------------------------\n");
        }
   
   
   public int searchName (String target)
   {
       for (int i = 0; i < count; i++)
           if (car[i].getModel().equalsIgnoreCase(target))
               return i;
       return -1;
   } 
   
   public void displaySearch()
    {
        for (int c = 0; c < count; c++){
            System.out.println("--------------------------------------");
		while (car[c] == null){
                c++;}
            System.out.println("Code = " + car[c].getRegistrationNumber());
            System.out.println("Name = " + car[c].getEngineNumber());
            System.out.println("Quantity = " + car[c].getModel());
            System.out.println("Quantity = " + car[c].getColor());
            System.out.println("Quantity = " + car[c].getYear());
            System.out.println("--------------------------------------\n");
        }
    }

   
    
}