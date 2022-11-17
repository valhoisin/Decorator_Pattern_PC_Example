public class GPU extends Decorator{

    public GPU(PersonalComputer PC){
    super(PC);
    }


    @Override
    public String decorate() {
        return PC.decorate() + "Nvidia RTX4090, ";
    }

    @Override
    public double price() {
        return PC.price() + 1230.99;
    }
}
