package org.example.lesson1;

public class HeadMaster {
    String name;
    String secondName;
    String workExperienceInYears;

    public HeadMaster(String Name, String secondName, String workExperienceInYears) {
        this.name = Name;
        this.secondName = secondName;
        this.workExperienceInYears = workExperienceInYears;
    }
    String presentHeadMaster(){
        return "Imya - " + name + "\n" +"Familiya - "+ secondName + "\n"+"s kakogo po kakoy god - "+ workExperienceInYears + "\n";
    }
}