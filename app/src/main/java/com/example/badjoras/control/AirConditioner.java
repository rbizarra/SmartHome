package com.example.badjoras.control;

import java.io.Serializable;

/**
 * Created by Rafael on 24/10/2014.
 */
public class AirConditioner extends Feature implements Serializable {

    public static final String HOT = "Quente";
    public static final String COLD = "Frio";

    String mode;
    int temperature;
    boolean isOn;

    public AirConditioner() {
        super();
        temperature = 20;
        mode = HOT;
        isOn=false;

    }

    public String getMode() {
        return mode;
    }

    public int getTemperature() {
        return temperature;
    }

    public void changeTemperature(int new_temp) {
        this.temperature = new_temp;
    }

    public void changeMode(String new_mode) {
        this.mode = new_mode;
    }

    public boolean getStatus(){return isOn;}

    public void setStatus(boolean status){this.isOn=status;}
}
