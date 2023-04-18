package hibernate_many_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")

public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST
            , CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(
            name = "child_section"
            , joinColumns = @JoinColumn(name = "section_id")
            , inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private List<Cihld> cihldren;

    public Section() {
    }

    public Section(String name) {
        this.name = name;
    }

    public void addChildToSaction(Cihld child) {
        if (cihldren == null) {
            cihldren = new ArrayList<>();
        }
        cihldren.add(child);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cihld> getCihldren() {
        return cihldren;
    }

    public void setCihldren(List<Cihld> cihldren) {
        this.cihldren = cihldren;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
