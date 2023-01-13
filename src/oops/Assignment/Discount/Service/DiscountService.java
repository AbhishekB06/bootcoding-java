package oops.Assignment.Discount.Service;

import oops.Assignment.Discount.Customer;
import oops.Assignment.Discount.Discount;

public class DiscountService {
    private static final int LIMIT = 100;
    public Discount[] getAllCustomersDiscount(){

        Discount[] discounts = new Discount[LIMIT];

        CustomerService customerService = new CustomerService();
        Customer[] allCustomers = customerService.getAllCustomers();
        for(int i = 0; i < LIMIT; i++){
            Discount discount = buildDiscount(allCustomers[i]);
            discounts[i] = discount;
        }
        return discounts;
    }
    private Discount buildDiscount(Customer customer){
        int visitCount = customer.getVisitCount();
        int orderCount = customer.getOrderCount();
        String name = customer.getName();

        int discountInPercentage = calculateDiscount(visitCount, orderCount);
       Discount discount = new Discount();
       discount.setCustomerName(name);
       discount.setDiscount(String.valueOf(discountInPercentage));
       return discount;
    }
    private  int calculateDiscount(int visitCount, int OrderCount){
        int totalCount = visitCount + OrderCount;
        if (totalCount >= 1000){
            return 50;
        }if (totalCount >= 750){
            return 40;
        }if (totalCount >= 500){
            return 30;
        }if (totalCount >= 250){
            return 20;
        }if (totalCount >= 100){
            return 10;
        }
        return 0;
    }
}
