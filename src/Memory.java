public class Memory extends Decorator {

    public Memory(PersonalComputer pc) {
        super(pc);
    }

    @Override
    public String decorate() {
        return PC.decorate() + "32GB RAM, ";
    }

    @Override
    public double price() {
        return PC.price() + 50;
    }
}
