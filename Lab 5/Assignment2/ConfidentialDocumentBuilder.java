public class ConfidentialDocumentBuilder implements DocumentBuilder {
    private Document doc = new Document();

    public void setExtension() {
        doc.setExtension(".zip");
    }

    public void setEncryption() {
        doc.setEncryption("AES");
    }

    public Document getDocument() {
        return doc;
    }
}