public class Bar {
    public static void main(String[] args) {
        Person person1 = new Person("Tomasz", "Banaś", 19);
        Person person2 = new Person("Walker", "Bieniasz", 16);
        Person person3 = new Person("Franek", "Tylka", 15);

        Drink drink1 = new Drink("Blue Mary", 45.44, true);
        Drink drink2 = new Drink("Ajerkoniak", 20.15, true);
        Drink drink3 = new Drink("Lemoniada", 10.33, false);

        Barman barman = new Barman();
        barman.order(person1, drink1);
        barman.order(person2, drink2);
        barman.order(person3, drink3);
    }
}
