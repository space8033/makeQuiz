public enum PastaOption {
    TOMATO(8000),
    CREAM(9000),
    ROSE(10000);

    private int price;

    PastaOption(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}