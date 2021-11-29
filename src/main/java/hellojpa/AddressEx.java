package hellojpa;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class AddressEx {

    private String city;
    private String street;
    private String zipcode;

    public AddressEx() {
    }

    public AddressEx(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEx addressEx = (AddressEx) o;
        return Objects.equals(city, addressEx.city) && Objects.equals(street, addressEx.street) && Objects.equals(zipcode, addressEx.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipcode);
    }
}
