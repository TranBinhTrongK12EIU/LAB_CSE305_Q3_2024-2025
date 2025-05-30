public class Document {
    private String extension;
    private String encryption;

    public void setExtension(String ext) {
        this.extension = ext;
    }

    public void setEncryption(String enc) {
        this.encryption = enc;
    }

    public void showInfo() {
        System.out.println("Extension: " + extension);
        System.out.println("Encryption: " + encryption);
    }
}