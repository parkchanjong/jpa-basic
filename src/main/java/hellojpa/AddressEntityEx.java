package hellojpa;

import javax.persistence.*;

@Entity
public class AddressEntityEx {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private AddressEx address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AddressEx getAddress() {
        return address;
    }

    public void setAddress(AddressEx address) {
        this.address = address;
    }
}
