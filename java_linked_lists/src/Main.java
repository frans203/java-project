import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
        public String toString(){
            return String.format("%d %s in %s", count,
                    name.toUpperCase(), type);
    }

}

public class Main {
    public static void main(String[] args) {
//        GroceryItem[] groceryArray = new GroceryItem[3];
//        groceryArray[0] = new GroceryItem("milk");
//        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
//        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
//        System.out.println(Arrays.toString(groceryArray));
//
//        ArrayList objectList = new ArrayList(); //resizable array
//        objectList.add(new GroceryItem("Butter"));
//        objectList.add("Yogurt");
//
//        ArrayList<GroceryItem> groceryList =
//                new ArrayList<>();
//
//        groceryList.add(new GroceryItem("Butter"));
//        groceryList.add(new GroceryItem("milk"));
//        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
//        groceryList.set(0, new GroceryItem("apples", "PRODUCE", 6));
//        groceryList.remove(1);
//        System.out.println(groceryList);

        String[] originalArray = new String[]{"First", "Second",
                "Third"};
        List<String> originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//       originalList.remove(0);
//        originalList.add("fourth");
        //both last code line returns a exception because the lists
        //points to an array and arrays arent resizable

        List<String> newList = Arrays.asList("Sunday", "Monday",
                "Tuesday"); //mutable but NOT resizeable
        System.out.println(newList);
        newList.set(0, "test");
        System.out.println(newList);

        List<String> newList02 = List.of("Sunday", "Monday",
                "Tuesday"); //imutable and NOT resizeable
        System.out.println(newList02);
//        newList02.set(0, "32");
        System.out.println(newList02);


    }
}