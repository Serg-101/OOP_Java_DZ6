public class Main {
    public static void main(String[] args) {

        // Реализовать 4 вида кофейных напитков
        //  Эспрессо: кофе
        // Американо: кофе + вода
        //  Капучино: кофе + вспененное молоко
        //     Мокка: кофе + шоколад + молоко
        System.out.println("make a cup of Espresso.");
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        coffeeBuilder.setCoffee("coffee");
        coffeeBuilder.setWater("0");
        coffeeBuilder.setSugar("1 teaspoons");
        coffeeBuilder.boilingWater();
        Coffee c = coffeeBuilder.buildCoffee();
        System.out.println(c);

        System.out.println("make a cup of Americano.");
        CoffeeBuilder AmericanoBuilder = new CoffeeBuilder();
        AmericanoBuilder.setCoffee("coffee");
        AmericanoBuilder.setWater("1 cup");
        AmericanoBuilder.setSugar("2 teaspoons");
        AmericanoBuilder.boilingWater();
        c = AmericanoBuilder.buildCoffee();
        System.out.println(c);

        System.out.println("make a cup of Cappuccino");
        CoffeeBuilder milkCoffeeBuilder = new MilkCoffeeBuilder();
        milkCoffeeBuilder.setCoffee("coffee");
        milkCoffeeBuilder.setWater("1 cup");
        milkCoffeeBuilder.setSugar("2 teaspoons");
        milkCoffeeBuilder.boilingWater();
        ((MilkCoffeeBuilder) milkCoffeeBuilder).setMilk("100ml of milk"); // Скастовали на наследника
        c = (((MilkCoffeeBuilder) milkCoffeeBuilder).buildMilkCoffee());
        System.out.println(c);

        System.out.println("make a cup of Mokka");
        CoffeeBuilder chocolateMilkCoffeeBuilder = new ChocolateMilkCoffeeBuilder();
        chocolateMilkCoffeeBuilder.setCoffee("coffee");
        chocolateMilkCoffeeBuilder.setWater("1 cup");
        chocolateMilkCoffeeBuilder.setSugar("2 teaspoons");
        chocolateMilkCoffeeBuilder.boilingWater();
        ((ChocolateMilkCoffeeBuilder) chocolateMilkCoffeeBuilder).setChoco("100ml of milk","1 spoon"); // Скастовали на наследника
        c = (((ChocolateMilkCoffeeBuilder) chocolateMilkCoffeeBuilder).buildChocolateMilkCoffee());
        System.out.println(c);


    }
}