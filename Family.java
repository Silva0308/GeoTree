import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    private ArrayList<Human> family = new ArrayList<>();

    public Family() {

    }

    @Override
    public String toString() {
        return "Cемья: " +
                family
                ;
    }

    public void add(Human pers) {
        family.add(pers);
    }

    private Human findPerson(int id) {
        for (Human human : family) {
            if (human.getId() == id)
                return human;
        }
        throw new IllegalStateException("Такого человека в семье нет");
    }

    public String findParents(Human pers) {
        Human mother = findPerson(pers.getMother());
        Human father = findPerson(pers.getFather());
        return String.format("%s %s\nМать - %s\nОтец - %s", pers.getName(), pers.getSurname(), mother.toString(), father.toString());
    }

    public String findSpouse(Human pers) {
        Human spouse = findPerson(pers.getSpouse());
        return String.format("%s %s\nв браке с: %s", pers.getName(), pers.getSurname(), spouse.toString());
    }
}


