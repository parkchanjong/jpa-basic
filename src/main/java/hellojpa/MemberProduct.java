package hellojpa;

import javax.persistence.*;

@Entity
public class MemberProduct {

    @Id
    @GeneratedValue
    private String id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member2 member;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member2 getMember() {
        return member;
    }

    public void setMember(Member2 member) {
        this.member = member;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
