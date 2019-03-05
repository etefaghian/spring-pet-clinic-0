package ir.etefaghian.sfgpetclinic.model;


import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends  BaseEntity {


    private String firstName;
    private  String lastName;

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
