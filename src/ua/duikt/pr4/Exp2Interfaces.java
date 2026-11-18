package ua.duikt.pr4;

/** Дослід 2: один об'єкт через посилання двох інтерфейсів; розв'язаний конфлікт default-методів. */
public class Exp2Interfaces {

    public static void main(String[] args) {
        Utf8.init();
        Circle circle = new Circle(1);

        Drawable d = circle;
        d.draw();                              // через Drawable доступні лише draw() та info()
        // d.scale(2);                         // помилка компіляції: cannot find symbol

        Scalable s = circle;
        s.scale(2);                            // через Scalable доступні лише scale() та info()
        // s.draw();                           // помилка компіляції: cannot find symbol

        circle.draw();                         // після масштабування x2 (радіус 2)
        System.out.println("info() після розв'язання конфлікту: " + circle.info());
    }
}
