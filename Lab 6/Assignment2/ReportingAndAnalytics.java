import java.util.List;

class PropertyInfo {
    private String name;
    private double rentAmount;
    private String location;

    public PropertyInfo(String name, double rentAmount, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRentAmount() {
        return rentAmount;
    }
}

class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return name;
    }
}

class Property {
    private String name;
    private double rentAmount;
    private String ownerName;
    private String location;
    private String propertyClass;
    private double yearlyRent;

    public Property(PropertyInfo pi, Owner o) { // Constructor with a data clump
        this.name = pi.getName();
        this.rentAmount = pi.getRentAmount();
        this.location = pi.getLocation();
        this.ownerName = o.getOwnerName();
        if (rentAmount > 2000) {
            this.propertyClass = "premium";
        } else
            this.propertyClass = "standard";
        this.yearlyRent = rentAmount * 12;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public String getPropertyClass() {
        return propertyClass;
    }

    public double getYearlyRent() {
        return yearlyRent;
    }
}

class PropertyPrinter {
    public void printPropertyDetails(Property property) {
        System.out.println("Property: " + property.getName());
        System.out.println("Rent Amount: $" + property.getRentAmount());
        System.out.println("Owner: " + property.getOwnerName());
        System.out.println("Location: " + property.getLocation());
    }
}

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public List<Property> getReportListProperty() {
        return properties;
    }

}

class FinancialReportGenerator {
    public void generateReport(FinancialReport fr) {
        double totalRent = 0;
        System.out.println("Financial Report: " + fr.getReportTitle());
        System.out.println("----------------------------");
        PropertyPrinter printer = new PropertyPrinter();
        for (Property property : fr.getReportListProperty()) {
            printer.printPropertyDetails(property);
            totalRent += property.getRentAmount();
            System.out.println("This is a " + property.getPropertyClass() + " property.");
            System.out.println("Yearly Rent: $" + property.getYearlyRent());
            System.out.println("--------------------");
        }
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

public class ReportingAndAnalytics {
    public static void main(String[] args) {
        Property property1 = new Property(new PropertyInfo("Apartment A", 1500.0, "City Center"),
                new Owner("John Doe"));
        Property property2 = new Property(new PropertyInfo("House B", 2000.0, "Suburb"), new Owner("Jane Smith"));
        Property property3 = new Property(new PropertyInfo("Condo C", 1800.0, "Downtown"), new Owner("Bob Johnson"));

        FinancialReport financialReport = new FinancialReport("Monthly Rent Summary",
                List.of(property1, property2, property3));
        new FinancialReportGenerator().generateReport(financialReport);
    }
}