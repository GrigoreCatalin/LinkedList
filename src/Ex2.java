import java.util.*;
import java.util.Iterator;

public class Ex2 {

     // Exercitiul 2_1 -> 2 metode

    public static void removeDuplicates(LinkedList<Integer> list) {
        ListIterator <Integer> it = list.listIterator();
        Integer secondValue = 0;

        while (it.hasNext()){
            Integer firstValue = it.next();

            if (it.hasNext()){
                secondValue = it.next();

            if (firstValue.equals(secondValue)){
                it.remove();
            }
            it.previous();
            }
        }
    }


    //Metoda are complexitate O(n^2)
    public static LinkedList<Integer> removeDuplicatesOne(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();

        for (Integer item : list) {  // O(n)
            if (!newList.contains(item)) {  //O(n) -> O(n^2)
                newList.add(item);
            }
        }
        return newList;
    }

    public static void removeDuplicatesTwo(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
            }
        }
    }

    // Exercitiul 2_2
    public static LinkedList<Integer> removeDuplicatesThree(LinkedList<Integer> list) {
        LinkedList<Integer> newList = removeDuplicatesOne(list);
        LinkedList<Integer> resultList = removeDuplicatesOne(list);


        for (Integer item : newList){
            int counter = 0;
            for (Integer it : list){
                if (it.equals(item)){
                    counter++;
                } else{
                   continue;
                }
            }
            if (counter > 1){
                resultList.remove(item); //-> O(n^2)?
            }
        }
        return resultList;
    }

    public static void removeDuplicatesFour(LinkedList<Integer> list) {
        ListIterator <Integer> it = list.listIterator();
        Integer firstValue = 0;

        while (it.hasNext()){
            firstValue = it.next();

            if (it.hasNext()){
                Integer secondValue = it.next();

                if (firstValue.equals(secondValue)){
                    it.previous();
                    it.previous();
                    it.remove();
                    secondValue = it.next();
                    it.previous();
                    while (it.hasNext() && secondValue.equals(it.next())){
                        it.remove();
                    }
                }
                   it.previous();

            }
        }



    }

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(9);
        numbers.add(9);
        numbers.add(10);


        // Exercitiul 2_1
//        removeDuplicatesOne(numbers);
//        System.out.println(numbers);

//        removeDuplicatesTwo(numbers);
//        System.out.println(numbers);

           removeDuplicates(numbers);
           System.out.println(numbers);

        // Exercitiul 2_2
//        numbers = removeDuplicatesThree(numbers);
//        System.out.println(numbers);

//        removeDuplicatesFour(numbers);
//        System.out.println(numbers);
    }
}