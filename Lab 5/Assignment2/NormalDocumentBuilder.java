public class NormalDocumentBuilder implements DocumentBuilder {
    private Document doc = new Document();

    public void setExtension() {
        doc.setExtension(".txt");
    }

    public void setEncryption() {
        doc.setEncryption("None");
    }

    public Document getDocument() {
        return doc;
    }
}