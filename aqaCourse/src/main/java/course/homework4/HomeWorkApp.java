/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');+
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4.* Добавить подсчет созданных котов, собак и животных.

5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
● Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
● Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
● Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
● Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
● Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

6. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
7. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */
package course.homework4;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Бобик");

        System.out.print("Введите дистанцию для кота (бег) в виде целого числа: ");
        cat.run(in.nextInt());
        System.out.print("Введите дистанцию для кота (плавание) в виде целого числа: ");
        cat.swim(in.nextInt());

        System.out.print("Введите дистанцию для собаки (бег) в виде целого числа: ");
        dog.run(in.nextInt());
        System.out.print("Введите дистанцию для собаки (плавание) в виде целого числа: ");
        dog.swim(in.nextInt());
    }
}