package ООП.L5;

import java.util.ArrayList;
import java.util.HashMap;

public class AttendanceService {
    public class Student {
        String name;
        HashMap<Integer, Boolean> attendance;

        public Student(String name, HashMap<Integer, Boolean> attendance) {
            this.name = name;
            this.attendance = attendance;
        }
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
    Student ivanov = new Student("ivanov", ivanovAttendance); // 50%

    HashMap<Integer, Boolean> petrovAttendance = new HashMap<>();
    {
        petrovAttendance.put(10, false);
        petrovAttendance.put(11, false);
        petrovAttendance.put(12, false);
        petrovAttendance.put(13, false);
        petrovAttendance.put(14, false);
        petrovAttendance.put(15, false);

    }
    Student petrov = new Student("petrov", petrovAttendance); // 0%

    HashMap<Integer, Boolean> volkovAttendance = new HashMap<>();
    {
        volkovAttendance.put(10, true);
        volkovAttendance.put(11, true);
        volkovAttendance.put(12, true);
        volkovAttendance.put(13, true);
        volkovAttendance.put(14, true);
        volkovAttendance.put(15, true);

    }
    Student volkov = new Student("volkov", volkovAttendance); // 100%

    public String convertWithIteration(HashMap<String, Integer> map) {
        StringBuilder mapAsString = new StringBuilder("{");
        for (String key : map.keySet()) {
            mapAsString.append(key + "=" + map.get(key) + ", ");
        }
        mapAsString.delete(mapAsString.length() - 2, mapAsString.length()).append("}");
        return mapAsString.toString();
    }

    // Распечатать всех студентов и посещаемость каждого в процентах
    public String showPart() {
        ArrayList<Student> Log = new ArrayList<>();
        {
            Log.add(ivanov);
            Log.add(petrov);
            Log.add(volkov);
        }
        HashMap<String, Integer> allAttendance = new HashMap<>();
        for (Student item : Log) {
            int count = 0;
            int countKey = 0;
            for (Integer key : item.attendance.keySet()) {
                Boolean val = item.attendance.get(key);
                countKey++;
                if (val == true) {
                    count++;
                }
            }
            int result = (100 * count) / countKey;
            allAttendance.put(item.name, result);
        }
        String result = convertWithIteration(allAttendance);
        return result;
    }

    // Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые
    // посещающие)
    public String showDeclining() {
        ArrayList<Student> Log = new ArrayList<>();
        {
            Log.add(ivanov);
            Log.add(petrov);
            Log.add(volkov);
        }
        HashMap<String, Integer> simpleAttendance = new HashMap<>();
        for (Student item : Log) {
            int count = 0;
            int countKey = 0;
            for (Integer key : item.attendance.keySet()) {
                Boolean val = item.attendance.get(key);
                countKey++;
                if (val == true) {
                    count++;
                }
            }
            int result = (100 * count) / countKey;
            simpleAttendance.put(item.name, result);
        }
        HashMap<String, Integer> decliningAttendance = new HashMap<>();
        simpleAttendance.entrySet().stream().sorted(HashMap.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> decliningAttendance.put(entry.getKey(), entry.getValue()));
        String result = convertWithIteration(decliningAttendance);
        return result;
    }

    // • Распечатать студентов с посещаемостью ниже 25%
    public String showQuarter() {
        ArrayList<Student> Log = new ArrayList<>();
        {
            Log.add(ivanov);
            Log.add(petrov);
            Log.add(volkov);
        }
        HashMap<String, Integer> simpleAttendance = new HashMap<>();
        for (Student item : Log) {
            int count = 0;
            int countKey = 0;
            for (Integer key : item.attendance.keySet()) {
                Boolean val = item.attendance.get(key);
                countKey++;
                if (val == true) {
                    count++;
                }
            }
            int result = (100 * count) / countKey;
            simpleAttendance.put(item.name, result);
        }
        HashMap<String, Integer> quarterAttendance = new HashMap<>();
        for (HashMap.Entry<String, Integer> entry : simpleAttendance.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value < 25) {
                quarterAttendance.put(key, value);
            }
        }
        String result = convertWithIteration(quarterAttendance);
        return result;
    }
}