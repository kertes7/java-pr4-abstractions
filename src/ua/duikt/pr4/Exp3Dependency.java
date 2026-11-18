package ua.duikt.pr4;

import java.util.List;

import ua.duikt.pr4.bad.BadReportServiceTable;
import ua.duikt.pr4.bad.BadReportServiceText;

/** Дослід 3: залежність всередині сервісу (new) проти передачі через конструктор. */
public class Exp3Dependency {

    public static void main(String[] args) {
        Utf8.init();
        List<Shape> shapes = List.of(new Circle(2), new Rectangle(3, 4));

        System.out.println("=== Погано: залежність створюється всередині сервісу ===");
        System.out.println("Версія A (BadReportServiceText):");
        System.out.print(new BadReportServiceText().report(shapes));
        System.out.println("Версія B (BadReportServiceTable) — довелося змінити код сервісу:");
        System.out.print(new BadReportServiceTable().report(shapes));

        System.out.println();
        System.out.println("=== Добре: залежність передається через конструктор ===");
        System.out.println("new ReportService(new TextFormatter()):");
        System.out.print(new ReportService(new TextFormatter()).report(shapes));
        System.out.println("new ReportService(new TableFormatter()) — ReportService не змінено:");
        System.out.print(new ReportService(new TableFormatter()).report(shapes));
    }
}
