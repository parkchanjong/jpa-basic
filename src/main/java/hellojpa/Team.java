package hellojpa;

import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @BatchSize(size = 100)
    @OneToMany(mappedBy = "team")
    List<MemberEx> members = new ArrayList<>();

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

    public List<MemberEx> getMembers() {
        return members;
    }

    public void setMembers(List<MemberEx> members) {
        this.members = members;
    }

    public void addMember(MemberEx member) {
        member.setTeam(this);
        members.add(member);
    }
}
