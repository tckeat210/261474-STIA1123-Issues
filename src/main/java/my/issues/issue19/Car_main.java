package issue19;

import java.util.Scanner;
public class Car_main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int choice;
        int adding;
        int deleting;
        int registrationNumber = 0;
        int engineNumber = 0;
        String model = null;
        String color = null;
        int year = 0;
        int pos = 0;
        int delCode;
        String delName;
        String searchName;
        
        
        System.out.print("\n            Car list"
                         + "\nMaximum car in store is 3");

        CarList car = new CarList (3);
        
        do
           {
               System.out.println("\n\n=================");
               System.out.println("\n1. Add new item"
                   + "\n2. Delete existing item"
                   + "\n3. Display all item"
                   + "\n4. Edit an item"
                   + "\n5. Search for an item"
                   + "\n0. Exit");
               System.out.print("Action : ");
               choice = scan.nextInt();
               System.out.println("=================");
               System.out.println("\n");
           
           
           if (choice == 1)
           {
                if(car.isFull())
               {
                   System.out.println("Error! the list is full!");
               }//close if member.isFull
                else
                { 
                   System.out.println("=================");
                   System.out.print("1. First"
                       + "\n2. Last"
                       + "\n3. Custom"
                       + "\nPlease choose to add : ");
                   adding = scan.nextInt();
                   System.out.println("=================");
                   
                   switch (adding){
                       case(1) :
                       {
                           car.add(registrationNumber, engineNumber, model, color, year, 0);
                           break;
                       }
                       case(2) :
                       {
                           car.add(registrationNumber, engineNumber, model, color, year, (3 - 1));
                           break;
                       }
                       case(3) :
                       {
                           System.out.print("Which position you wish to add? : ");
                           pos = scan.nextInt();
                           car.add(registrationNumber, engineNumber, model, color, year, pos-1);
                           break;
                       }
                   }//close switch adding
               }//end else
           }//close if choice = 1
           
           if (choice == 2)
           {
               System.out.println("=================");
               System.out.print(" Delete with item name"
                       + "\nDo you really wan to delete? (1 for yes/2 for No) : ");
               int option;
               option = scan.nextInt();
               switch (option)
                  {
                     case (1):
                     {
                        int target;
                          
                        System.out.print("Please key in item name to delete: ");
                        delName = scan.next()+ scan.nextLine();
                        target = car.searchName(delName);
                           if (target == -1)
                           {
                              System.out.println("Record not found");
                           break;
                           }
                           else
                           {
                             System.out.println("\n=================");
                             car.delete(target);
                             break;
                           }
                     }
                     case (2):
                     {
                           System.out.println("\nNothing to delete.");
                           break;
                     }               
                  }
           }//close if choice = 2

           
           if (choice == 3)
           {
               if(car.isEmpty())
                   System.out.println("Nothing to display in the list");
               else
                   car.displayData();
           }//end if choice = 3
           
           if (choice == 4)
           {
           System.out.println("=================");
               System.out.print(" Search with item name to edit"
                       + "\nDo you really wan to Edit? (1 for yes/2 for No) : ");
               int select;
               select = scan.nextInt();
               switch (select)
               {
                     case (1):
                     {
                       System.out.println("=================");
                           System.out.print(" Do you wan edit the item with with name?(Y/N) :");
                           String option;
                           option = scan.next()+ scan.nextLine();
                           if (option != null)
                              {
                                 int aim;
                                   
                                 System.out.print("Please key in item name to search: ");
                                 searchName = scan.next()+ scan.nextLine();
                                 aim = car.searchName(searchName);
                                    if (aim == -1)
                                    {
                                       System.out.println("Record not found");
                                    break;
                                    }
                                    else
                                    {
                                    System.out.println("\n=================");
                                      car.delete(aim);
                                      
                                      System.out.print("Please enter the new data.");
                                      car.add(registrationNumber, engineNumber, model, color, year, (100 - 1));
                                      break;
                                    }               
                              }
                     }
                     case (2):
                     {
                           System.out.println("\nNothing to delete.");
                           break;
                     } 
               }      
           if (choice == 0)
              System.exit(0);
           }//end if choice = 4
           
           if (choice == 5)
           {
           System.out.println("=================");
               System.out.print(" Search with item name"
                       + "\nDo you really wan to search? (1 for yes/2 for No) : ");
               int select;
               select = scan.nextInt();
               switch (select)
               {
                     case (1):
                     {
                       System.out.println("=================");
                           System.out.print(" Do you wan search the item with with name?(Y/N) :");
                           String option;
                           option = scan.next()+ scan.nextLine();
                           if (option != null)
                              {
                                 int aim;
                                   
                                 System.out.print("Please key in item name to search: ");
                                 searchName = scan.next()+ scan.nextLine();
                                 aim = car.searchName(searchName);
                                    if (aim == -1)
                                    {
                                       System.out.println("Record not found");
                                    break;
                                    }               
                              }
                     }
                     case (2):
                     {
                           System.out.print("Item existed.");
                           break;
                     } 
               }      
           if (choice == 0)
              System.exit(0);    
           }//end if choice = 5
           
           
        }//close do
        
        while( choice != 0); 
}
}