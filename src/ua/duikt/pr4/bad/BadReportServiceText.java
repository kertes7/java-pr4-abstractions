package ua.duikt.pr4.bad;

import java.util.List;

import ua.duikt.pr4.Formatter;
import ua.duikt.pr4.Shape;
import ua.duikt.pr4.TextFormatter;

/** ПОГАНИЙ варіант (версія A): сервіс сам створює залежність через new. */
public class BadReportServiceText {

    private final Formatter formatter = new TextFormatter();      // жорстка залежність

    public String report(List<Shape> shapes) {
        return formatter.format("Звіт про фігури", shapes);
    }
}
