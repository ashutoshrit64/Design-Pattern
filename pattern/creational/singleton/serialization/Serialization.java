package com.bridgelabz.pattern;

public class Serialization {

    private static final long serialVersionUID = -7604766932017737115L;

    private Serialization(){}
    
    private static class SingletonHelper{
        private static final Serialization instance = new Serialization();
    }
    
    public static Serialization getInstance(){
        return SingletonHelper.instance;
    }
    
}
