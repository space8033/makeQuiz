public class Pasta {
    private final String guest;
    private int price;
    private PastaOption pastaOption;
    private boolean isNoodleAdded;
    private boolean isGarlicAdded;

    public Pasta(String guest, PastaOption pastaOption) {
        this.guest = guest;
        this.pastaOption = pastaOption;
        price = pastaOption.getPrice();
    }

    public void orderInfo() {
        System.out.println("주문자: " + guest);
        if(isNoodleAdded) {
            System.out.println("면이 추가되었습니다.(+1000원)");
        }
        if(isGarlicAdded) {
            System.out.println("마늘이 추가되었습니다.(+2000원)");
        }
        System.out.println("파스타 가격: " + price);
    }

    public void addNoodle() {
        if(isNoodleAdded) {
        }else {
            price += 1000;
            isNoodleAdded = true;
        }
    }

    public void addGarlic() {
        if(isGarlicAdded) {
        }else {
            price += 2000;
            isGarlicAdded = true;
        }
    }
}
