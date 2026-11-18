package ua.duikt.pr4;

/** Абстрактний клас: спільний стан (назва) і звичайний метод + один абстрактний метод. */
public abstract class Shape {

    protected final String name;

    protected Shape(String name) {
        this.name = name;
    }

    /** Абстрактний метод — реалізацію мусить надати кожна фігура. */
    public abstract double area();

    /** Звичайний метод, що використовує абстрактний (шаблонний метод). */
    public String describe() {
        return String.format(java.util.Locale.US, "%s, площа = %.2f", name, area());
    }

    public String name() {
        return name;
    }
}
