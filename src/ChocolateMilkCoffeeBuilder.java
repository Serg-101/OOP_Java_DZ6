public class ChocolateMilkCoffeeBuilder extends MilkCoffeeBuilder {
    private String choco;
    private String milk;

    public Coffee buildChocolateMilkCoffee() {
        System.out.println("add one spoon of chocolate");
        return new ChocolateMilkCoffee(buildCoffee(), milk, choco);
    }

    public void setChoco(String milk, String choco) {
        this.milk = milk;
        this.choco = choco;
    }
}
