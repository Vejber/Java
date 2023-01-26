package ООП.L5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class AttendanceService {
    public class Student {
        String name;
        HashMap<Integer, Boolean> attendance;

        public Student(String name, HashMap<Integer, Boolean> attendance) {
            this.name = name;
            this.attendance = attendance;
        }

        // public HashMap<Integer, Boolean> get(int i) {
        // return null;
        // }
    }

    HashMap<Integer, Boolean> ivanovAttendance = new HashMap<>();
    {
        ivanovAttendance.put(10, false);
        ivanovAttendance.put(11, false);
        ivanovAttendance.put(12, false);
        ivanovAttendance.put(13, true);
        ivanovAttendance.put(14, true);
        ivanovAttendance.put(15, true);

    }
    Student ivanov = new Student("ivanov", ivanovAttendance);

    HashMap<Integer, Boolean> petrovAttendance = new HashMap<>();
    {
        petrovAttendance.put(10, false);
        petrovAttendance.put(11, false);
        petrovAttendance.put(12, false);
        petrovAttendance.put(13, false);
        petrovAttendance.put(14, false);
        petrovAttendance.put(15, false);

    }
    Student petrov = new Student("petrov", petrovAttendance);

    HashMap<Integer, Boolean> volkovAttendance = new HashMap<>();
    {
        volkovAttendance.put(10, true);
        volkovAttendance.put(11, true);
        volkovAttendance.put(12, true);
        volkovAttendance.put(13, true);
        volkovAttendance.put(14, true);
        volkovAttendance.put(15, true);

    }
    Student volkov = new Student("volkov", volkovAttendance);

    ArrayList<Student> Log = new ArrayList<>();
    {
        Log.add(ivanov);
        Log.add(petrov);
        Log.add(volkov);
    }

    // students and arrays should be created in presenter?
    public HashMap showPart(ArrayList<Student> A) { // must take hashset with all hashmaps?
        HashMap<String, Integer> allAttendance = new HashMap<>(); // Распечатать всех студентов и посещаемость каждого в
                                                                  // процентах
        int count = 0;
        int countKey = 0;
        for (Student item : A) { // ("ivanov", attendance hashmap)
            for (Integer key : item.get(1).keySet()) {
                Boolean val = ivanovAttendance.get(key);
                countKey++;
                if (val == true) {
                    count++;
                }
            }
        }
        for (Integer key : ivanovAttendance.keySet()) {
            Boolean val = ivanovAttendance.get(key);
            countKey++;
            if (val == true) {
                count++;
            }
        }
        int result = (100 * count) / countKey;
        allAttendance.put("ivanov", result); // unify somehow!!!
        return allAttendance;
    }
}
// Создайте класс presenter со следующими функциями:
// • Распечатать всех студентов и посещаемость каждого в процентах
// • Распечатать студентов, отсортировав их по убыванию посещаемости (вверху
// самые посещающие)
// • Распечатать студентов с посещаемостью ниже 25%