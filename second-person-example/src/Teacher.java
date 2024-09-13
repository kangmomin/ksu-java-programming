public class Teacher extends Person implements Teachable, Studyable {

    Teacher(String name, int age) {
        super(name, "선생님", age);
    }

    @Override
    public void teach(String subject) {
        System.out.println(this.getName() + "이 " + subject + " 과목을 가르칩니다.");
    }


    @Override
    public void study(String subject) {
        System.out.println(subject + "를 공부합니다.");
    }
}
