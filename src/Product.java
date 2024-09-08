public class Product {
    private String name;
    private String description;
    private String ID;
    private double cost;

    public Product(String name, String description, String ID, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toCSV(){
        return name + "," + description + "," + ID + "," + cost;
    }

    public String toJSon(){
        return "{'Name':'" + name + "', 'Description':'" + description + "', 'ID':'" + ID + "', 'Cost':'" + cost + "'}";
    }

    public String toXML(){
        return "<person>\n\t <Name>" + name + "</Name>\n\t <Description>" + description + "</Description>\n\t<ID>" + ID + "</ID>\n\t<Cost>" + cost + "</Cost>\n</person>";
    }
}
