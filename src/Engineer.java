public class Engineer extends Student {

    public Engineer(String group) {
        super(group);
    }

    @Override
    public void add() {
        System.out.println("Группа инженеров-технологов:");
        super.add();
    }
}
