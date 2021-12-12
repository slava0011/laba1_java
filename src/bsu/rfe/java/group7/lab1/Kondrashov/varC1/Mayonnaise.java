package bsu.rfe.java.group7.lab1.Kondrashov.varC1;

public class Mayonnaise extends Food {
    public Mayonnaise(){
        super("мазик");
    }

    public void consume(){
        System.out.println(this + " съедено");
    }

    public int calculateCalories(){
        return 100;
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(arg0 instanceof Mayonnaise){
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
