public class Student extends Person{
    private int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    void performDuty() {
        System.out.println("Студент " + getName() + " учится в классе " + getGrade());
    }
    void study() {
        System.out.println("Студент " + getName() + " делает домашнее задание");
    }
}
