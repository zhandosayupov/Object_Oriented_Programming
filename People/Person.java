package People;

public class Person {
    private String name, address;

    public Person (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Person[name=" + name + "," + "address=" + address + "]";
    }
}