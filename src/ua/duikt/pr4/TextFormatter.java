package ua.duikt.pr4;

import java.util.List;
import java.util.Locale;

/** Реалізація №1: звіт текстом. */
public class TextFormatter implements Formatter {

    @Override
    public String format(String title, List<Shape> shapes) {
        StringBuilder sb = new StringBuilder(title).append('\n');
        for (Shape s : shapes) {
            sb.append(String.format(Locale.US, "- %s: площа %.2f%n", s.name(), s.area()));
        }
        return sb.toString();
    }
}
