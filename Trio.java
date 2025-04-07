public class Trio implements menuItem{
    Sandwich sandwich;
    Salad salad;
    Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        sandwich = sandwich;
        salad = salad;
        drink = drink;
    }

    private String getName(){
        return sandwich.getName() && salad.getName() && drink.getName();
    }


}
