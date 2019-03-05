package ir.etefaghian.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name= "types")
public class PetType extends BaseEntity
    {

    private String name;


    @OneToMany(mappedBy = "")
    private List<Pet> pets;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
