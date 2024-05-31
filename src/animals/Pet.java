package animals;

abstract public class Pet {
    private String name;
    private int hungriness;
    private int health;

    public String getName() {
        return name;
    }

    abstract public void greetings();
    abstract public void discontent();
    abstract public void satisfaction();

    public void feeding() {
        this.hungriness += 10;
        System.out.println("Вы накормили питомца");
    }

    public void walk() {
        this.health += 10;
        this.hungriness -= 10;
        System.out.println("Вы погуляли с питомцем");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungriness() {
        return hungriness;
    }
    public int getHealth() {
        return health;
    }

    public void setHungriness(int hungriness) {
        this.hungriness = hungriness;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}


