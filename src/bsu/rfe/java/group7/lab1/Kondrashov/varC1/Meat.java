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

    public void consume(){
        System.out.println(this + " съеден");
    }

    public int calculateCalories(){
        switch (animal){
            case "pig":  return 270;
            case "cow": return 300;
            case "dog": return 450;
            default:
                animal = "some animal";
                return 100;
        }
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(arg0 instanceof Meat){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString(){
        return super.toString();
    }
}
