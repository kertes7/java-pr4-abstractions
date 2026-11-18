package ua.duikt.pr4;

/** Коло: успадковує Shape і реалізує обидва інтерфейси. */
public class Circle extends Shape implements Drawable, Scalable {

    private double radius;

    public Circle(double radius) {
        super("коло");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Малюю коло радіусом " + radius);
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    /** Розв'язання конфлікту default-методів: явний виклик ІмʼяІнтерфейсу.super.метод(). */
    @Override
    public String info() {
        return Drawable.super.info() + " + " + Scalable.super.info();
    }
}
