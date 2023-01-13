package oops.Assignment.Discount;

public class Discount {
    private String customerName;
    private int discount;
    private String validTill;
    private String daysLeft;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = Integer.parseInt(discount);
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public String getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(String daysLeft) {
        this.daysLeft = daysLeft;
    }
}
