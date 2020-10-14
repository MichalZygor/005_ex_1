public class Bar {
    public static void main(String[] args) {
        Person person1 = new Person("Tomasz", "Banaś", 19);
        Drink drink1 = new Drink("Blue Mary", 45.44, true);
        Barman barman = new Barman();
        barman.order(person1, drink1);

        Person person2 = new Person("Walker", "Bieniasz", 16);
        Drink drink2 = new Drink("Ajerkoniak", 20.15, true);
        Barman barman1 = new Barman();
        barman.order(person2, drink2);
    }
}
