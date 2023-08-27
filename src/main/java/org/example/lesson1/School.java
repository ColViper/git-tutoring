package org.example.lesson1;

public class School {

    private String name;
    Classroom[] classrooms;
    Pupil[] pupils;
    Teacher[] teachers ;
    HeadTeacher[] headTeachers ;
    Porter[] porters;
    CleaningWoman[] cleaningWomen ;
    HeadMaster[] headMasters ;
    Club[] clubs;
    Toilet[] toilets;

    public School(Classroom[] classrooms, Pupil[] pupils, Teacher[] teachers, HeadTeacher[] headTeachers, Porter[] porters, CleaningWoman[] cleaningWomen, HeadMaster[] headMasters, Club[] clubs, Toilet[] toilets) {
        this.classrooms = classrooms;
        this.pupils = pupils;
        this.teachers = teachers;
        this.headTeachers = headTeachers;
        this.porters = porters;
        this.cleaningWomen = cleaningWomen;
        this.headMasters = headMasters;
        this.clubs = clubs;
        this.toilets = toilets;
    }
    public void doShit() {
        System.out.println("Hi! I am a school " + name);
        System.out.println();
        System.out.println("Here are my classrooms:");
        for (int i = 0; i < classrooms.length; i++) {
            Classroom classroom = classrooms[i];
            System.out.println("===============================");
            System.out.println("[" + i + "] classroom is called: " + classroom.classroom + " " + classroom.form);
        }
    }
}
