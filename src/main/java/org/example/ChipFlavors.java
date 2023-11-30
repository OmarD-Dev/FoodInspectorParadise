package org.example;

public enum ChipFlavors {
    LAYS(1,"Lays"),
    DORITOS(2,"Doritos"),
    CHEETOS(3,"Cheetos"),
    FUNYUNS(4, "Funyuns");

    private int flavor;
    private String name;
    ChipFlavors(int flavor, String name){
        this.flavor=flavor;
        this.name=name;
    }
    public int getInt()
    {
        return flavor;
    }
    public String getName(){
        return name;
    }


}
