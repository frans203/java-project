package challenge_02;

import java.util.LinkedList;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }

}

public class LinkedList_Challenge {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);

        System.out.println(placesToVisit);


    }

    private static void addPlace(LinkedList<Place> list, Place place){
      for(Place p : list){
          if(p.name().equalsIgnoreCase(place.name())){
              System.out.println("Found duplicate: " + place);
               return;
          }
      }

        list.add(place);
    }

    public static void removePlace(LinkedList<Place> list,
                                   Place place){
        if(list.contains(place)){
            list.remove(place);
        }else{
            System.out.println("Not found item: " + place);
            return;
        }
    }

}

