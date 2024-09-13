public class Student extends Person implements Studyable {
    public Student(String name, String job, int age) {
        super(name, job, age);
    }

    @Override
    public void study(String subject) {
        System.out.println(this.getName() + "이 " + subject + "과목을 공부합니다.");
    }
}
