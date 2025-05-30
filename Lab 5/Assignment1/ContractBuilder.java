public interface ContractBuilder {
    void BuildContractID(String ContractID);

    void BuildPropertyID(String PropertyID);

    void BuidlTenatID(String TenantID);

    void BuildRentAmount(int RentAmount);

    Contract SignContract();

}