public class ShortTerm implements ContractBuilder{
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;
    
    @Override
    public void BuidlTenatID(String tenantID) {
        this.tenantID = tenantID;
    }
    @Override
    public void BuildContractID(String contractID) {
       this.contractID = contractID;
    }
    @Override
    public void BuildPropertyID(String propertyID) {
        this.propertyID = propertyID;       
    }
    @Override
    public void BuildRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;        
    }
    @Override
    public Contract SignContract() {
        return new Contract(contractID, propertyID, tenantID, rentAmount);
    }

    
}