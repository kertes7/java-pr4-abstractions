package ua.duikt.pr4;

import java.util.List;
import java.util.Locale;

/** Реалізація №2: звіт таблицею. */
public class TableFormatter implements Formatter {

    @Override
    public String format(String title, List<Shape> shapes) {
        StringBuilder sb = new StringBuilder(title).append('\n');
        sb.append("+-------------+--------+\n");
        sb.append("| Фігура      | Площа  |\n");
        sb.append("+-------------+--------+\n");
        for (Shape s : shapes) {
            sb.append(String.format(Locale.US, "| %-11s | %6.2f |%n", s.name(), s.area()));
        }
        sb.append("+-------------+--------+\n");
        return sb.toString();
    }
}
