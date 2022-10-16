public class ChocolateMilkCoffee extends MilkCoffee{
    private String choco;

    public ChocolateMilkCoffee(String coffee, String sugar, String water, String milk, String choco) {
        super(coffee, sugar, water, milk);
        this.choco = choco;
    }

    public ChocolateMilkCoffee(Coffee coffee, String milk, String choco) {
        super(coffee, milk);
        this.choco = choco;
    }

    @Override
    public String toString() {
        return "Mokka = Chocolate + Milk + Coffee";
    }
}
