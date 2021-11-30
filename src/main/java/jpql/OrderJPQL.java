package jpql;

import javax.persistence.*;

@Entity
public class OrderJPQL {

    @Id
    @GeneratedValue
    private Long id;

    private int orderAmount;

    @Embedded
    private AddressJPQL address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private ProductJPQL product;

    public AddressJPQL getAddress() {
        return address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setAddress(AddressJPQL address) {
        this.address = address;
    }

    public ProductJPQL getProduct() {
        return product;
    }

    public void setProduct(ProductJPQL product) {
        this.product = product;
    }
}
