package ua.duikt.pr4;

/** Прямокутник: успадковує Shape і реалізує обидва інтерфейси. */
public class Rectangle extends Shape implements Drawable, Scalable {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("прямокутник");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Малюю прямокутник " + width + " x " + height);
    }

    @Override
    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    public String info() {
        return Drawable.super.info() + " + " + Scalable.super.info();
    }
}
