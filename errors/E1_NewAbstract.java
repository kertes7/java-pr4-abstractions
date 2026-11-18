abstract class Shape {
    abstract double area();
    void describe() { System.out.println("shape"); }
}

public class E1_NewAbstract {
    public static void main(String[] args) {
        Shape s = new Shape();      // не можна створити екземпляр абстрактного класу
    }
}
