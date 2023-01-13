package oops.Assignment.Discount.Service;

import oops.Assignment.Discount.Customer;
import oops.Assignment.Discount.NameGenerator;
import oops.Assignment.Discount.OrderCountGenerator;
import oops.Assignment.Discount.VisitCountGenerator;

import java.util.UUID;

public class CustomerService {
        public static final int LIMIT = 100;
        public Customer[] getAllCustomers(){
            Customer[] customers = new Customer[LIMIT];
            for (int i = 0; i < LIMIT; i++){
                Customer customer = buildCustomer();
                customers[0] = customer;
            }
            return customers;
        }
        private Customer buildCustomer(){
            Customer customer = new Customer();
            customer.setId(UUID.randomUUID());
            customer.setName(NameGenerator.getName());
            customer.setOrderCount(OrderCountGenerator.getOrderCount());
            customer.setVisitCount(VisitCountGenerator.getVisitCount());
            return customer;
        }
}
