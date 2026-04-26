// класс для каждого студента

public class students {
    private String name;
    private int age;
    private double grade;
    //конструктор

    public students(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //методы

    public String getName() { return name; }
    public int getAge()     { return age; }
    public double getGrade(){ return grade; }

    public String toString(){
        return name + " | " + age + " лет | оценка: " + grade;
    }

}


