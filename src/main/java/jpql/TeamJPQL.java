package jpql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeamJPQL {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private List<MemberJPQL> members = new ArrayList<>();

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

    public List<MemberJPQL> getMembers() {
        return members;
    }

    public void setMembers(List<MemberJPQL> members) {
        this.members = members;
    }
}
