public class BuilderUI {

    public static void main(String[] args) {

        PersonalComputer pc1 = new Memory(new GPU(new Motherboard(new PC_Case())));
        System.out.println(pc1.decorate() + "\nTotal: "+pc1.price());


    }

}
