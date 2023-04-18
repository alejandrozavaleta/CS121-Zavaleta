package Activity36;

class Test {
    public static void main(String[] args) {
        // Create an instance of CustomerRecord class
        CustomerRecord customerRecord = new CustomerRecord();

        // Add Customers to the list
        customerRecord.addCustomer(new Customer("John Doe", "john.doe@example.com"));
        customerRecord.addCustomer(new Customer("Jane Smith", "jane.smith@example.com"));

        // Call the getAllCustomers() method and print the String it returns
        String allCustomersInfo = customerRecord.getAllCustomers();
        System.out.println(allCustomersInfo);
    }
}