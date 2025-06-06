public abstract class requestProduct {
    private String priority;
    private String expireDay;
    private String status;

    public requestProduct(String priority, String expireDay, String status) {
        this.priority = priority;
        this.expireDay = expireDay;
        this.status = status;
    }

    public String setPrioriy() {
        return priority;
    };

    public String setExpire() {
        return expireDay;
    };

    public String setStatus() {
        return status;
    };

    public abstract String processRequest();
}