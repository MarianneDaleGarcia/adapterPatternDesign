class RefrigeratorAdapter implements powerOutlet {
    private Refrigerator refrigerator;

    RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void plugIn() {
        refrigerator.startCooling();
    }
}
