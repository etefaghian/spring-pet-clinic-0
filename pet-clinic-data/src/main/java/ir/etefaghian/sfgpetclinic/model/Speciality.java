package ir.etefaghian.sfgpetclinic.model;



import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
public class Speciality extends  BaseEntity {

    private  String description;






}
