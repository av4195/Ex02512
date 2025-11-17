package com.example.ex02512;

import android.widget.TextView;

public class Motorcycle extends Vehicle{
    TextView tv;
    public Motorcycle(){

    }
    public void start(){
        tv.setText("Motorcycle started");
    }
    public void stop(){
        tv.setText("Motorcycle stopped");
    }
    public void accelerate(){
        System.out.print(" Motorcycle is accelerating");
    }
}
