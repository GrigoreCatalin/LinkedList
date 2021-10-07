import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Ex3 {

    public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
        LinkedList<Integer> result = new LinkedList<>();
        Integer t = 0;


        while (op1.size() > 0 && op2.size() > 0) {
            result.addLast((op1.getLast() + op2.getLast() + t) % 10);
            t = (op1.getLast() + op2.getLast() + t) / 10;
            op1.remove(op1.getLast());
            op2.remove(op2.getLast());
        }


        if (op1.size() > op2.size()) {
            while (op1.size() > 0) {
                result.addLast((op1.getLast() + t) % 10);
                t = (op1.getLast() + t) / 10;
                op1.remove(op1.getLast());
            }
            if (t != 0) {
                result.addLast(t);
            }
        } else {
            while (op2.size() > 0) {
                result.addLast((op2.getLast() + t) % 10);
                t = (op2.getLast() + t) / 10;
                op2.remove(op2.getLast());
            }
            if (t != 0) {
                result.addLast(t);
            }
        }


        return result;

    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            Integer item = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, item);
        }
        return list;
    }


    public static void main(String[] args) {
        LinkedList<Integer> firstList = new LinkedList<>();
        firstList.add(9);
        firstList.add(9);
        firstList.add(1);


        LinkedList<Integer> secondList = new LinkedList<>();
        secondList.add(1);
        secondList.add(9);
        secondList.add(6);

        LinkedList<Integer> result = new LinkedList<>();

        result = sum(firstList, secondList);
        reverseLinkedList(result);
        System.out.println(result);
    }
}
