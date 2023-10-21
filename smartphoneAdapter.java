class smartphoneAdapter implements powerOutlet {
    private SmartphoneCharger charger;

    SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    @Override
    public void plugIn() {
        charger.chargePhone();
    }
}
