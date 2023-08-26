package org.example.lesson1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Classroom klass407 = new Classroom(407, 6, 30, 0);
        Pupil slava = new Pupil("Slavik", "Zhigulkin", 9, "Нюхает клей, мечтает варить самогон как его дед, и постоянно называет себя хайзенбергом, ведб он представляет так себе продажу самогона как это делали в сериале. Сидит на всех уроках на задней парте, кроме химии и биологии. На задней ибо повторяет химию и употребляет её.");
        Teacher valentin = new Teacher("Valentina","Grebenuk",45,"Учитель истории");
        HeadTeacher rosina = new HeadTeacher("Rosina", "Zhdanova", 45,"Заведует младшей школой");
        Porter alexey = new Porter("Leha","Avdeev","Ponedelnik,vtornik");
        CleaningWoman valik = new CleaningWoman("Valya" , "Dubova",1);
        HeadMaster galya= new HeadMaster("Galya","Gorbacheva","2014 - do sih por");
        Club knitting = new Club("vyazanie",5,"4etverg");
        Toilet stage2= new Toilet(2,6,4);

        Classroom klass22 =new Classroom(22, 6, 28, 1);
        Pupil eric = new Pupil("Eric", "Lebedev", 10, "Эрик хорошо учится и хороший парень, воспитанием занимался его дед, пока тот не умер.Отец сбежал до рождения матери. Потом пиздюли отчима заменили ему деда. Дед был бывшим попом, дед учил его по библии и говорил 'ударили по щеке подставь другую' и учил излучать только добро в этот мир, поэтому в школе Эрика бьют тоже. Он верит что если будет хорошо учится, то сможет стать учёным-доктором и сможет спасать людей, фантазирует как те, кто его бьёт, потом попадут ему под скальпель , он их спасёт и они потом будут ещё извиняться. Сидит на первой парте всегда. Ходит с очками , ведь однажды ему сломали нос и повредили зрение. Любит все предметы, кроме физры, ведь его ставят на ворота и пытаются попасть по нему, а не по воротам.");
        Teacher andrew = new Teacher("Andrey","Eblan",45,"Учитель английского");
        HeadTeacher vera = new HeadTeacher("Vera", "Davydova", 45,"Заведует старшей школой");
        Porter volodya = new Porter("Volodya","Vysockiy","Sreda,chetverg");
        CleaningWoman alla = new CleaningWoman("Alla" , "Dorofeeva",2);
        HeadMaster elena = new HeadMaster("Elena","Stalin","2008-2014");
        Club beads = new Club("biser", 7,"vtornik");
        Toilet stage3= new Toilet(3,6,4);

        Classroom klass34 =new Classroom(34, 8, 14, 0);
         Pupil ruslan =new Pupil("Ruslan(Просит называть Иудой)", "Navrotskiy", 14, "Русик скинхед в привычном обличии. Привержинец национал-социализма, заходя в класс вскидывает руку. Любимых предметов нету и находится обычно сзади класса, но активен во время истори нацистской Германии и делает проекты по биологии про превосходство белой расы.");
        Teacher alexey1 = new Teacher("Alexey","Prigozhin",45,"Учитель математики");
        HeadTeacher rosina1 = new HeadTeacher("Rosina", "Gorba4eva", 45,"Заведует бюджетом школы");
        CleaningWoman valya1 = new CleaningWoman("Valya" , "Dubova",3);
        Porter leha1 = new Porter("Leha","Galkin","pyatnica");
        HeadMaster agata = new HeadMaster("Agata","Voronin","2000-2008");
        Club theater = new Club("teatralnaya",4,"sreda");
        Toilet stage1= new Toilet(1,6,4);


        Classroom[] classrooms = {klass407,klass22,klass34};
        Pupil[] pupils = {slava,eric,ruslan};
        Teacher[] teachers = {valentin,andrew,alexey1};
        HeadTeacher[] headTeachers = {rosina, vera,rosina1};
        Porter[] porters = {alexey,volodya,leha1};
        CleaningWoman[] cleaningWomen = {valik,alla,valya1};
        HeadMaster[] headMasters = {galya,elena,agata};
        Club[] clubs = {knitting,beads,theater};
        Toilet[] toilets = {stage2,stage3,stage1};




    }
}