package bsu.rfe.java.group7.lab1.Kondrashov.varC1;

import java.lang.reflect.*;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Food[] breakfast = new Food[20];

        boolean sort_flag = false;
        boolean calories_flag = false;

        int count_breakfast = 0;
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] partsOfArguments = arg.split("/");
            if (partsOfArguments[0].equals("-sort")) {
                sort_flag = true;
                continue;
            }
            if (partsOfArguments[0].equals("-calories")) {
                calories_flag = true;
                continue;
            }

            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Meat")) {
                breakfast[itemsSoFar] = new Meat(parts[1]);
                //System.out.println(parts[1]);
            } else if (parts[0].equals("Sandwich")) {
                breakfast[itemsSoFar] = new Sandwich(parts[1], parts[2]);
            }
            itemsSoFar++;
            try {
                Class myClass = Class.forName("bsu.rfe.java.group7.lab1." + partsOfArguments[0]);

                if (partsOfArguments.length == 1) {

                    Constructor constructor = myClass.getConstructor();
                    breakfast[count_breakfast] = (Food) constructor.newInstance();
                } else if (partsOfArguments.length == 2) {

                    Constructor constructor = myClass.getConstructor(String.class);
                    breakfast[count_breakfast] = (Food) constructor.newInstance(partsOfArguments[1]);
                }
                if (partsOfArguments.length == 3) {

                    Constructor constructor = myClass.getConstructor(String.class, String.class);
                    breakfast[count_breakfast] = (Food) constructor.newInstance(partsOfArguments[1], partsOfArguments[2]);
                }
            } catch (ClassNotFoundException e) {
                System.out.println("(" + count_breakfast + ")This product can't be eaten");
                continue;
            } catch (NoSuchMethodException e) {
                System.out.println("There are no some method");
                continue;
            } catch (InstantiationException e) {
                continue;
            }

            breakfast[count_breakfast].consume();
            count_breakfast += 1;
        }

        if (sort_flag) {
            Arrays.sort(breakfast, new Comparator() {
                public int compare(Object f1, Object f2) {
                    if (f1 == null) return 1;
                    if (f2 == null) return -1;
                    if (((Food) f1).calculateCalories() == ((Food) f2).calculateCalories()) return 0;
                    if (((Food) f1).calculateCalories() > ((Food) f2).calculateCalories()) return -1;
                    return 1;
                }
            });
        }


    }
}
