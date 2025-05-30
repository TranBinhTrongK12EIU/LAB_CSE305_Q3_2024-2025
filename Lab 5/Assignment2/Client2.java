public class Client2 {
    public static void main(String[] args) {
        Director director = new Director();

        DocumentBuilder normalBuilder = new NormalDocumentBuilder();
        director.construct(normalBuilder);
        Document normalDoc = normalBuilder.getDocument();
        normalDoc.showInfo();

        DocumentBuilder confidentialBuilder = new ConfidentialDocumentBuilder();
        director.construct(confidentialBuilder);
        Document confidentialDoc = confidentialBuilder.getDocument();
        confidentialDoc.showInfo();
    }
}