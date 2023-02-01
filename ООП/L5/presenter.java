package ООП.L5;

// from ООП.L5.AttendanceService.java import showPart;
// Создайте класс presenter со следующими функциями:
// • Распечатать всех студентов и посещаемость каждого в процентах
// • Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
// • Распечатать студентов с посещаемостью ниже 25%

public class presenter {
    public static String action(String result) {
        switch (result) {
            case ("1"):
                AttendanceService journal = new AttendanceService();
                String viewStudent = journal.showPart();
                return viewStudent;
            case ("2"):
                AttendanceService journal2 = new AttendanceService();
                String viewStudent2 = journal2.showDeclining();
                return viewStudent2;
            case ("3"):
                AttendanceService journal3 = new AttendanceService();
                String viewStudent3 = journal3.showQuarter();
                return viewStudent3;
        }
        return result;
    }
}
