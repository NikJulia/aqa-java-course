package course.homework4;

public class Animals {
    protected String name;
    int maxRun;
    int maxSwim;

    public Animals(String name){
        this.name = name;
    }

    public void run(int distance) {
        if (this.maxRun >= distance) System.out.println(this.name + " пробежал " + distance + " м.");
        else System.out.println(this.name + " не может пробежать такое расстояние.");
    }

    public void swim(int distance) {
        if (this.maxSwim >= distance) System.out.println(this.name + " проплыл " + distance + " м.");
        else System.out.println(this.name + " не может проплыть такое расстояние.");
    }
}