public class highPriorityConcrete extends requestProduct {

    public highPriorityConcrete() {
        super("Emergency", "06/06/2025", "Accept");
    }

    @Override
    public String processRequest() {
        return "Emergency request, our Administer will contact you immediately !";
    }

}