import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        student_manager manager = new student_manager();

        manager.add(new students("Костя", 18, 8.5));
        manager.add(new students("Анна", 20, 9.0));
        manager.add(new students("Паша", 34, 1.0));
        manager.add(new students("Нина", 13, 6.0));
        manager.add(new students("Мария", 19, 8.5));
        manager.add(new students("Соня", 25, 4.2));
        manager.add(new students("Миша", 32, 9.3));

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1. Показать всех");
            System.out.println("2. Сортировать по оценке");
            System.out.println("3. Сортировать по возрасту");
            System.out.println("4. Найти по имени");
            System.out.println("5. Средняя оценка студентов");
            System.out.println("6. Лучший студент");
            System.out.println("0. Выйти");

            int button = scan.nextInt();

            switch (button) {
                case 1:
                    manager.printAll();
                    break;
                case 2:
                    manager.sort_grade();
                    manager.printAll();
                    break;

                case 3:
                    manager.sort_age();
                    break;

                case 4:
                    manager.findByName();
                    break;
                case 5:
                    manager.GetAverage();
                    break;
                case 6:
                    manager.getBest();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
    }
}