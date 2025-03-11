package shop;

public class CellPhone extends Product {
    private String carrier;

    public CellPhone(String pname, int price, String carrier) {
        super(pname, price);
        this.carrier = carrier;
    }

    @Override
    public void printExtra() {
        System.out.println("통신사 : " + this.carrier);
    }

    @Override
    protected Object genPname() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'genPname'");
    }

    @Override
    protected Object genPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'genPrice'");
    }
}
