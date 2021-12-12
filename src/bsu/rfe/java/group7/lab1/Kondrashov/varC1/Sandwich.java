package bsu.rfe.java.group7.lab1.Kondrashov.varC1;

public class Sandwich extends Food {
    public String ingredient1;
    public String ingredient2;

    public Sandwich(){
        super("сэндвич");
        ingredient1 = null;
        ingredient2 = null;
    }

    public Sandwich(String f1, String f2){
        super("сэндвич");
        ingredient1 = f1;
        ingredient2 = f2;
    }

    public Sandwich(String f1) {
        super("сэндвич");
        ingredient1 = f1;
        ingredient2 = null;
    }

    public void consume(){
        System.out.println(this + " съеден");
    }

    public int calculateCalories(){
        int calories = 100;
        if(ingredient1.equals("мяско")) {
            calories += 270;
        }
        else if(ingredient1.equals("мазик")) {
            calories += 100;
        }
        else if(ingredient1.equals("сыр")) {
            calories += 150;
        }
        else calories += 100;
        if(ingredient2 != null){
            if(ingredient2.equals("мяско")) {
                calories += 270;
            }
            else if(ingredient1.equals("мазик")) {
                calories += 100;
            }
            else if(ingredient1.equals("сыр")) {
                calories += 150;
            }
            else calories += 100;
        }
        return calories;
    }

    public boolean equals(Object arg0) {
        if(!super.equals(arg0)) return false;
        if(!(arg0 instanceof Sandwich)) return false;
        return (ingredient1.equals(((Sandwich)arg0).ingredient1) && (ingredient2.equals(((Sandwich)arg0).ingredient2)));
    }

    public String toString() {
        String text = super.toString();
        if(ingredient1 != null){ text += " с " + ingredient1 + "ом";}
        if(ingredient2 != null){ text += " и " + ingredient2 + "ом";}
        return text;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}
