public class program {
    public static void main(String[] args) {
        Human pers1 = new Man("Иван", "Иванов", "Петрович", 1977, 11, 3);
        System.out.println(pers1);
        Human pers2 =  new Female ("Анна", "Иванова", "Cергеевна", 1982, 3, 30);
        System.out.println(pers2);
        System.out.println(pers2.getBirthday());
        
        pers1.getMarried(pers2);
        System.out.println(pers1);
        
        
    }
}
