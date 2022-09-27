package course.homework4;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void increaseFood(int x) {
        food += x;
    }
    public void decreaseFood(int n) {
        if (food >= n) food -= n;
        else System.out.println("В тарелке недостаточно еды.");
    }

    public void info() {
        System.out.println("В тарелке: " + food + " г. еды");
    }
}
