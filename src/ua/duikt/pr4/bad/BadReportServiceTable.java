package ua.duikt.pr4.bad;

import java.util.List;

import ua.duikt.pr4.Formatter;
import ua.duikt.pr4.Shape;
import ua.duikt.pr4.TableFormatter;

/** ПОГАНИЙ варіант (версія B): щоб перейти на таблицю, довелося ЗМІНИТИ код сервісу. */
public class BadReportServiceTable {

    private final Formatter formatter = new TableFormatter();     // змінено рядок у сервісі

    public String report(List<Shape> shapes) {
        return formatter.format("Звіт про фігури", shapes);
    }
}
