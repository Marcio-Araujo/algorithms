package com.mrk.algorithms.design_patterns.strategy;

import java.util.Observable;

public class ObservableData extends Observable {

    private String infoA;
    private String infoB;

    public ObservableData(){}

    public void eventUpdate(){
        setChanged();
        notifyObservers();
    }

    

}
