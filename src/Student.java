import java.util.Scanner;

public class Student {
    String name;
    int year;
    String group;
    int n18 = 0;
    int n19 = 0;
    int n20 = 0;
    int[] age = new int[3];

    String groupPrPadej;

    public Student(String group) {
        this.group = group;
        add();
    }

    public void add() {
        padej();
        for (int i = 1; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя " + i + "-го студента в " + padej() + ": ");
            name = scanner.nextLine();
            System.out.print("Введите год рождения: ");
            year = scanner.nextInt();
            raschet();
        }
    }

    public int[] raschet() {
        if ((2021 - year) == 18) {
            age[0] = n18++;
        } else if ((2021 - year) == 19) {
            age[1] = n19++;
        } else if ((2021 - year) == 20) {
            age[2] = n20++;
        }
        return new int[]{n18, n19, n20};
    }

    public String padej() {
        String groupPrPadej = group.replace('а', 'е');
        return groupPrPadej;
    }
}

