public class Disigner extends Student {

    public Disigner(String group) {
        super("Группа №1");
    }

    @Override
    public void add() {
        System.out.println("Группа дизайнеров:");
        super.add();
    }
}
