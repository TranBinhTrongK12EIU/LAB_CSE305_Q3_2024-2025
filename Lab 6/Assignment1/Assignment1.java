import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Which type of request? (Capitilise the first letter)");
        String type = scanner.nextLine();
        switch (type) {
            case "Low":
                RequestCreator lowRequestCreator = new lowPriorityConcreteCreator();
                requestProduct lowRequest = lowRequestCreator.createRequest();
                sb.append("Type: Low Priority\n")
                        .append("Priority: " + lowRequest.setPrioriy() + "\n")
                        .append("Expire Day: " + lowRequest.setExpire() + "\n")
                        .append("Status: " + lowRequest.setStatus() + "\n")
                        .append("Process request: " + lowRequest.processRequest() + "\n");
                break;
            case "Mid":
                RequestCreator midRequestCreator = new midPriorityConcreteCreator();
                requestProduct midRequest = midRequestCreator.createRequest();
                sb.append("Type: Mid Priority\n")
                        .append("Priority: " + midRequest.setPrioriy() + "\n")
                        .append("Expire Day: " + midRequest.setExpire() + "\n")
                        .append("Status: " + midRequest.setStatus() + "\n")
                        .append("Process request: " + midRequest.processRequest() + "\n");
                break;
            case "High":
                RequestCreator highRequestCreator = new highPriorityConcreteCreator();
                requestProduct highRequest = highRequestCreator.createRequest();
                sb.append("Type: Low Priority\n")
                        .append("Priority: " + highRequest.setPrioriy() + "\n")
                        .append("Expire Day: " + highRequest.setExpire() + "\n")
                        .append("Status: " + highRequest.setStatus() + "\n")
                        .append("Process request: " + highRequest.processRequest() + "\n");
                break;
        }
        System.out.println(sb);
        scanner.close();
    }
}
