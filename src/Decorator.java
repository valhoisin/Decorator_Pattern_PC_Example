public abstract class Decorator implements PersonalComputer{

    protected PersonalComputer PC;

    public Decorator(PersonalComputer pc){
        this.PC = pc;
    }


    //    @Override
//    public String decorate(){
//        return PC.decorate();
//    }
//    @Override
//    public double price(){
//        return PC.price();
//    }
}
