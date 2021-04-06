public class Disigner extends Student {

    public Disigner(String group) {
        super(group);
    }

    @Override
    public void add() {
        System.out.println("Группа дизайнеров:");
        super.add();
    }
}
