package ua.duikt.pr4;

import java.util.List;

/** Залежність сервісу — форматування звіту. Сервіс знає лише цей інтерфейс. */
public interface Formatter {

    String format(String title, List<Shape> shapes);
}
