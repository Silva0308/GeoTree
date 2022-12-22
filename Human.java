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
    GenderType sex;
    int birthYear;
    int birthMonth;
    int birthDay;
    int age;

    static {
        id = 0;
    }
/**
 * Это конструктор
 * @param name  имя
 * @param surname Фамилия 
 * @param patronimico отчество
 * @param sex пол выбираем из перечисленного
 * @param birthYear год рождения
 * @param birthMonth месяц рождения
 * @param birthDay дата рождения 
 */
public Human(String name, String surname, String patronimico, GenderType sex, int birthYear, int birthMonth, int birthDay)
{
    this.surname = surname;
    this.name = name;
    this.patronimico = patronimico;
    this.sex = sex;
    this.birthYear = birthYear;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
    this.age = getAge(birthYear, birthMonth, birthDay);
    ++id;
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

public GenderType getSex() {
    return sex;
}

@Override
public String toString() {
    return  "id: " + id + ", " + name + ' ' +  patronimico + ' '+ surname + ", " + age + " лет" + ", " + sex;
}
}