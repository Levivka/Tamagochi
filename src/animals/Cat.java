package animals;

public class Cat extends Pet {

    @Override
    public void greetings() {
        System.out.println("Meow!");
    }

    @Override
    public void discontent() {
        System.out.println("MEEEEOW!!!!");
    }

    @Override
    public void satisfaction() {
        System.out.println("Meow meow meow");
    }
}
