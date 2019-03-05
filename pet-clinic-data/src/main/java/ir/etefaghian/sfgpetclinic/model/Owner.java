package ir.etefaghian.sfgpetclinic.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner extends  Person{


    private String address;
    private String city;
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private List<Vet> vets;


}
