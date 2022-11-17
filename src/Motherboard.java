public class Motherboard extends Decorator{
    public Motherboard(PersonalComputer pc){
        super(pc);
    }


    @Override
    public String decorate() {
        return PC.decorate() + "ASUS ROG Strix Motherboard, ";
    }

    @Override
    public double price() {
        return PC.price()+ 459;
    }
}
