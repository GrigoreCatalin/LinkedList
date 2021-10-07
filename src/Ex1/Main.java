package Ex1;

public class Main {
    public static void main(String[] args) {

        TownList<Town> orderedTownsList = new TownList<Town>();

        Town town1 = new Town("Timisoara", 100);
        Town town2 = new Town("Arad", 150);
        Town town3 = new Town("Bucuresti", 0);
        Town town4 = new Town("Ploiesti", 30);
        Town town5 = new Town("Bucuresti", 21);
        Town town6 = new Town("Zalau", 150);
        Town town7 = new Town("Piatra-Neamt", 300);
        Town town8 = new Town("Brasov", 30);

        orderedTownsList.addInOrderedList(town1);
        orderedTownsList.addInOrderedList(town2);
        orderedTownsList.addInOrderedList(town3);
        orderedTownsList.addInOrderedList(town4);
        orderedTownsList.addInOrderedList(town5); // same name and different distance -> return false
        orderedTownsList.addInOrderedList(town6);
        orderedTownsList.addInOrderedList(town7);
        orderedTownsList.addInOrderedList(town8);
        orderedTownsList.addInOrderedList(town1); // same object -> return false


        System.out.println(orderedTownsList);




    }
}
