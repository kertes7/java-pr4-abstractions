package ua.duikt.pr4;

/** Дослід 1: абстрактний клас — похідні реалізують area(); звичайний describe() успадковано. */
public class Exp1Abstract {

    public static void main(String[] args) {
        Utf8.init();
        // new Shape("x");                    // помилка компіляції: Shape is abstract; cannot be instantiated
        Shape circle = new Circle(2);
        Shape rect = new Rectangle(3, 4);
        System.out.println(circle.describe());
        System.out.println(rect.describe());
    }
}
