import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    // Getters for message properties
    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

}

class MessagePrinter {

    public void printSummary(Message ms) {
        System.out.println("Content: " + ms.getContent());
        System.out.println("Sender: " + ms.getSender());
        System.out.println("Recipient: " + ms.getRecipient());
    }

    public void printDetails(Message ms) {
        System.out.println("Content Length: " + ms.getContent().length());
        System.out.println("Sender Uppercase: " + ms.getSender().toUpperCase());
        System.out.println("Recipient Lowercase: " + ms.getRecipient().toLowerCase());
    }
}

class MessagingService {
    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public Map<String, List<Message>> getList() {
        return inbox;
    }

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(message.getRecipient(), k -> new ArrayList<>()).add(message);
    }

}

class MessagingServicePrinter {

    public void getMessagesForRecipient(String recipient, MessagingService mService) {
        List<Message> listForRecipent = mService.getList().getOrDefault(recipient, new ArrayList<>());
        for (Message ms : listForRecipent) {
            System.out.println("From: " + ms.getSender() + ", Content: " + ms.getContent());
        }
    }

    public void printAllMessages(MessagingService mService) {
        MessagePrinter printer = new MessagePrinter();
        for (String recipient : mService.getList().keySet()) {
            for (Message message : mService.getList().get(recipient)) {
                printer.printSummary(message);
            }
        }
    }
}

public class CommunicationAndMessaging {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        // sending messages
        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

        // retrieving messages for a recipient
        MessagingServicePrinter messagingServicePrinting = new MessagingServicePrinter();
        messagingServicePrinting.getMessagesForRecipient("Tenant A", messagingService);

        // Calling the new method
        Message exampleMessage = new Message("Test", "Sender",
                "Recipient");
        MessagePrinter mPrint = new MessagePrinter();
        mPrint.printDetails(exampleMessage);
        messagingServicePrinting.printAllMessages(messagingService);
    }
}