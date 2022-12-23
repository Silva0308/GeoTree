public class Man extends Human {
    int wife;
    private GenderType sex;

    public Man(String name, String surname, String patronimico, int birthYear, int birthMonth, int birthDay) {
        super(name, surname, patronimico, birthYear, birthMonth, birthDay);
        this.sex = GenderType.male;
    }

    public Man(String name, String surname) {
        super(name, surname);
        this.sex = GenderType.male;
    }

    public Man() {
        this.sex = GenderType.male;
    }

    public String toString() {
        return super.toString() + ", мужчина";
    }

    public void getMarried(Human wife) {
        super.getMarried(wife);
    }
}
