public class lowPriorityConcrete extends requestProduct {

    public lowPriorityConcrete() {
        super("Ignore", "06/06/2025", "Done");
    }

    @Override
    public String processRequest() {
        return "Request denied";
    }

}
