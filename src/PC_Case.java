public class PC_Case implements PersonalComputer{
    private PersonalComputer PC;
    @Override
    public String decorate(){
        return "PC with: \n";
    }

    @Override
    public double price() {
        return 100;
    }
}
