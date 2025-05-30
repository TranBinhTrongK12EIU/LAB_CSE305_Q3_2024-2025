public class Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    public Contract(String contractID, String propertyID, String tenantID, int rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public String getContractID() {
        return contractID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    @Override
    public String toString() {
        return "Contract [contractID= " + contractID + ", propertyID= " + propertyID + ", tenantID= " + tenantID
                + ", rentAmount= " + rentAmount + "]\n";
    }

}