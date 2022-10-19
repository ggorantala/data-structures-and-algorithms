package classes.student;

public class Address {
    private final String streetName;
    private final String nearBy;
    private final String city;
    private final String state;
    private final String country;
    private final Long pinCode;

    public Address(String streetName, String nearBy, String city, String state, String country, Long pinCode) {
        this.streetName = streetName;
        this.nearBy = nearBy;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}
