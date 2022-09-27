package course.homework4;

public class Cat extends Animals {
    int appetite;
    boolean satiety;
    public Cat(String name, int appetite) {
        super(name);
        this.maxRun = 200;
        this.maxSwim = 0;
        this.appetite = appetite;
        this.satiety = false;
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " не умеет плавать");
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        System.out.println("Кот съел " + appetite + " г. еды");
    }
}
