package src.ss7_interface_abstract_class.thuc_hanh.Animal_interface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
