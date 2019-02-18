import controller.AutoFactory;

public class AutoRun {
    public static void main(String[] args) {
        AutoFactory af = new AutoFactory();
        af.addAuto("BMW", "X5", 250_000);
        af.addAuto("Audi", "A6^", 300_000);
        af.addAuto("VW", "Passat", 200_000);
        af.addAuto("Opel", "Insignia", 250_000);
        af.getEqipment(1,"Skora naturalna",10000 );

        af.getAllAuto();
        //     System.out.println(af.getAutosList());
    }
}
