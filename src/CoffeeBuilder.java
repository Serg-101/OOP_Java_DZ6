
public class CoffeeBuilder {
    private Coffee coffee;
    private String water;
    private String sugar;
    private String typeOfCoffee;


    public void boilingWater(){
        System.out.println("Вода вскипятилась");
    }
    public Coffee buildCoffee(){
        //take cup
        //add some coffee
        //add some sugar
        //fill the water
        //all done
        return new Coffee(typeOfCoffee, sugar , water);
    }

    public void setCoffee(String typeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }
}
