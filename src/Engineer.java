public class Engineer extends Student {
    Engineer[] group2;

    public Engineer(String group) {
        super("Группа №2");
    }

    @Override
    public void add() {
        System.out.println("Группа инженеров-технологов:");
        super.add();
    }
}
