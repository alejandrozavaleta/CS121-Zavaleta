package Activity36;

import java.util.ArrayList;

class CustomerRecord {
    private ArrayList<Customer> customers;

    // constructor
    public CustomerRecord() {
        customers = new ArrayList<>();
    }

    // method to add Customers to the list
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // method to return all Customers' info using StringBuilder
    public String getAllCustomers() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append("Name: ").append(customer.getName()).append(", Email: ").append(customer.getEmail())
                    .append("\n");
        }
        return sb.toString();
    }
}

