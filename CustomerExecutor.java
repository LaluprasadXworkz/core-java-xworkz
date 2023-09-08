public class CustomerExecutor {    
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setCustomerId(1);
        System.out.println("Customer Id: " + customer.getCustomerId());

        customer.setCustomerName("Krishna");
        System.out.println("Customer Name: " + customer.getCustomerName());

        customer.setAddress("Basam Circle");
        System.out.println("Customer Address: " + customer.getAddress());

        customer.setCustomerNumber(9876352410L);
        System.out.println("Customer Number: " + customer.getCustomerNumber());

        customer.setMailId("Krishna@gmail.com");
        System.out.println("Customer Mail Id: " + customer.getMailId());

        customer.setDob("06-09-2023");
        System.out.println("Customer Date of Birth: " + customer.getDob());

        customer.setGender("Boy");
        System.out.println("Customer Gender: " + customer.getGender());
    }
}
