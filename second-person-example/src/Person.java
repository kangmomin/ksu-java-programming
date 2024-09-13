public class Person {

    private String name, job;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public void eat(String food) {
        System.out.println(name + "은 " + food + "를 먹습니다.");
    }

    public void walk(Double longer) {
        System.out.println(name + "은 " + longer + "만큼 걷습니다.");
    }

    public void say(String sentence) {
        System.out.println(sentence + "라고 말합니다.");
    }
}
