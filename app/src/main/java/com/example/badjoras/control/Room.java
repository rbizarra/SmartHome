package com.example.badjoras.control;

import java.io.Serializable;
import java.util.HashMap;

import static com.example.badjoras.smarthome.MainActivity.*;

/**
 * Created by Rafael on 24/10/2014.
 */
public class Room implements Serializable {

    private HashMap<String, Feature> features;

    public Room(String room) {
        populateMap(room);
    }

    //TODO: refazer esta lista de features!!!
    //TODO: alterar todas os puts para receber a classe certa (remover Feature())!!!!
    private void populateMap(String room) {
        features = new HashMap<String, Feature>();

        if (room.equalsIgnoreCase(KITCHEN)) {
            features.put(PANTRY_STOCK, new PantryStock());
            features.put(AIR_CONDITIONER, new AirConditioner());
            features.put(LIGHTS, new Light());
            features.put(BLINDS, new Blinds());
            features.put(COFFEE_MACHINE, new CoffeeMachine());
            features.put(STOVE_OVEN, new StoveOven());
        }
        else if (room.equalsIgnoreCase(BEDROOM)) {
            features.put(AIR_CONDITIONER, new AirConditioner());
            features.put(LIGHTS, new Light());
            features.put(BLINDS, new Blinds());
        }
        else if (room.equalsIgnoreCase(LIVING_ROOM)) {
            features.put(AIR_CONDITIONER, new AirConditioner());
            features.put(LIGHTS, new Light());
            features.put(BLINDS, new Blinds());
        }
        else if (room.equalsIgnoreCase(OUTSIDE_GENERAL)) {
            features.put(ENTER_EXIT_HOUSE, new Feature());
            features.put(LIGHTS, new Light());
            features.put(WATER_CONSUMPTION, new Feature());
            features.put(POWER_CONSUMPTION, new Feature());
            features.put(GAS_CONSUMPTION, new Feature());
            features.put(SPRINKLER, new Feature());
            features.put(GARAGE_DOOR, new Feature());
//            features.put(SURVEILLANCE_CAMERAS, new Feature());
//            features.put(SCHEDULED_FUNCTIONS, new Feature());
        }
    }

    public HashMap getMap() {
        return this.features;
    }

    public void modifyMap(HashMap<String, Feature> new_map) {
        this.features = new_map;
    }
}