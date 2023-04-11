package challenge_01;

import java.util.*;

public class Challenge_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();
        int option = -1;
        while (true){
            System.out.println("Select an option:");
            System.out.println("0) Exit program");
            System.out.println("1) Add Items(comma delimited list)");
            System.out.println("2) Remove items(comma delimited " +
                    "list)");
            option = scan.nextInt();

            if(option == 1){
                System.out.println("Enter items to add(comma " +
                        "delimited list): ");
                String addItems = scan.next();
                addList(groceryList, addItems);
            }else if(option == 2){
                System.out.println("Enter items to remove(comma " +
                        "delimited list): ");
                String addItems = scan.next();
                removeList(groceryList, addItems);
            }else{
                System.out.println("Exiting program...");
                System.exit(0);
            }

        }
    }

    public static void addList(ArrayList<String> groceryList,
                                            String items){
        String[] stringList= items.trim().split(
                ",");
        for(String item : stringList){
            String trimmed = item.trim();
            if(!groceryList.contains(item)){
                groceryList.add(trimmed);
            }
        }


        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
    }

    public static void removeList(ArrayList<String> groceryList,
                                  String items){
        String[] stringList = items.trim().split(
                ",");
        for(String item : stringList){
            String trimmed = item.trim();
            groceryList.remove(trimmed);
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
    }

}

