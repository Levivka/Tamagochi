package animals;

public class Dog extends Pet{
    @Override
    public void greetings() {
        System.out.println("Woof!");
    }

    @Override
    public void discontent() {
        System.out.println("WOOOOOF!!!");
    }

    @Override
    public void satisfaction() {
        System.out.println("Woof wooof wooof");
    }
}
