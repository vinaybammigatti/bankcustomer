public class Bank_Customer {
    private String custName;
    private String customerId;
    private String customerAddress;

    public Bank_Customer(String custName, String customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    // Getters (optional)
    public String getCustName() {
        return custName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    @Override
    public String toString() {
        return "Bank_Customer{" +
                "custName='" + custName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}

