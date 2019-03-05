package ir.etefaghian.sfgpetclinic.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Vet extends Person {


    @ManyToMany(fetch =  FetchType.EAGER)
    @JoinTable(name = "vets_specialities",joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;





}
