package ua.duikt.pr4;

/** Інтерфейс «можна масштабувати». */
public interface Scalable {

    void scale(double factor);

    default String info() {
        return "Scalable";
    }
}
