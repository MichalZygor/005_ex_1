public class Barman {

    public void order(Person person, Drink drink) {
        if(person.getAge() < 18 && drink.isAlcohol())
            System.out.println("Odmowa sprzedazy. Drink zawiera alkohol");
        if (person.getAge() >= 18) {
            System.out.println(person.getName() + ". Twój drink jest gotowy do odbioru. Kwota do zapłaty to "
                    + drink.getPrice());
        }
    }
}
