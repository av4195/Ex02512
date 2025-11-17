package com.example.ex02512;

import android.widget.TextView;

public class Bicycle extends Vehicle{
    public Bicycle(){

    }
    public void start(){
        System.out.print("Bicycle started");
    }
    public void stop(){
        System.out.print("Bicycle stopped");
    }
    public void accelerate(){
        System.out.print("Bicycle is accelerating");
    }

}
