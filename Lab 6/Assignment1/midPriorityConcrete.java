public class midPriorityConcrete extends requestProduct {

    public midPriorityConcrete() {
        super("Medium", "06/07/2025", "Accepted");
    }

    @Override
    public String processRequest() {
        return "Request accepted estimated completion date is 06/07/2025";
    }

}