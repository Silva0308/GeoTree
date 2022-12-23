import java.time.LocalDate;
import java.time.Period;

/**
 * Это класс Человек
 */
public class Human {
    protected static int id;
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
        id = 0;
    }

    /**
     * Это конструктор
     * 
     * @param name        имя
     * @param surname     Фамилия
     * @param patronimico отчество
     * @param sex         пол выбираем из перечисленного
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
        this.age = getAge(birthYear, birthMonth, birthDay);
        ++id;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human() {
    }

    public int getAge(int birthYear, int birthMonth, int birthDay) {
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
        this.age = getAge(birthYear, birthMonth, birthDay);
    }

    public void getMarried(Human spouse) {
        this.spouse = Human.id;
    }

    public void setMother(int mother) {
        this.mother = mother;
    }

    public void SetFather(int father) {
        this.father = father;
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