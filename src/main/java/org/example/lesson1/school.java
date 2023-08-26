package org.example.lesson1;

public class school {
    Classroom[] classrooms;
    Pupil[] pupils;
    Teacher[] teachers ;
    HeadTeacher[] headTeachers ;
    Porter[] porters;
    CleaningWoman[] cleaningWomen ;
    HeadMaster[] headMasters ;
    Club[] clubs;
    Toilet[] toilets;

    public school(Classroom[] classrooms, Pupil[] pupils, Teacher[] teachers, HeadTeacher[] headTeachers, Porter[] porters, CleaningWoman[] cleaningWomen, HeadMaster[] headMasters, Club[] clubs, Toilet[] toilets) {
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
        for (int i = 0; i <= 2; i++) {
            System.out.println();
            System.out.println("===============================");
        }
    }
}
