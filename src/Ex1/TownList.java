package Ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

    public class TownList<T extends Comparable<T>> {

        private List<T> elements = new LinkedList<>();

        public boolean addInOrderedList(T newElement) {
            ListIterator<T> li = elements.listIterator();

            while (li.hasNext()) {
                T currentTown = li.next();
                int comparison = currentTown.compareTo(newElement);

                if (currentTown.equals(newElement)){
                    return false;
                  } else if (comparison >= 0) {
                    li.previous();
                    li.add(newElement);
                    return true;
                }
            }
            li.add(newElement);
            return true;
        }


        @Override
        public String toString() {
            String ret = "";
            for(T el : elements) {
                ret += el.toString();
            }
            return ret;
        }

    }

