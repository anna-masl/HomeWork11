package app;

public class SolutionHomeWork11 {
    public static void main(String[] args) {

        Person john = new Person("John",30,"Інженер");
        Person mary = new Person("Mary",25,"Вчитель");
        Person bob = new Person("Bob",35,"Лікар");


        System.out.println("1. " + john);
        System.out.println("   "+ mary);
        System.out.println("   "+ bob);
        System.out.println(" ");
        System.out.println(" ");

        Person alice = new Person("Alice",28, "Архітектор");
        System.out.println("2. " + alice);
        System.out.println("   (Після оновлення професії)");
        alice.changeprofession("Дизайнер");
        System.out.println("   "+ alice);



    }
}
