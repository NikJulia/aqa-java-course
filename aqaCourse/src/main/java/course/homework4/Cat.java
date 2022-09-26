package course.homework4;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.maxSwim = 0;
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " не умеет плавать");
    }
}
