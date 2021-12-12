package bsu.rfe.java.group7.lab1.Kondrashov.varC1;

public class Meat extends Food {
    public String animal="";

    public Meat(){
        super("мяско");
    }

    public Meat(String animal){
        super(animal + "-мяско");
        this.animal = animal;
    }


}
