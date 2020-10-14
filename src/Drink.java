public class Drink {
    private String name;
    private double price;
    private boolean isAlcohol;

    public Drink(String name, double price, boolean isAlcohol) {
        this.name = name;
        this.price = price;
        this.isAlcohol = isAlcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }
}
