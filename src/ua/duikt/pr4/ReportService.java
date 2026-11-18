package ua.duikt.pr4;

import java.util.List;

/**
 * Сервіс отримує залежність через конструктор як ІНТЕРФЕЙС (принцип інверсії залежностей).
 * Підставити іншу реалізацію можна, не змінюючи жодного рядка цього класу.
 */
public class ReportService {

    private final Formatter formatter;

    public ReportService(Formatter formatter) {
        this.formatter = formatter;
    }

    public String report(List<Shape> shapes) {
        return formatter.format("Звіт про фігури", shapes);
    }
}
