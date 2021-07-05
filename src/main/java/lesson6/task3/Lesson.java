package lesson6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public enum Lesson {
    MATH("Математика"),
    PHYSICS("Физика"),
    PROGRAMMING("Программирование"),
    HISTORY("История"),
    BIOLOGY("Биология"),
    GEOGRAPHY("География");

    private String lessonName;

    Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public static List<Lesson> getRandomListLessons() {
        List<Lesson> lessons = new ArrayList<>();
        int length = 4 + (int) (Math.random() * 3);
        for (int i = 0; i < length; i++) {
            lessons.add(Lesson.values()[new Random().nextInt(values().length)]);
        }
        return lessons;
    }
}
