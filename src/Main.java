/* Создать два потока студентов, группа дизайнеров и группа инженеров-технологов. В каждой группе по 3 человека (для
простоты эксперимента). При создании каждого студента запросить ввод с экрана имени и года рождения. В конструкторе
должен присутствовать номер группы (дизайнеры - группа №1, инженеры-технологи - группа №2). Посчитать, сколько в каждой
группе студентов, которым 18, 19 и 20 лет и вывести результат на экран для каждой группы. Задачу решить с использованием
Принципов наследования и полиморфизма.*/
public class Main {

    public static void main(String[] args) {
        Disigner disigner = new Disigner("Группа №1");
        Engineer engineer = new Engineer("Группа №2");

        System.out.printf("Количество студентов в %s, которым \n 18 лет - %d,\n 19 лет - %d,\n 20 лет - %d\n", disigner.padej(), disigner.n18, disigner.n19, disigner.n20);
        System.out.printf("Количество студентов в %s, которым \n 18 лет - %d,\n 19 лет - %d,\n 20 лет - %d", engineer.padej(), engineer.n18, engineer.n19, engineer.n20);

        //Другой способ вывода:
        //System.out.println("Количество студентов в " + disigner.padej() + ", которым \n 18 лет - " + disigner.n18 + ",\n 19 лет - " + disigner.n19 + ",\n 20 лет - " + disigner.n20);
        //System.out.println("Количество студентов в " + engineer.padej() + ", которым \n 18 лет - " + engineer.n18 + ",\n 19 лет - " + engineer.n19 + ",\n 20 лет - " + engineer.n20);
    }
}
