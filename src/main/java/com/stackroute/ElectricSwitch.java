package com.stackroute;

public class ElectricSwitch {

    ElectricBulb b;

    ElectricSwitch(){
        this.b=new ElectricBulb();
}

void turnedOn()
{
    b.setTurnedOn(true);
    System.out.println("Bulb is on");
}

void turnedOff()
{
    b.setTurnedOn(false);
        System.out.println("Bulb is off");
    }
}
