class LaptopAdapter implements powerOutlet {
    private Laptop laptop;

    LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void plugIn() {
        laptop.charge();
    }
}
