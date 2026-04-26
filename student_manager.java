import java.util.ArrayList;
import java.util.Scanner;

public class student_manager {
    ArrayList<students> students = new ArrayList<>();

    // метод для добавления в массив
    void add(students s) {
        students.add(s);
    }
    // метод для того чтобы вывести весь массив
    void printAll() {
        for (students s : students) {
            System.out.println(s);
        }
    }

    void sort_grade() {
        for (int i = 0; i < students.size() - 1; i++) {
            for(int j = 0; j < students.size() - 1 - i; j++){
                double gradeJ  = students.get(j).getGrade();
                double gradeJNext = students.get(j+1).getGrade();
                if (gradeJ > gradeJNext){
                    students temp = students.get(j);
                    students.set(j, students.get(j+1));
                    students.set(j+1, temp);
                }
            }

        }
        printAll();
    }

    void sort_age() {
        for (int i = 0; i < students.size() - 1; i++) {
            for(int j = 0; j < students.size() - 1 - i; j++){
                double AgeJ  = students.get(j).getAge();
                double AgeJNext = students.get(j+1).getAge();
                if (AgeJ > AgeJNext){
                    students temp = students.get(j);
                    students.set(j, students.get(j+1));
                    students.set(j+1, temp);
                }
            }

        }
        printAll();
    }

    void findByName(){
        Scanner scan = new Scanner(System.in);
        String new_name = scan.nextLine();
        for (int i = 0; i < students.size(); i++) {
            String last_name = students.get(i).getName();
            if (new_name.equals(last_name)){
                System.out.println(students.get(i)); // выводим студента
                return;
            }
        }
            System.out.println("Студент не найден");

    }

    void GetAverage(){
        double max_grade = 0;
        for(int i = 0; i < students.size(); i++) {
            max_grade += students.get(i).getGrade();
        }
        double res = max_grade / students.size();
        System.out.println(res);
    }

    void getBest() {
        students best = students.get(0);
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getGrade() > best.getGrade()){
                best = students.get(i);
            }

        }
        System.out.println(best);

    }

}
