import java.util.*;

public class Client {
    ArrayList<Contract> listOfContract;

    public Client() {
        this.listOfContract = new ArrayList<Contract>();
    }

    public void requestCreateRentalContract() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ContractID: ");
        String contractID = sc.nextLine();
        System.out.print("Enter PropertyID: ");
        String propertyID = sc.nextLine();
        System.out.print("Enter TenantID: ");
        String tenantID = sc.nextLine();
        System.out.print("Enter RentAmount: ");
        int rentAmount = sc.nextInt();
        listOfContract.add(new Contract(contractID, propertyID, tenantID, rentAmount));
    }
}