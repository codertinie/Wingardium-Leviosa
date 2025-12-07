import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        //Add elements
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");

        System.out.println("----Printing Current Array ------");
        System.out.println(animals);

        animals.clear();
        System.out.println("----printing cleared Array----");
        System.out.println(animals);

        if (animals.isEmpty()){
            System.out.println("Array is empty");
        }else{
            System.out.println("Array is NOT empty");
        }

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");

        System.out.println(animals.size());
        animals.remove(2);
        System.out.println(animals);
    }
}
