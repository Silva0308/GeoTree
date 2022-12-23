public class Female extends Human {
    int husband;
    private GenderType sex;

    public Female(String name, String surname, String patronimico, int birthYear, int birthMonth, int birthDay) {
        super(name, surname, patronimico, birthYear, birthMonth, birthDay);
        this.sex = GenderType.female;
    }

    public Female(String name, String surname) {
        super(name, surname);
        this.sex = GenderType.female;
    }

    public Female() {
        this.sex = GenderType.female;
    }
    public String toString() {
        return super.toString() + ", женщина";
    }

    public void getMarried(Human husband) {
        super.getMarried(husband);
    }

}
