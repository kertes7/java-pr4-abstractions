package ua.duikt.pr4;

/** Інтерфейс «можна намалювати». */
public interface Drawable {

    void draw();

    /** default-метод; такий самий за сигнатурою default є у Scalable (конфлікт розв'язується в класі). */
    default String info() {
        return "Drawable";
    }
}
