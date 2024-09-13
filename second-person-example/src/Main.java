public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("강모민", "학생", 19);
        p1.setAge(20);

        System.out.println("나는 " + p1.getName() + "이고, " + p1.getAge() + "살 " + p1.getJob() + "입니다.");
        p1.say("Hello world");
        p1.eat("some cheeps");

        Student s1 = new Student("강천재", null, 10);
        System.out.println("나는 " + s1.getName() + "이고, " + s1.getAge() + "살 " + s1.getJob() + "입니다.");
        s1.walk(100.5);
        ((Student) s1).study("자바");
        s1.eat("버터 갈릭 감자튀김");

        Teacher t1 = new Teacher("강동완", 91);
        System.out.println("나는 " + t1.getName() + "이고, " + t1.getAge() + "살 " + t1.getJob() + "입니다.");
        t1.teach("JavaScript");
        t1.study("Java");
    }
}