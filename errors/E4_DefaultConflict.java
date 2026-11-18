interface Drawable { default String info() { return "Drawable"; } }
interface Scalable { default String info() { return "Scalable"; } }

class Circle implements Drawable, Scalable { }       // конфлікт default-методів не розв'язано

public class E4_DefaultConflict {
    public static void main(String[] args) { }
}
