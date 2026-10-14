package javaHardware;

import java.util.ArrayList;
import java.util.Scanner;

public class hardware1 {

    String name;
     double usagePercentage;
     boolean isRunning;


    hardware1(String name,double usagePercentage,boolean isRunning){
        this.name=name;
        this.usagePercentage=usagePercentage;
        this.isRunning=isRunning;
    }


    public void displayDetails(){
        System.out.println("\nDevice= " + name);
        System.out.println("usagePercentage = " + usagePercentage + "%");
        System.out.println("isRunning = "
                + (isRunning? "Running":"stopped"));

        if (usagePercentage >=95){
            System.out.println("CRITICAL CONDITION");
        } else if (usagePercentage >80) {
            System.out.println("WARNING high usage");
            
        }
    }

    public void updateUsage(double newUsage){
        if(!isRunning){
            System.out.println("suddenly the usage has stopped"); return;
        }

        if(newUsage <0 || newUsage>100){
            System.out.println("percentage cannot be above or below its maxima");
            return;
        }

        usagePercentage = newUsage;
        System.out.println("the print is successfully updated");

    }

    public void HardwareRunning(){
        isRunning=true;
        System.out.println(name+" is now running");
    }

    public void HardwareStopped(){
        isRunning=false;
        System.out.println(name+" is now stopped");
    }

    public String getName() {
        return name;
    }
}

class main{
   public static void main(String[] args){
Scanner input = new Scanner(System.in);

       ArrayList<hardware1> devices =new ArrayList<hardware1>();
       devices.add(new hardware1("Hardware1",100.0,true));
       devices.add(new hardware1("Hardware2",15.0,false));
       devices.add(new hardware1("Hardware3",67.0,true));

       int choices;

       do{
           System.out.println("\n HARDWARE DETAILS");
           System.out.println("========================");
           System.out.println("1. Display all hardware");
           System.out.println("2. Update hardware usage");
           System.out.println("3. Start hardware");
           System.out.println("4. Stop hardware");
           System.out.println("5. Exit");
           System.out.print("Enter your choice: ");

           choices = input.nextInt();


           if(choices==1){
               for(hardware1 device : devices){
                   device.displayDetails();
               }
           } else if (choices>=2 && choices<=4) {
               for(int i=0;i<devices.size();i++){
                   System.out.println((i+1)+"."+devices.get(i).name);
               }
               System.out.println("enter device number");
               int deviceNumber = input.nextInt();

               if(deviceNumber<1 ||deviceNumber>devices.size()){
                   System.out.println("Invalid input");continue;
               }
               hardware1 selected =  devices.get(deviceNumber -1);

               if(choices==2){
                   System.out.println("Enter usage percentage");
                   double usage= input.nextDouble();
                   selected.updateUsage(usage);
               }else if(choices==3){
                   selected.HardwareRunning();
               }else{
                   selected.HardwareStopped();
               }
               
           }else if(choices!=5){
               System.out.println("Invalid input");

           }
       }while (choices!=5);

       System.out.println("Hardware management system closed.");
       input.close();
   }
}
