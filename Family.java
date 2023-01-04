import java.util.ArrayList;
import java.util.List;

public class Family {
    ArrayList<Human> family = new ArrayList<>();

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
}
