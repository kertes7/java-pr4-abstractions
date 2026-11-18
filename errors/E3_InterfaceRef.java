interface Drawable { void draw(); }
interface Scalable { void scale(double k); }

class Circle implements Drawable, Scalable {
    public void draw() { }
    public void scale(double k) { }
}

public class E3_InterfaceRef {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
        d.scale(2);                 // через Drawable метод scale недоступний
    }
}
