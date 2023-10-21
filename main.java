public class main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        PowerOutlet powerOutlet = new PowerOutlet() {
            @Override
            public void plugIn() {
                System.out.println("Device is plugged into the power outlet.");
            }
        };

        PowerOutlet laptopPowerOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorPowerOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphonePowerOutlet = new SmartphoneAdapter(charger);

        // Plug the laptop into the power outlet
        powerOutlet.plugIn();
        laptopPowerOutlet.plugIn();

        // Plug the refrigerator into the power outlet
        powerOutlet.plugIn();
        refrigeratorPowerOutlet.plugIn();

        // Plug the smartphone charger into the power outlet
        powerOutlet.plugIn();
        smartphonePowerOutlet.plugIn();
    }
}
