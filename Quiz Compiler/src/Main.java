class Item {
    private double price;

    public double defaultPrice() {
        return 9.99;
    }
}

class SalesItem extends Item {
    @Override
    public double defaultPrice() {
        return 15.99;
    }
}

class DiscountSalesItem extends SalesItem {
    @Override
    public double defaultPrice() {
        return super.defaultPrice() - 2;
    }
}

class Main {
    public static void main(String[] args) {
        DiscountSalesItem dsi = new DiscountSalesItem();
        System.out.println(dsi.defaultPrice());
    }
}