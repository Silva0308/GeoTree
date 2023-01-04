import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        Man pers1 = new Man("Иван", "Иванов", "Петрович", 1977, 11, 3);
        System.out.println(pers1);
        Human pers2 = new Female("Анна", "Иванова", "Cергеевна", 1982, 3, 30);
        System.out.println(pers2);
        Human pers3 = new Man("Андрей", "Иванов", "Иванович", 2012, 12, 20);
        System.out.println(pers3);
        Human pers4 = new Female("Мария", "Иванова", "Ивановна", 2007, 12, 05);
        System.out.println(pers4);


        Family ivanov = new Family();
        ivanov.add(pers1);
        ivanov.add(pers2);
        pers1.getMarried(pers2);
        pers2.getMarried(pers1);
        ivanov.add(pers3);
        ivanov.add(pers4);
//        System.out.println(ivanov);
        pers3.setFather(1);
        pers3.setMother(2);
        pers4.setMother(2);
        pers4.setFather(1);
        Female pers5 = new Female("Мария", "Петрова", "Сергеевна", 1984,8,03);
        Man pers6 = new Man("Aнтон","Петров","Петрович", 1985,11,7);
        pers6.getMarried(pers5);
        pers5.getMarried(pers6);
        System.out.println(pers5);
        System.out.println(pers6);
        Family petrov = new Family();
        petrov.add(pers5);
        petrov.add(pers6);

        System.out.println(ivanov.findParents(pers3));
        System.out.println(pers6.getSpouse());
        System.out.println(petrov.findSpouse(pers6));




    }
}
