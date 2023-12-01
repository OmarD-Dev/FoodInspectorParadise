package org.example;

public enum ChipFlavor {
    LAYS("Lays"),
    DORITOS("Doritos"),
    CHEETOS("Cheetos"),
    FUNYUNS( "Funyuns");

    private String name;
    ChipFlavor( String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


}
