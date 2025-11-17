package com.example.ex02512;

import android.widget.TextView;

public class Car extends Vehicle{
    TextView tv;
    public Car(){

    }
    public void start(){
        tv.setText("Car started");
    }
    public void stop(){
        tv.setText("Car stopped");
    }
    public void accelerate(){

    }
}
