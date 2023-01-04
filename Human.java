import java.time.LocalDate;
import java.time.Period;

/**
 * Это класс Человек
 */
public abstract class Human implements Child {
    private static int count;
    private int id=0;
    String surname;
    String name;
    String patronimico;
    int birthYear;
    int birthMonth;
    int birthDay;
    int age;
    int spouse;
    int father;
    int mother;


    static {
        Human.count = 0;
    }



    /**
     * Это конструктор
     * 
     * @param name        имя
     * @param surname     Фамилия
     * @param patronimico отчество
     * @param birthYear   год рождения
     * @param birthMonth  месяц рождения
     * @param birthDay    дата рождения
     */


    public Human(String name, String surname, String patronimico, int birthYear, int birthMonth,
            int birthDay) {
        this.surname = surname;
        this.name = name;
        this.patronimico = patronimico;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.age = setAge(birthYear, birthMonth, birthDay);
        this.id =++Human.count;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human() {
    }

    public int setAge(int birthYear, int birthMonth, int birthDay) {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }



    public String getBirthday() {
        return "День рождения " + name + ' ' + surname + ": " + birthDay + '.' + birthMonth + '.' + birthYear;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void surname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(int birthDay, int birthMonth, int birthYear) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.age = setAge(birthYear, birthMonth, birthDay);
    }

    public void getMarried(Human spouse) {
        this.spouse = spouse.id;
    }

     public void setMother(int mother) {
     this.mother = mother;
     }

     public void setFather(int father) {
     this.father = father;
     }

////    @Override
//    public String getParents() {
//        return String.format("Мать: %s\n" +
//                "Отец: %s", searchById(mother), searchById(father));
//    }
//
////    public String searchById(int id){
//    if (id == this.id){
//            return "id: " + id + ", " + name + ' ' + patronimico + ' ' + surname + ", " + age + " лет";
//        }
//        else {
//            return "не найдено";
//        }
//    }

    public int getId() {
        return id;
    }

    public String getMatrimonialStatus() {
        if (spouse == 0) {
            return "свободен";
        } else {
            return "в браке";
        }
    }

    @Override
    public String toString() {
        return "id: " + id + ", " + name + ' ' + patronimico + ' ' + surname + ", " + age + " лет" + ", "
                + getMatrimonialStatus();
    }
}