package org.example.lesson1;

public class Classroom {
    int classroom;

    int form;

    int pupils;

    int quantityExcellentStudents;


    public Classroom(int classroom, int form, int pupils, int quantityExcellentStudents) {
        this.classroom = classroom;
        this.form = form;
        this.pupils = pupils;
        this.quantityExcellentStudents = quantityExcellentStudents;
    }
    String presentClassroom(){
        return "kabinet - " + classroom + "\n" + "klass - " + form + "\n" + "koli4estvo u4enikov - " + pupils + "\n" + "skoka otli4nikov - " + quantityExcellentStudents;
    }
}
