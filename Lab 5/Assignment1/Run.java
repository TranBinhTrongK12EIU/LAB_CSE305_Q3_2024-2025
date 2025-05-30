import java.util.*;

public class Run {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Client c1 = new Client();
        c1.requestCreateRentalContract();
        for (var i = 0; i < c1.listOfContract.size(); i++) {
            sb.append(c1.listOfContract.get(i).toString());
        }
        System.out.println(sb);
    }
}