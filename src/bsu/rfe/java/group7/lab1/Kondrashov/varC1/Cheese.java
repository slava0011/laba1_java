package bsu.rfe.java.group7.lab1.Kondrashov.varC1;

public class Cheese extends Food{
    public Cheese(){
        super("сыр");
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    public int calculateCalories(){
        return 150;
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(arg0 instanceof Cheese){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        return super.toString();
    }
}
