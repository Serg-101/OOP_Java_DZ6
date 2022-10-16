public class MilkCoffeeBuilder extends CoffeeBuilder{
    private String milk;


    public Coffee buildMilkCoffee(){
        System.out.println("add some Hot Milk frothed");
        return new MilkCoffee(buildCoffee(), milk);
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }
}
