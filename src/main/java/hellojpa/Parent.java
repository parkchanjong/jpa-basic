package hellojpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Parent {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Chlid> chlidList = new ArrayList<>();

    public void addChlid(Chlid chlid) {
        chlidList.add(chlid);
        chlid.setParent(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Chlid> getChlidList() {
        return chlidList;
    }

    public void setChlidList(List<Chlid> chlidList) {
        this.chlidList = chlidList;
    }
}
