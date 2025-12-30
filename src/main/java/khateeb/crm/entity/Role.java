package khateeb.crm.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="roles")
public class Role {
    @Id
    private long id;
    private String name;

    @ManyToMany(mappedBy = "user")
    private Set<User> users = new HashSet<>();
}
