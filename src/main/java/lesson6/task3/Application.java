package lesson6.task3;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scholar andrey = new Scholar();
        Map<DayOfWeek, List<Lesson>> diary = new TreeMap<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            diary.put(day, Lesson.getRandomListLessons());
        }
        andrey.setDiary(diary);

        for (Map.Entry<DayOfWeek, List<Lesson>> dayEntry : andrey.getDiary().entrySet()) {
            StringBuilder format = new StringBuilder();
            format.append(dayEntry.getKey().getDay()).append(":");
            for (Lesson lesson : dayEntry.getValue()) {
                format.append(", ").append(lesson.getLessonName());
            }
            String formattedString = format.toString().replaceFirst(",", "");
            System.out.println(formattedString);
        }
        Map<Lesson, Integer> lessonCounters = new HashMap<>();
        for (Lesson lesson : Lesson.values())
            lessonCounters.put(lesson, 0);
        for (List<Lesson> lessons : andrey.getDiary().values()) {
            for (Lesson lesson : lessons) {
                lessonCounters.put(lesson, lessonCounters.get(lesson) + 1);
            }
        }
        int maxLessonAmount = Collections.max(lessonCounters.values());
        int minLessonAmount = Collections.min(lessonCounters.values());
        for (int i = maxLessonAmount; i >= minLessonAmount; i--) {
            for (Map.Entry<Lesson, Integer> entry : lessonCounters.entrySet()) {
                if (entry.getValue() == i)
                    System.out.printf("%s: %d%n", entry.getKey().getLessonName(), entry.getValue());
            }
        }
    }
}
